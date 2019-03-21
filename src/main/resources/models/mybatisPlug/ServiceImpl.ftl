fileName:${tblNameUppercase}ServiceImpl.java
package ${packagePath?replace("dal","server")}.impl;

import ${packagePath}.entity.${tblNameUppercase}Entity;
import ${packagePath}.mapper.${tblNameUppercase}Mapper;
import ${packagePath}.query.${tblNameUppercase}Query;
import com.github.lambdaexpression.domain.mybatis.Pagination;
import ${packagePath?replace("dal","server")}.${tblNameUppercase}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
* ${tblNameComment!tblName} 服务
*
* @author ${user}
* @date ${date?string("yyyy-MM-dd")}
*/
@Service
public class ${tblNameUppercase}ServiceImpl implements ${tblNameUppercase}Service {

    @Autowired
    private ${tblNameUppercase}Mapper ${tblNameLowercase}Mapper;

    @Override
    public Integer create(${tblNameUppercase}Entity ${tblNameLowercase}Entity) {
        ${tblNameLowercase}Mapper.insert(${tblNameLowercase}Entity);
        return ${tblNameLowercase}Entity.getId();
    }

    @Override
    public int updateById(${tblNameUppercase}Entity ${tblNameLowercase}Entity) {
        return ${tblNameLowercase}Mapper.updateById(${tblNameLowercase}Entity);
    }

    @Override
    public ${tblNameUppercase}Entity findById(Integer id) {
        return ${tblNameLowercase}Mapper.selectById(id);
    }

    @Override
    public List<${tblNameUppercase}Entity> getList(${tblNameUppercase}Query query) {
        return ${tblNameLowercase}Mapper.getList(query);
    }

    @Override
    public Pagination<${tblNameUppercase}Entity> getPage(Pagination page, ${tblNameUppercase}Query query) {
        return page.setRecords(${tblNameLowercase}Mapper.getList(query, page));
    }

}
