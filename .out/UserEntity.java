package com.github.lambdaexpression.dal.user.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表 对象类
 *
 * @author Lin
 * @since 2019-03-08
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("`user$user`")
public class UserEntity implements Serializable{

	/**
	 * 序列化id
	 */
	private static final long serialVersionUID = 1L;

    /**
     * id
     */
	@TableId(value = "`id`", type = IdType.AUTO)
	private Integer id;
    /**
     * 名称
     */
	@TableField("`name`")
	private String name;
    /**
     * 密码
     */
	@TableField("`password`")
	private String password;
    /**
     * 创建人
     */
	@TableField("`create_by`")
	private Long createBy;
    /**
     * 创建时间
     */
	@TableField("`create_date`")
	private Date createDate;
    /**
     * 更新人
     */
	@TableField("`update_by`")
	private Long updateBy;
    /**
     * 更新时间
     */
	@TableField("`update_date`")
	private Date updateDate;

}
