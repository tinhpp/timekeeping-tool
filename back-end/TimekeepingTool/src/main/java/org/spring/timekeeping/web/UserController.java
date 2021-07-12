package org.spring.timekeeping.web;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.spring.timekeeping.domain.UserEntity;
import org.spring.timekeeping.domain.request.RegisterUserInfoRequest;
import org.spring.timekeeping.domain.request.UserSearchInfoRequest;
import org.spring.timekeeping.domain.response.UserResponse;
import org.spring.timekeeping.service.impl.UserServiceImpl;
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
@RequestMapping("/api/v1/user/")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	/**
	 * Get list user information according to search terms and condition
	 * 
	 * @param user
	 * @param principal
	 * @return
	 */
	@PostMapping("/getlistuser")
	public List<UserResponse> getAllUserBySearchInfo(@Valid @RequestBody UserSearchInfoRequest user, Principal principal){
		List<UserResponse> listUserResponse = userService.getAllListUserBySearchInfo(user);
		return listUserResponse;
	}
	
	/**
	 * Get user information by userName
	 * 
	 * @param userName
	 * @param principal
	 * @return
	 */
	@GetMapping("/getuserinfo/{userName}")
	public ResponseEntity<?> getUserInfoByUserName(@PathVariable String userName, Principal principal) {
		UserEntity user = new UserEntity();
		user.setUserName(userName);
		UserResponse userResponse = userService.getUserInfo(user);
		return new ResponseEntity<UserResponse>(userResponse,HttpStatus.OK);
	}
	
	/**
	 * Register user information
	 * 
	 * @param registerUserInfoRequest
	 * @param principal
	 * @return
	 */
	@PostMapping("/register")
	public ResponseEntity<?> registerUserInfo(@Valid @RequestBody RegisterUserInfoRequest registerUserInfoRequest, Principal principal) {
		UserEntity user = userService.registerUserInfo(registerUserInfoRequest, "TinhPP");
		return new ResponseEntity<UserEntity>(user,HttpStatus.OK);
	}
}
