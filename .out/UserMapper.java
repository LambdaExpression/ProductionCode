package com.github.lambdaexpression.dal.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.lambdaexpression.domain.mybatis.Pagination;
import com.github.lambdaexpression.dal.user.entity.UserEntity;
import com.github.lambdaexpression.dal.user.query.UserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 *
 * </p>
 * @author Lin
 * @since 2019-03-08
 *
 */
public interface UserMapper extends BaseMapper<UserEntity> {

    List<UserEntity> getList(@Param("query") UserQuery query);

    List<UserEntity> getList(@Param("query") UserQuery query, Pagination page);

}
