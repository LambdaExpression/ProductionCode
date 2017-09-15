package org.tcat.productionCode.vo;


import org.tcat.tools.StringTool;

import java.io.Serializable;

/**
 * 数据库表变量参数
 * Created by Lin on 2016/9/8.
 */
public class TableVariableVo implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 1L;
    /**
     * 变量名（原名）
     */
    private String variable;
    /**
     * 变量名(转成首字母大写（空格和下划线后的字母都是首字母）)
     * <br><b>
     * seller_name -> SellerName
     * </b>
     */
    private String variableUppercase;
    /**
     * 变量名(转成首字母大写（空格和下划线后的字母都是首字母）)
     * <br><b>
     * seller_name -> Seller_name
     * </b>
     */
    private String variableUppercase2;
    /**
     * 变量名(转成首字母小写（其余的首字母大写）)
     * <br><b>
     * seller_name -> sellerName
     * </b>
     */
    private String variableLowercase;
    /**
     * 变量类型（Integer|Byte|Long|BigDecimal|String|Date）
     */
    private String type;
    /**
     * 变量注释
     */
    private String variableComment;

    /**
     * 是否主键
     */
    private Boolean isPrimaryKey = false;

    /**
     * 获取 变量名（原名）
     *
     * @return
     */
    public String getVariable() {
        return variable;
    }

    /**
     * 设置 变量名（原名）
     *
     * @param variable
     */
    public void setVariable(String variable) {
        this.variable = variable;

        if (variableUppercase == null) {
            variableUppercase = StringTool.initials(variable);
        }
        if (variableLowercase == null) {
            variableLowercase = StringTool.initialsExceptFirst(variable);
        }
        if (variableUppercase2 == null) {
            variableUppercase2 = StringTool.firstLetterUppercase(variable);
        }
    }

    /**
     * 获取 变量名(转成首字母大写（空格和下划线后的字母都是首字母）)
     * <br><b>
     * seller_name -> SellerName
     * </b>
     *
     * @return
     */
    public String getVariableUppercase() {
        return variableUppercase;
    }

    /**
     * 设置  变量名(转成首字母大写（空格和下划线后的字母都是首字母）)
     * <br><b>
     * seller_name -> SellerName
     * </b>
     *
     * @param variableUppercase
     */
    public void setVariableUppercase(String variableUppercase) {
        this.variableUppercase = variableUppercase;
    }

    /**
     * 变量名(转成首字母大写（空格和下划线后的字母都是首字母）)
     * <br><b>
     * seller_name -> Seller_name
     * </b>
     *
     * @return 变量名(转成首字母大写（空格和下划线后的字母都是首字母）)
     */
    public String getVariableUppercase2() {
        return variableUppercase2;
    }

    /**
     * 变量名(转成首字母大写（空格和下划线后的字母都是首字母）)
     * <br><b>
     * seller_name -> Seller_name
     * </b>
     *
     * @param variableUppercase2 变量名(转成首字母大写（空格和下划线后的字母都是首字母）)
     */
    public void setVariableUppercase2(String variableUppercase2) {
        this.variableUppercase2 = variableUppercase2;
    }

    /**
     * 获取 变量名(转成首字母小写（其余的首字母大写）)
     * <br><b>
     * seller_name -> sellerName
     * </b>
     *
     * @return
     */
    public String getVariableLowercase() {
        return variableLowercase;
    }

    /**
     * 设置 变量名(转成首字母小写（其余的首字母大写）)
     * <br><b>
     * seller_name -> sellerName
     * </b>
     *
     * @param variableLowercase
     */
    public void setVariableLowercase(String variableLowercase) {
        this.variableLowercase = variableLowercase;
    }

    /**
     * 获取 变量类型（Integer|Byte|Long|BigDecimal|String|Date）
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * 设置 变量类型（Integer|Byte|Long|BigDecimal|String|Date）
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取 变量注释
     *
     * @return
     */
    public String getVariableComment() {
        return variableComment;
    }

    /**
     * 设置 变量注释
     *
     * @param variableComment
     */
    public void setVariableComment(String variableComment) {
        this.variableComment = variableComment;
    }

    /**
     * 是否主键
     *
     * @return 是否主键
     */
    public Boolean getPrimaryKey() {
        return isPrimaryKey;
    }

    /**
     * 是否主键
     *
     * @param primaryKey 是否主键
     */
    public void setPrimaryKey(Boolean primaryKey) {
        isPrimaryKey = primaryKey;
    }

    @Override
    public String toString() {
        return "TableVariableVo{" +
                "variable='" + variable + '\'' +
                ", type='" + type + '\'' +
                ", variableComment='" + variableComment + '\'' +
                '}';
    }
}
