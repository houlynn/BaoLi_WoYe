package com.model.hibernate.system.shared;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
import com.ufo.framework.common.model.Model;
@Entity
@GenericGenerator(name="systemUUID",strategy="uuid")
public class SysIcon implements Model {
	private String id;
	private String iconCls;
	private String iconName;
	private String pixel;
	private String icon;
	private String remark;
	@Id
	@GeneratedValue(generator="systemUUID")
	@Column(length=50)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	public String getIconName() {
		return iconName;
	}
	public void setIconName(String iconName) {
		this.iconName = iconName;
	}
	public String getPixel() {
		return pixel;
	}
	public void setPixel(String pixel) {
		this.pixel = pixel;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getRemark() {
		return remark;
	}
	@Column(length=1000)
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
