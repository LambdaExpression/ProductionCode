package org.tcat.productionCode;


import org.apache.commons.lang3.StringUtils;
import org.tcat.productionCode.vo.TableVariableTypeVo;
import org.tcat.productionCode.vo.TableVariableVo;
import org.tcat.productionCode.vo.TableVo;
import org.tcat.tools.StringTool;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 解析tableVo数据
 * Created by Lin on 2016/9/9.
 */
public class TabelData {

    /**
     * 作者名字
     */
    private final static String user = "Lin";

    private TabelData() {

    }

    public static TableVo getData(String tblName) {
        return getData("",tblName, null);
    }

    /**
     * 获取tableVo数据
     *
     * @param tblName      表名
     * @param filterString 过滤表前缀
     * @return
     */
    public static TableVo getData(String packagePath,String tblName, String filterString) {
        String showFull = new StringBuilder("show full columns from `").append(tblName).append("`").toString();
        String showTable = new StringBuilder("SHOW CREATE TABLE `").append(tblName).append("`").toString();
        DBHelper dbHelper = new DBHelper();
        ResultSet ret = null;
        TableVo tableVo = new TableVo();
        tableVo.setPackagePath(packagePath);
        try {
            //获取表注释
            ret = dbHelper.getResultSet(showTable);
            ret.next();
            String[] cos = ret.getString(2).split("COMMENT='");
            tableVo.setTblNameComment(cos.length == 1 ? null : cos[1].substring(0, cos[1].length() - 1));

            ret = dbHelper.getResultSet(showFull);
            List<TableVariableVo> tableVariableVoList = new ArrayList<>();
            TableVariableTypeVo tableVariableTypeVo = new TableVariableTypeVo();
            while (ret.next()) {
                TableVariableVo tableVariableVo = new TableVariableVo();
                tableVariableVo.setVariable(ret.getString(1));
                tableVariableVo.setType(getType(ret.getString(2).split("\\(")[0]));
                if (!"".equals(ret.getString(9))) {
                    tableVariableVo.setVariableComment(ret.getString(9));
                }
                if ("id".equals(tableVariableVo.getVariable().toLowerCase())) {
                    tableVariableTypeVo.setIdType(tableVariableVo.getType());
                } else if ("createTime".equals(tableVariableVo.getVariable().toLowerCase())) {
                    tableVariableTypeVo.setHasCreateTime(true);
                } else if ("updateTime".equals(tableVariableVo.getVariable().toLowerCase())) {
                    tableVariableTypeVo.setHasUpdateTime(true);
                }
                if ("Date".equals(tableVariableVo.getType())) {
                    tableVariableTypeVo.setHasDateClass(true);
                } else if ("BigDecimal".equals(tableVariableVo.getType())) {
                    tableVariableTypeVo.setHasBigDecimalClass(true);
                }
                if (!StringTool.isEmptyByTrim(ret.getString("Key"))&& StringUtils.equals("PRI",ret.getString("Key"))) {
                    tableVariableVo.setPrimaryKey(true);
                }
                tableVariableVoList.add(tableVariableVo);
            }
            tableVo.setTableVariableList(tableVariableVoList);
            tableVo.setTableVariableType(tableVariableTypeVo);

            tableVo.setTblName(tblName);
            //这里的表前缀都是tbl_，这里过滤一下
            if (!StringTool.isEmptyByTrim(filterString)) {
                String tblNameReplace = tblName.replace(filterString, "");
                tableVo.setTblNameUppercase(StringTool.initials(tblNameReplace));
                tableVo.setTblNameLowercase(StringTool.initialsExceptFirst(tblNameReplace));
            }
            tableVo.setDate(new Date());
            tableVo.setUser(user);

        } catch (SQLException e) {
            throw new RuntimeException("SQL异常", e);
        } finally {
            if (ret != null) {
                try {
                    ret.close();
                } catch (SQLException e) {
                    throw new RuntimeException("SQL异常", e);
                }
            }
            dbHelper.close();
        }

        return tableVo;
    }


    /**
     * 获取类型值
     *
     * @param type
     * @return
     */
    private static String getType(String type) {
        if ("tinyint".equals(type) || "bit".equals(type)) {
            return "Byte";
        } else if ("smallint".equals(type)) {
            return "Short";
        } else if ("int".equals(type) || "mediumint".equals(type)) {
            return "Integer";
        } else if ("bigint".equals(type)) {
            return "Long";
        } else if ("float".equals(type) || "double".equals(type) || "decimal".equals(type) || "float unsigned".equals(type) || "double unsigned".equals(type)) {
            return "BigDecimal";
        } else if ("varchar".equals(type) || "longtext".equals(type) || "text".equals(type)) {
            return "String";
        } else if ("datetime".equals(type) || "timestamp".equals(type) || "date".equals(type)) {
            return "Date";
        } else {
            throw new RuntimeException(new StringBuilder("类型无法匹配 ： ").append(type).toString());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("E:\\class.txt")));
        String str = "Service</a></li>";
        List<String> text = new ArrayList<>();
        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.indexOf(str) != -1)
                text.add(line);
            else
                text.add(new StringBuilder().append("<!-- ").append(line).append(" -->").toString());
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\out\\class.txt"));
        for (String t : text) {
            bw.write(t);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();

    }


}
