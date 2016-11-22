package dbUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * tbl_client表对象
 *
 * @Author Lin 2016年09月09日
 *
 */
public class Client implements Serializable{

	/**
	 * 序列化id
	 */
	private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long id;
    /**
     * 分组ID(表tbl_group的id)
     */
    private Integer groupId;
    /**
     * 客户名称(或公司名称)
     */
    private String clientName;
    /**
     * 省ID
     */
    private Integer provinceId;
    /**
     * 市ID
     */
    private Integer cityId;
    /**
     * 区ID
     */
    private Integer areaId;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 区
     */
    private String area;
    /**
     * 街道(详细地址)
     */
    private String street;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机
     */
    private String phone;
    /**
     * QQ
     */
    private String qq;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 联系电话(区号-座机号)
     */
    private String telephone;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

	/**
	 * 获取 ID
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置 ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取 分组ID(表tbl_group的id)
	 */
	public Integer getGroupId() {
		return groupId;
	}

	/**
	 * 设置 分组ID(表tbl_group的id)
	 */
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	/**
	 * 获取 客户名称(或公司名称)
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * 设置 客户名称(或公司名称)
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * 获取 省ID
	 */
	public Integer getProvinceId() {
		return provinceId;
	}

	/**
	 * 设置 省ID
	 */
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	/**
	 * 获取 市ID
	 */
	public Integer getCityId() {
		return cityId;
	}

	/**
	 * 设置 市ID
	 */
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	/**
	 * 获取 区ID
	 */
	public Integer getAreaId() {
		return areaId;
	}

	/**
	 * 设置 区ID
	 */
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	/**
	 * 获取 省
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * 设置 省
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * 获取 市
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 设置 市
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 获取 区
	 */
	public String getArea() {
		return area;
	}

	/**
	 * 设置 区
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * 获取 街道(详细地址)
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * 设置 街道(详细地址)
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * 获取 姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置 姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取 手机
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置 手机
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 获取 QQ
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * 设置 QQ
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * 获取 邮箱
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置 邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取 联系电话(区号-座机号)
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * 设置 联系电话(区号-座机号)
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * 获取 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取 更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置 更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


	/**
	 * 获取全部变量
	 * @return
	 */
    public String[] obtainColumns() {
		return new String[] {
            "id",
            "groupId",
            "clientName",
            "provinceId",
            "cityId",
            "areaId",
            "province",
            "city",
            "area",
            "street",
            "name",
            "phone",
            "qq",
            "email",
            "telephone",
            "createTime",
            "updateTime"
		};
	}

	@Override
	public String toString() {
		return "Client{" +
				    "id=" + id + "," +
				    "groupId=" + groupId + "," +
				    "clientName=" + clientName + "," +
				    "provinceId=" + provinceId + "," +
				    "cityId=" + cityId + "," +
				    "areaId=" + areaId + "," +
				    "province=" + province + "," +
				    "city=" + city + "," +
				    "area=" + area + "," +
				    "street=" + street + "," +
				    "name=" + name + "," +
				    "phone=" + phone + "," +
				    "qq=" + qq + "," +
				    "email=" + email + "," +
				    "telephone=" + telephone + "," +
				    "createTime=" + createTime + "," +
				    "updateTime=" + updateTime + 
				'}';
	}

}
