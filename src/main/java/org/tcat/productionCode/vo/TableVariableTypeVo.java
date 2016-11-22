package org.tcat.productionCode.vo;

import java.io.Serializable;

/**
 * 变量参数类型
 * Created by Lin on 2016/9/8.
 */
public class TableVariableTypeVo implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 1L;
    /**
     * id类型 <br/> 不等于null时，有id
     */
    private String idType;
    /**
     * 是否有创建时间<br/> 有：true；无：false
     */
    private Boolean hasCreateTime = false;
    /**
     * 是否有更新时间<br/> 有：true；无：false
     */
    private Boolean hasUpdateTime = false;
    /**
     * 是否有使用Data.Class<br/> 有：true；无：false
     */
    private Boolean hasDateClass = false;
    /**
     * 是否有使用BigDecimal.Class<br/> 有：true；无：false
     */
    private Boolean hasBigDecimalClass = false;

    /**
     * 获取 id类型 <br/> 不等于null时，有id
     *
     * @return
     */
    public String getIdType() {
        return idType;
    }

    /**
     * 设置 id类型 <br/> 不等于null时，有id
     *
     * @param idType
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * 获取 是否有创建时间<br/> 有：true；无：false
     *
     * @return
     */
    public Boolean getHasCreateTime() {
        return hasCreateTime;
    }

    /**
     * 设置 是否有创建时间<br/> 有：true；无：false
     *
     * @param hasCreateTime
     */
    public void setHasCreateTime(Boolean hasCreateTime) {
        this.hasCreateTime = hasCreateTime;
    }

    /**
     * 获取 是否有更新时间<br/> 有：true；无：false
     *
     * @return
     */
    public Boolean getHasUpdateTime() {
        return hasUpdateTime;
    }

    /**
     * 设置 是否有更新时间<br/> 有：true；无：false
     *
     * @param hasUpdateTime
     */
    public void setHasUpdateTime(Boolean hasUpdateTime) {
        this.hasUpdateTime = hasUpdateTime;
    }

    /**
     * 获取 是否有使用Data.Class<br/> 有：true；无：false
     *
     * @return
     */
    public Boolean getHasDateClass() {
        return hasDateClass;
    }

    /**
     * 设置 是否有使用Data.Class<br/> 有：true；无：false
     *
     * @param hasDateClass
     */
    public void setHasDateClass(Boolean hasDateClass) {
        this.hasDateClass = hasDateClass;
    }

    /**
     * 获取 是否有使用BigDecimal.Class<br/> 有：true；无：false
     *
     * @return
     */
    public Boolean getHasBigDecimalClass() {
        return hasBigDecimalClass;
    }

    /**
     * 设置 是否有使用BigDecimal.Class<br/> 有：true；无：false
     *
     * @param hasBigDecimalClass
     */
    public void setHasBigDecimalClass(Boolean hasBigDecimalClass) {
        this.hasBigDecimalClass = hasBigDecimalClass;
    }

    @Override
    public String toString() {
        return "TableVariableTypeVo{" +
                "idType='" + idType + '\'' +
                ", hasCreateTime=" + hasCreateTime +
                ", hasUpdateTime=" + hasUpdateTime +
                ", hasDateClass=" + hasDateClass +
                ", hasBigDecimalClass=" + hasBigDecimalClass +
                '}';
    }
}
