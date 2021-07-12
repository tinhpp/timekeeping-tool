package org.spring.timekeeping.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.spring.timekeeping.domain.UserEntity;
import org.spring.timekeeping.domain.request.ChangePasswordRequest;
import org.spring.timekeeping.domain.request.RegisterUserInfoRequest;
import org.spring.timekeeping.domain.request.UpdateUserInfoRequest;
import org.spring.timekeeping.domain.request.UserRequest;
import org.spring.timekeeping.domain.request.UserSearchInfoRequest;
import org.spring.timekeeping.domain.response.UserResponse;
import org.spring.timekeeping.exceptions.RecordHasBeenUpdatedExceptions;
import org.spring.timekeeping.exceptions.UserNotFoundException;
import org.spring.timekeeping.mapper.UserMapper;
import org.spring.timekeeping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<UserResponse> getAllListUserBySearchInfo(UserSearchInfoRequest userInfo) {
		return userMapper.getAllListUserBySearchInfo(userInfo);
	}

	@Override
	public UserResponse getUserInfo(UserEntity user) {
		System.out.println("UserServiceImpl.getUserInfo()");
		UserResponse userResponse = userMapper.getUserByUserName(user);
		if (userResponse == null) {
			throw new UserNotFoundException("User Name: '"+ user.getUserName() +"' does not exist");
		}
		return userResponse;
	}

	@Transactional
	@Override
	public UserEntity registerUserInfo(RegisterUserInfoRequest registerUserInfoRequest, String actionUser) {
		UserEntity user = modelMapper.map(registerUserInfoRequest, UserEntity.class);
		user.setActionUser(actionUser);
		userMapper.insertUser(user);
		return user;
	}

	@Transactional
	@Override
	public UserEntity updateUserInfo(UpdateUserInfoRequest updateUserInfoRequest, String actionUser) {
		UserEntity user = modelMapper.map(updateUserInfoRequest, UserEntity.class);
		user.setActionUser(actionUser);
		
		UserResponse existingUser = userMapper.getUserByUserName(user);
		if (existingUser == null) {
			throw new UserNotFoundException("User with name: " + user.getUserName()
			+ "' cannot be updated because it doesn't exist.");
		} else {
			if (existingUser.getUpdateAt().equals(user.getUpdateAt())) {
				userMapper.updateUser(user);
			} else {
				throw new RecordHasBeenUpdatedExceptions(
						"User with username: " + user.getUserName()
								+ "' cannot be updated because it was updated by another user.");
			}
		}
		return user;
	}

	@Transactional
	@Override
	public UserEntity changePassword(ChangePasswordRequest changePasswordRequest, String actionUser) {
		UserEntity user = new UserEntity(changePasswordRequest.getUserName());
		user.setActionUser(actionUser);
		
		UserResponse existingUser = userMapper.getUserByUserName(user);
		if (existingUser == null) {
			throw new UserNotFoundException("User with name: " + user.getUserName()
			+ "' cannot be updated because it doesn't exist.");
		}
		return null;
	}
	
	@Transactional
	@Override
	public void deleteUser(UserRequest user, String actionUser) {
		UserEntity userEntity = new UserEntity(user.getUserName());
		userEntity.setActionUser(actionUser);
		userMapper.deleteUser(userEntity);
	}
}
