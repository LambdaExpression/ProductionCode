package org.tcat.productionCode.vo;


import org.tcat.tools.StringTool;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 数据库表参数
 * Created by Lin on 2016/9/8.
 */
public class TableVo implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 1L;
    /**
     * 表名（原名字）
     * <br><b>
     * seller_order -> seller_order
     * </b>
     */
    private String tblName;
    /**
     * 表名(转成首字母大写（空格和下划线后的字母都是首字母）)
     * <br><b>
     * seller_order -> SellerOrder
     * </b>
     */
    private String tblNameUppercase;
    /**
     * 表名(转成首字母小写（其余的首字母大写）)
     * <br><b>
     * seller_order -> sellerOrder
     * </b>
     */
    private String tblNameLowercase;
    /**
     * 时间
     */
    private Date date;
    /**
     * 作者
     */
    private String user;
    /**
     * 表注解
     */
    private String tblNameComment;

    /**
     * 数据库表变量参数
     */
    private List<TableVariableVo> tableVariableList;

    /**
     * 数据库表变量参数类型
     */
    private TableVariableTypeVo tableVariableType;

    /**
     * 获取 表名（原名字）
     * <br><b>
     * seller_order -> seller_order
     * </b>
     *
     * @return
     */
    public String getTblName() {
        return tblName;
    }

    /**
     * 设置 表名（原名字）
     * <br><b>
     * seller_order -> seller_order
     * </b>
     *
     * @param tblName
     */
    public void setTblName(String tblName) {
        this.tblName = tblName;
        if (tblNameUppercase == null) {
            tblNameUppercase = StringTool.initials(tblName);
        }
        if (tblNameLowercase == null) {
            tblNameLowercase = StringTool.initialsExceptFirst(tblName);
        }
    }

    /**
     * 获取 表名(转成首字母大写（空格和下划线后的字母都是首字母）)
     * <br><b>
     * seller_order -> SellerOrder
     * </b>
     *
     * @return
     */
    public String getTblNameUppercase() {
        return tblNameUppercase;
    }


    /**
     * 设置 表名(转成首字母大写（空格和下划线后的字母都是首字母）)
     * <br><b>
     * seller_order -> SellerOrder
     * </b>
     *
     * @param tblNameUppercase
     */
    public void setTblNameUppercase(String tblNameUppercase) {
        this.tblNameUppercase = tblNameUppercase;
    }

    /**
     * 获取 表名(转成首字母小写（其余的首字母大写）)
     * <br><b>
     * seller_order -> sellerOrder
     * </b>
     *
     * @return
     */
    public String getTblNameLowercase() {
        return tblNameLowercase;
    }

    /**
     * 设置 表名(转成首字母小写（其余的首字母大写）)
     * <br><b>
     * seller_order -> sellerOrder
     * </b>
     *
     * @param tblNameLowercase
     */
    public void setTblNameLowercase(String tblNameLowercase) {
        this.tblNameLowercase = tblNameLowercase;
    }

    /**
     * 获取 时间
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置 时间
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取 作者
     *
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     * 设置 作者
     *
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 获取 表注解
     *
     * @return
     */
    public String getTblNameComment() {
        return tblNameComment;
    }

    /**
     * 设置 表注解
     *
     * @param tblNameComment
     */
    public void setTblNameComment(String tblNameComment) {
        this.tblNameComment = tblNameComment;
    }

    /**
     * 获取 数据库表变量参数
     *
     * @return
     */
    public List<TableVariableVo> getTableVariableList() {
        return tableVariableList;
    }

    /**
     * 设置 数据库表变量参数
     *
     * @param tableVariableList
     */
    public void setTableVariableList(List<TableVariableVo> tableVariableList) {
        this.tableVariableList = tableVariableList;
    }

    /**
     * 获取 数据库表变量参数类型
     *
     * @return
     */
    public TableVariableTypeVo getTableVariableType() {
        return tableVariableType;
    }

    /**
     * 设置 数据库表变量参数类型
     *
     * @param tableVariableType
     */
    public void setTableVariableType(TableVariableTypeVo tableVariableType) {
        this.tableVariableType = tableVariableType;
    }

    @Override
    public String toString() {
        return "TableVo{" +
                "tblName='" + tblName + '\'' +
                ", tblNameUppercase='" + tblNameUppercase + '\'' +
                ", tblNameLowercase='" + tblNameLowercase + '\'' +
                ", date=" + date +
                ", user='" + user + '\'' +
                ", tblNameComment='" + tblNameComment + '\'' +
                ", tableVariableList=" + tableVariableList +
                ", tableVariableType=" + tableVariableType +
                '}';
    }
}
