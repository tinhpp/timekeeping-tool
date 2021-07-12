package org.spring.timekeeping.web;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.spring.timekeeping.domain.DepartmentEntity;
import org.spring.timekeeping.domain.request.DepartmentRequest;
import org.spring.timekeeping.domain.response.DepartmentResponse;
import org.spring.timekeeping.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/deparment")
@CrossOrigin
public class DeparmentController {

	
	/**
	 * The Department Service
	 */
	@Autowired
	private DepartmentService departmentService;
	
	/**
	 * Get all the Department information
	 * 
	 * @param principal
	 * @return
	 */
	@GetMapping("/all")
	public List<DepartmentResponse> getAllDepartment(Principal principal) {
		return departmentService.getListDepartment();
	}
	
	/**
	 * Get The Department information by Id
	 * 
	 * @param idDepartment
	 * @param principal
	 * @return
	 */
	@GetMapping("/getdepartmentbyid/{idDepartment}")
	public ResponseEntity<?> getDepartmentById(@PathVariable int idDepartment, Principal principal) {
		DepartmentRequest departmentRequest = new DepartmentRequest();
		departmentRequest.setIdDepartment(idDepartment);
		DepartmentResponse departmentResponse = departmentService.getDepartmentById(departmentRequest);
		return new ResponseEntity<DepartmentResponse>(departmentResponse,HttpStatus.OK);
	}
	
	/**
	 * Action save The Department
	 * @param departmentRequest
	 * @return
	 */
	@PostMapping("/savedepartment")
	public ResponseEntity<?> saveDepartment(@Valid @RequestBody DepartmentRequest departmentRequest ) {
		DepartmentEntity departmentEntity = departmentService.saveOrUpdateDepartment(departmentRequest);
		return new ResponseEntity<DepartmentEntity>(departmentEntity,HttpStatus.OK);
	}
	
	/**
	 * Action delete The Department
	 * 
	 * @param idDepartment
	 * @param principal
	 * @return
	 */
	@GetMapping("/deletedepartment/{idDepartment}")
	public ResponseEntity<?> deleteDepartment(@PathVariable int idDepartment, Principal principal) {
		DepartmentRequest departmentRequest = new DepartmentRequest();
		departmentRequest.setIdDepartment(idDepartment);
		departmentService.deleteDepartment(departmentRequest);
		return new ResponseEntity<String>("The Department with ID: '"+ idDepartment +"' was deleted", HttpStatus.OK);
	}
}
