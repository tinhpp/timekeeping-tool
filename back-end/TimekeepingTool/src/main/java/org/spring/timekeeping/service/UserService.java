package org.spring.timekeeping.service;

import java.util.List;

import org.spring.timekeeping.domain.UserEntity;
import org.spring.timekeeping.domain.request.ChangePasswordRequest;
import org.spring.timekeeping.domain.request.RegisterUserInfoRequest;
import org.spring.timekeeping.domain.request.UpdateUserInfoRequest;
import org.spring.timekeeping.domain.request.UserRequest;
import org.spring.timekeeping.domain.request.UserSearchInfoRequest;
import org.spring.timekeeping.domain.response.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
	List<UserResponse> getAllListUserBySearchInfo(UserSearchInfoRequest userInfo);
	UserResponse getUserInfo(UserEntity user);
	UserEntity registerUserInfo(RegisterUserInfoRequest registerUserInfoRequest, String actionUser); 
	UserEntity updateUserInfo(UpdateUserInfoRequest updateUserInfoRequest, String actionUser); 
	UserEntity changePassword(ChangePasswordRequest changePasswordRequest, String actionUser); 
	void deleteUser(UserRequest user, String actionUser);
}
