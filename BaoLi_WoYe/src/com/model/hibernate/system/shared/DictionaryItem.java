package com.model.hibernate.system.shared;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import com.ufo.framework.annotation.NodeType;
import com.ufo.framework.common.core.ext.TreeNodeType;
@Entity
@GenericGenerator(name="systemUUID",strategy="uuid")
public class DictionaryItem extends TreeBaseEntity{
	@NodeType(type=TreeNodeType.ID)
	private String itemId;
	@NodeType(type=TreeNodeType.TEXT)
	private String itemName;
	@NodeType(type=TreeNodeType.CODE)
	private String itemCode;
	@NodeType(type=TreeNodeType.PARENT)
	private DictionaryItem parent;
	private Set<DictionaryItem> children=new HashSet<DictionaryItem>();
	private Dictionary dictionary;
	@Id
	@GeneratedValue(generator="systemUUID")
	@Column(length=50)
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	@ManyToOne
    @JoinColumn(name="PARENT")
	public DictionaryItem getParent() {
		return parent;
	}
	public void setParent(DictionaryItem parent) {
		this.parent = parent;
	}
	@JsonIgnore
	@OneToMany(mappedBy="parent",cascade={CascadeType.REMOVE},fetch=FetchType.LAZY)
    @LazyCollection(LazyCollectionOption.TRUE)
	public Set<DictionaryItem> getChildren() {
		return children;
	}
	public void setChildren(Set<DictionaryItem> children) {
		this.children = children;
	}
	@JsonIgnore
    @ManyToOne(optional=false)
    @JoinColumn(name="DDId")
	public Dictionary getDictionary() {
		return dictionary;
	}
	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
	
	
}
