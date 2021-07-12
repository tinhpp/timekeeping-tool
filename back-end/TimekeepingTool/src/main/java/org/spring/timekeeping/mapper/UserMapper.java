package org.spring.timekeeping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.spring.timekeeping.domain.UserEntity;
import org.spring.timekeeping.domain.request.UserSearchInfoRequest;
import org.spring.timekeeping.domain.response.UserResponse;

@Mapper
public interface UserMapper {
	/**
	 * Get all user info base Search terms
	 * @param userInfo
	 * @return
	 */
	List<UserResponse> getAllListUserBySearchInfo(UserSearchInfoRequest userInfo);
	/**
	 * Get user info by UserName
	 * @param user
	 * @return
	 */
	UserResponse getUserByUserName(UserEntity user);
	/**
	 * Save user in DataBase
	 * @param user
	 */
	void insertUser(UserEntity user);
	/**
	 * Update user info
	 * @param user
	 */
	void updateUser(UserEntity user);
	/**
	 * Delete user by UserName
	 * @param user
	 */
	void deleteUser(UserEntity user);
	/**
	 * Delete list user by UserName
	 * @param listUser
	 */
	void deleteListUserByUserName(List<UserEntity> listUser);
}
