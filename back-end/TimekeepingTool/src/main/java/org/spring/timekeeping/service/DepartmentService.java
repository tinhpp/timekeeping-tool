package org.spring.timekeeping.service;

import java.util.List;

import org.spring.timekeeping.domain.DepartmentEntity;
import org.spring.timekeeping.domain.request.DepartmentRequest;
import org.spring.timekeeping.domain.response.DepartmentResponse;

public interface DepartmentService {
	List<DepartmentResponse> getListDepartment();
	DepartmentResponse getDepartmentById(DepartmentRequest department);
	DepartmentEntity saveOrUpdateDepartment(DepartmentRequest department);
	void deleteDepartment(DepartmentRequest department);
}
