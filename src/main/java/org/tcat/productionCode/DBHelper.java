package org.tcat.productionCode;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * 数据库连接对象
 * Created by Lin on 2016/8/24.
 */
public class DBHelper {

    public Connection conn;
    public PreparedStatement pst = null;

    public DBHelper() {
        try {
            Properties properties = new Properties();
            properties.load(ClassLoader.getSystemResourceAsStream("db.properties"));
            String url = properties.get("jdbc.url").toString();
            String driver = properties.get("jdbc.driver").toString();
            String user = properties.get("jdbc.username").toString();
            String password = properties.get("jdbc.password").toString();
            Class.forName(driver);//指定连接类型
            conn = DriverManager.getConnection(url, user, password);//获取连接
        } catch (FileNotFoundException e) {
            throw new RuntimeException("文件找不到", e);
        } catch (IOException e) {
            throw new RuntimeException("IO异常", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("驱动类找不到", e);
        } catch (SQLException e) {
            throw new RuntimeException("SQL异常", e);
        }
    }

    public synchronized ResultSet getResultSet(String sql) {
        try {
            pst = conn.prepareStatement(sql);//准备执行语句
            return pst.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException("SQL异常", e);
        }
    }

    /**
     * 关闭数据库
     */
    public synchronized void close() {
        try {
            if (conn != null) {
                conn.close();
            }
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        DBHelper dbHelper = new DBHelper();
        try {
            ResultSet ret = dbHelper.getResultSet("show full columns from `tbl_login`");//执行语句，得到结果集
            while (ret.next()) {
                String fieId = ret.getString(1);
                String type = ret.getString(2).split("\\(")[0];
                String Comment = ret.getString(9);
                System.out.println(fieId + "\t" + type + "\t" + Comment);
            }//显示数据
            ret.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbHelper.close();
        }
    }

}
