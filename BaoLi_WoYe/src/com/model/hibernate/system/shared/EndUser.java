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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.ufo.framework.annotation.DDItemCode;
import com.ufo.framework.annotation.DDItemName;
import com.ufo.framework.common.core.properties.PropUtil;
import com.ufo.framework.common.model.Model;

/**
 * 人员表
* @author 作者 yingqu: 
* @version 创建时间：2014年6月21日 下午10:33:58 
* version 1.0
 */
@Entity
@GenericGenerator(name="systemUUID",strategy="uuid")
public class EndUser implements Model {
	@DDItemCode
	private String userId;
	@DDItemName
	private String username;
	private String userCode;
	private String password;
	private String sex="0";//0代表男，1代表女
	private String birthday;
	/**后面属性不进行持久化操作*/
	private String icon=PropUtil.get("sys.rbac.userIcon");
	private String deptId;
	private String deptName;
	private String deptCode;
	
	private String remark;
	
	private String enabled;
	
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	/**角色*/
	private Set<Role> roles=new HashSet<Role>();
	/**部门*/
	private Department department=new Department();
	@Id
	@GeneratedValue(generator="systemUUID")
	@Column(length=50)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(unique=true)
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Transient
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Transient
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	@Transient
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Transient
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	
	@JsonIgnore
	@ManyToMany(fetch=FetchType.LAZY,cascade={CascadeType.MERGE})
	@JoinTable(name = "ROLE_USER", joinColumns = {
				@JoinColumn(name = "userId") },
				inverseJoinColumns = { @JoinColumn(name = "roleId")
	})
	@LazyCollection(LazyCollectionOption.TRUE)
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	@JsonIgnore //构建json数据的时候排除此字段
	@ManyToOne(optional=false, fetch=FetchType.LAZY, cascade={CascadeType.MERGE})
	@JoinColumn(name="deptId")
	@LazyCollection(LazyCollectionOption.TRUE)
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
