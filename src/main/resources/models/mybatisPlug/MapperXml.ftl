fileName:${tblNameUppercase}Mapper.xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.github.lambdaexpression.dal.user.mapper.UserMapper">

    <sql id="table">`${tblName}`</sql>
    <resultMap id="BaseResultMap" type="${packagePath}.entity.${tblNameUppercase}Entity"/>
    <sql id="Base_Column_List">
        <#list tableVariableList as map> `${map.variable}` <#if map_has_next>,</#if></#list>
    </sql>

    <select id="getList" parameterType="${packagePath}.query.${tblNameUppercase}Query" resultMap="BaseResultMap">
        select <include refid="Base_Column_List"/>
        from <include refid="table"/>
        where <include refid="Base_Page_Where"/>
    </select>

    <!-- 分页查询查询条件 -->
    <sql id="Base_Page_Where">
        1=1
        <if test=" query != null ">
            <#list tableVariableList as map>
            <if test=" query.${map.variableLowercase} !=null">
                and `${map.variable}` = ${"#"}{query.${map.variableLowercase}}
            </if>
            <#if map.type = 'Date'>
            <if test=" query.${map.variableLowercase}Lte !=null">
                and `${map.variable}` &lt;= ${"#"}{query.${map.variableLowercase}Lte}
            </if>
            <if test=" query.${map.variableLowercase}Gt !=null">
                and `${map.variable}` &gt; ${"#"}{query.${map.variableLowercase}Gt}
            </if>
            </#if>
            <#if map.type = 'String'>
            <if test=" query.${map.variableLowercase}Like !=null">
                and `${map.variable}` like concat ('%',${"#"}{query.${map.variableLowercase}Like},'%')
            </if>
            </#if>
            </#list>
        </if>
    </sql>

</mapper>

