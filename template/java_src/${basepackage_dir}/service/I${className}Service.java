<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign classNameStr = 'I'+className+'Service'>
package ${basepackage}.service;

import java.util.List;
import java.util.Map;

import ${basepackage}.entity.${className};

<#include "/info.include">
@SuppressWarnings("unchecked")
public interface I${className}Service {
	
	public Integer insert${className}(${className} ${classNameLower});

	public Integer update${className}(${className} ${classNameLower});

	public Integer delete${className}(Integer id);

	public ${className} get${className}ById(Integer id);

	public ${className} get${className}(Map param);
	
	public List<${className}> get${className}List(Map param);

	public Integer get${className}Count(Map param);
	
	public List<${className}> getSplit${className}List(Map param);
	
}
