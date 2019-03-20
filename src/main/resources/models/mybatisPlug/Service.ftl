fileName:${tblNameUppercase}Query.java
package ${packagePath?replace("dal","server")};

import ${packagePath}.entity.${tblNameUppercase}Entity;
import ${packagePath}.query.${tblNameUppercase}Query;
import com.github.lambdaexpression.domain.mybatis.Pagination;

import java.util.List;

/**
 *
 * ${tblNameComment!tblName} 服务
 *
 * @author ${user}
 * @since ${date?string("yyyy-MM-dd")}
 */
public interface ${tblNameUppercase}Service {

    /**
     * 插入一条记录
     *
     * @param entity 实体对象
     */
    Integer insert(${tblNameUppercase}Entity ${tblNameLowercase}Entity);

    /**
     * 根据 ID 修改
     *
     * @param entity 实体对象
     */
    int updateById(${tblNameUppercase}Entity ${tblNameLowercase}Entity);

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    ${tblNameUppercase}Entity selectById(Integer id);

    /**
     * 根据 条件查询列表
     *
     * @param id 主键ID
     */
    List<${tblNameUppercase}Entity> getList(${tblNameUppercase}Query query);

    /**
     * 根据 条件分页查询列表
     *
     * @param id 主键ID
     */
    Pagination<${tblNameUppercase}Entity> getPage(${tblNameUppercase}Query query, Pagination page);

}
