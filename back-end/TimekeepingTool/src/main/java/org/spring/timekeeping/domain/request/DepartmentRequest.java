package org.spring.timekeeping.domain.request;

import javax.validation.constraints.NotBlank;

public class DepartmentRequest {

	@NotBlank(message = "Id Department is required")
	private int IdDepartment;
	
	private int departmentFlg;

	public int getIdDepartment() {
		return IdDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		IdDepartment = idDepartment;
	}
	public int getDepartmentFlg() {
		return departmentFlg;
	}

	public void setDepartmentFlg(int departmentFlg) {
		this.departmentFlg = departmentFlg;
	}
	
}
