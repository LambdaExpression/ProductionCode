fileName:${tblNameUppercase}Query.java
package ${packagePath}.query;

import java.io.Serializable;
<#if tableVariableType.hasDateClass>
import java.util.Date;
</#if>
<#if tableVariableType.hasBigDecimalClass>
import java.math.BigDecimal;
</#if>

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ${tblNameComment!tblName} 查询对象类
 *
 * @author ${user}
 * @since ${date?string("yyyy-MM-dd")}
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ${tblNameUppercase}Query implements Serializable{

	/**
	 * 序列化id
	 */
	private static final long serialVersionUID = 1L;

    <#list tableVariableList as map>
    /**
     * ${map.variableComment!map.variableLowercase}
     */
	private ${map.type} ${map.variableLowercase};
    <#if map.type = 'String'>
    /**
     * 小于等于 ${map.variableComment!map.variableLowercase}
     */
    private ${map.type} ${map.variableLowercase}Like;
    </#if>
    <#if map.type = 'Date'>
    /**
     * 小于等于 ${map.variableComment!map.variableLowercase}
     */
    private ${map.type} ${map.variableLowercase}Lte;
    /**
     * 大于 ${map.variableComment!map.variableLowercase}
     */
    private ${map.type} ${map.variableLowercase}Gt;
    </#if>
    </#list>

}
