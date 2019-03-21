fileName:${tblNameUppercase}Service.java
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
 * @date ${date?string("yyyy-MM-dd")}
 */
public interface ${tblNameUppercase}Service {

    /**
     * 插入一条记录
     *
     * @param ${tblNameLowercase}Entity 实体对象
     */
    Integer create(${tblNameUppercase}Entity ${tblNameLowercase}Entity);

    /**
     * 根据 ID 修改
     *
     * @param ${tblNameLowercase}Entity 实体对象
     */
    int updateById(${tblNameUppercase}Entity ${tblNameLowercase}Entity);

    /**
     * 根据 ID 查询
     *
     * @param id 主键ID
     */
    ${tblNameUppercase}Entity findById(Integer id);

    /**
     * 根据 条件查询列表
     *
     * @param query 查询条件
     */
    List<${tblNameUppercase}Entity> getList(${tblNameUppercase}Query query);

    /**
     * 根据 条件分页查询列表
     *
     * @param page 分页对象
     * @param query 查询条件
     */
    Pagination<${tblNameUppercase}Entity> getPage(Pagination page, ${tblNameUppercase}Query query);

}
