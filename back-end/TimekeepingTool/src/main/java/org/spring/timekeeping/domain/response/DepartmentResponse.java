package org.spring.timekeeping.domain.response;

import org.spring.timekeeping.domain.ModelBase;

public class DepartmentResponse extends ModelBase{
	/** Id Department **/
	private int idDepartment;
	/** Department Name **/
	private String departmentName;
	/** Description **/
	private String description;
	
	public int getIdDepartment() {
		return idDepartment;
	}
	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
