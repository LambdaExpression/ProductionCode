fileName:${tblNameUppercase}Mapper.java
package ${packagePath}.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.lambdaexpression.domain.mybatis.Pagination;
import ${packagePath}.entity.${tblNameUppercase}Entity;
import ${packagePath}.query.${tblNameUppercase}Query;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * ${tblNameComment!tblName} Mapper 接口
 *
 * </p>
 * @author ${user}
 * @since ${date?string("yyyy-MM-dd")}
 *
 */
public interface ${tblNameUppercase}Mapper extends BaseMapper<${tblNameUppercase}Entity> {

    List<${tblNameUppercase}Entity> getList(@Param("query") ${tblNameUppercase}Query query);

    List<${tblNameUppercase}Entity> getList(@Param("query") ${tblNameUppercase}Query query, Pagination page);

}
