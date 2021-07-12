package org.spring.timekeeping.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.spring.timekeeping.common.ConstantsUtil;
import org.spring.timekeeping.domain.DepartmentEntity;
import org.spring.timekeeping.domain.request.DepartmentRequest;
import org.spring.timekeeping.domain.response.DepartmentResponse;
import org.spring.timekeeping.exceptions.DeparmentNotFoundException;
import org.spring.timekeeping.exceptions.RecordHasBeenUpdatedExceptions;
import org.spring.timekeeping.mapper.DepartmentMapper;
import org.spring.timekeeping.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<DepartmentResponse> getListDepartment() {
		return departmentMapper.getAllDepartment();
	}

	@Override
	public DepartmentResponse getDepartmentById(DepartmentRequest department) {
		return departmentMapper.getDepartmentById(department);
	}

	@Transactional
	@Override
	public DepartmentEntity saveOrUpdateDepartment(DepartmentRequest department) {
		DepartmentEntity departmentEntity = modelMapper.map(department, DepartmentEntity.class);
		
		if (department.getDepartmentFlg() == ConstantsUtil.CREATE_FLG) {
			departmentMapper.insertDepartment(departmentEntity);
		} else {
			DepartmentResponse departmentResponse = departmentMapper.getDepartmentById(department);
			if (departmentResponse == null) {
				throw new DeparmentNotFoundException("The Department with ID: " + departmentEntity.getIdDepartment()
						+ "' cannot be updated because it doesn't exist.");
			} else {
				if (departmentEntity.getUpdateAt().equals(departmentResponse.getUpdateAt())) {
					departmentMapper.updateDepartment(departmentEntity);
				} else {
					throw new RecordHasBeenUpdatedExceptions(
							"The Department with ID: " + departmentEntity.getIdDepartment()
									+ "' cannot be updated because it was updated by another user.");
				}
			}
		}
		return departmentEntity;
	}

	@Transactional
	@Override
	public void deleteDepartment(DepartmentRequest department) {
		DepartmentEntity departmentEntity = modelMapper.map(department, DepartmentEntity.class);
		departmentMapper.deleteDepartment(departmentEntity);
	}
}
