package com.github.lambdaexpression.dal.user.query;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表 查询对象类
 *
 * @author Lin
 * @since 2019-03-08
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserQuery implements Serializable{

	/**
	 * 序列化id
	 */
	private static final long serialVersionUID = 1L;

    /**
     * id
     */
	private Integer id;
    /**
     * 名称
     */
	private String name;
    /**
     * 小于等于 名称
     */
    private String nameLike;
    /**
     * 密码
     */
	private String password;
    /**
     * 小于等于 密码
     */
    private String passwordLike;
    /**
     * 创建人
     */
	private Long createBy;
    /**
     * 创建时间
     */
	private Date createDate;
    /**
     * 小于等于 创建时间
     */
    private Date createDateLte;
    /**
     * 大于 创建时间
     */
    private Date createDateGt;
    /**
     * 更新人
     */
	private Long updateBy;
    /**
     * 更新时间
     */
	private Date updateDate;
    /**
     * 小于等于 更新时间
     */
    private Date updateDateLte;
    /**
     * 大于 更新时间
     */
    private Date updateDateGt;

}
