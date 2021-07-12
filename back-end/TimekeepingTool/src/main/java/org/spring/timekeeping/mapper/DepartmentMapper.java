package org.spring.timekeeping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.spring.timekeeping.domain.DepartmentEntity;
import org.spring.timekeeping.domain.request.DepartmentRequest;
import org.spring.timekeeping.domain.response.DepartmentResponse;

@Mapper
public interface DepartmentMapper {
	/**
	 * Get All Department
	 * @return
	 */
	List<DepartmentResponse> getAllDepartment();
	/**
	 * Get Department by Id
	 * @param department
	 * @return
	 */
	DepartmentResponse getDepartmentById(DepartmentRequest department);
	/**
	 * Insert Department
	 * @param departmentEntity
	 */
	void insertDepartment(DepartmentEntity departmentEntity);
	/**
	 * Update Department
	 * @param departmentEntity
	 */
	void updateDepartment(DepartmentEntity departmentEntity);
	/**
	 * Delete Department
	 * @param departmentEntity
	 */
	void deleteDepartment(DepartmentEntity departmentEntity);
}
