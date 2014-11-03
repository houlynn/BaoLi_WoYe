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
public class Menu extends TreeBaseEntity {
	@NodeType(type=TreeNodeType.ID)
	private String menuId;
	@NodeType(type=TreeNodeType.TEXT)
	private String menuName;
	@NodeType(type=TreeNodeType.CODE)
	private String moduleCode;
	@NodeType(type=TreeNodeType.ICON)
	private String icon;
	@NodeType(type=TreeNodeType.BIGICON)
	private String bigIcon;
	@NodeType(type=TreeNodeType.PARENT)
	private Menu parent;
	private  int orderIndex;
	private Set<Menu> children=new HashSet<Menu>();
	@Id
	@GeneratedValue(generator="systemUUID")
	@Column(length=50)
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getBigIcon() {
		return bigIcon;
	}
	public void setBigIcon(String bigIcon) {
		this.bigIcon = bigIcon;
	}
	@JsonIgnore
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	@JoinColumn(name="PARENT")
	public Menu getParent() {
		return parent;
	}
	public void setParent(Menu parent) {
		this.parent = parent;
	}
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY,mappedBy="parent",cascade={CascadeType.REMOVE})
	@LazyCollection(LazyCollectionOption.TRUE)
	public Set<Menu> getChildren() {
		return children;
	}
	public void setChildren(Set<Menu> children) {
		this.children = children;
	}
	public int getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}

	
}
