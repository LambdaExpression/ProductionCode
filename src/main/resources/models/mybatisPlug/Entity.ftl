fileName:${tblNameUppercase}Entity.java
package ${packagePath}.entity;

import java.io.Serializable;
<#if tableVariableType.hasDateClass>
import java.util.Date;
</#if>
<#if tableVariableType.hasBigDecimalClass>
import java.math.BigDecimal;
</#if>

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ${tblNameComment!tblName} 对象类
 *
 * @author ${user}
 * @since ${date?string("yyyy-MM-dd")}
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("`${tblName}`")
public class ${tblNameUppercase}Entity implements Serializable{

	/**
	 * 序列化id
	 */
	private static final long serialVersionUID = 1L;

    <#list tableVariableList as map>
    /**
     * ${map.variableComment!map.variableLowercase}
     */
	<#if map.primaryKey >
	@TableId(value = "`${map.variable}`", type = IdType.AUTO)
	<#else>
	@TableField("`${map.variable}`")
	</#if>
	private ${map.type} ${map.variableLowercase};
    </#list>

}
