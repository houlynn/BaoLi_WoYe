package com.model.hibernate.system.shared;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Proxy;

import com.ufo.framework.common.model.Model;

/**
 * 数字字典目录
* @author 作者 yingqu: 
* @version 创建时间：2014年6月21日 下午10:37:44 
* version 1.0
 */
@Entity
@GenericGenerator(name="systemUUID",strategy="uuid")
@Proxy(lazy = true)
public class Dictionary implements Model {
	private String ddId;
	private String ddName;
	@JsonProperty
	private String ddCode;
	@JsonProperty
	private String ddType;
	private String enabled;
	private String readOnly="0";
	private String modelName;
	/**字典项*/
	private Set<DictionaryItem> children=new HashSet<DictionaryItem>();	
	public String getEnabled() {
		return enabled;
	}
	@Id
	@GeneratedValue(generator="systemUUID")
	@Column(length=50)
	public String getDdId() {
		return ddId;
	}
	public void setDdId(String ddId) {
		this.ddId = ddId;
	}
	public String getDdName() {
		return ddName;
	}
	public void setDdName(String ddName) {
		this.ddName = ddName;
	}
	@Column(unique=true)
	public String getDdCode() {
		return ddCode;
	}
	public void setDdCode(String ddCode) {
		this.ddCode = ddCode;
	}
	public String getDdType() {
		return ddType;
	}
	public void setDdType(String ddType) {
		this.ddType = ddType;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	@JsonIgnore
	@OneToMany(mappedBy="dictionary",cascade={CascadeType.REMOVE},fetch=FetchType.LAZY)
    @LazyCollection(LazyCollectionOption.TRUE)
	public Set<DictionaryItem> getChildren() {
		return children;
	}
	public void setChildren(Set<DictionaryItem> children) {
		this.children = children;
	}
	public String getReadOnly() {
		return readOnly;
	}
	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}

	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
}
