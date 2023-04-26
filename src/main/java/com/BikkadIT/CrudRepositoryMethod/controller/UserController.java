package com.BikkadIT.CrudRepositoryMethod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.CrudRepositoryMethod.model.User;
import com.BikkadIT.CrudRepositoryMethod.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI userServiceI;

//	public User saveUser(User user) {
//
//		User user2 = userServiceI.saveUser(user);
//
//		return user2;
//
//	}
//
//	public List<User> saveAllUser(List<User> list) {
//		List<User> saveAll = (List<User>) userServiceI.saveAllUser(list);
//		return saveAll;
//	}
//
//	// To get total records count of the table
//	public long countNoOfrecords() {
//		long count = userServiceI.countNoOfrecords();
//		return count;
//	}
//
//	// To check presence of record using Primary Key
//	public boolean existsRecord(int id) {
//		boolean existsById = userServiceI.existsRecord(id);
//		return existsById;
//	}
//
//	// To check presence of record using ID
//
//	public User getRecordById(int id) {
//		User findById = userServiceI.getRecordById(id);
//		return findById;
//	}
//
//	// To retrieve all records from the tabl
//	public List<User> getAllUser() {
//		List<User> findAll = userServiceI.getAllUser();
//		return findAll;
//	}
//
//	public List<User> getRecordsMultiplePK(List<Integer> list) {
//		List<User> allById = (List<User>) userServiceI.getRecordsMultiplePK(list);
//		return allById;
//	}
//
//	public void deleteRecordById(int id) {
//		userServiceI.deleteRecordById(id);
//
//	}
//
//	public void deleteRecordByObject(User user) {
//		userServiceI.deleteRecordByObject(user);
//	}
//
//	public void deleteAllRecordByMPK(List<Integer> list) {
//		userServiceI.deleteAllRecordByMPK(list);
//	}
//
//	public void deleteAllRecords() {
//		userServiceI.deleteAllRecords();
//	}
//
//	public Page<User> userPagination() {
//		Page<User> findAll = userServiceI.userPagination();
//		return findAll;
//	}
//
//	public List<User> sortingUser() {
//		List<User> findAll = userServiceI.sortingUser();
//		return findAll;
//	}
//
//	public User getUserById1(int uid) {
//		User userById1 = userServiceI.getUserById1(uid);
//		return userById1;
//	}
//
//	public User getUserByuserName(String userName) {
//
//		User userByuserName = userServiceI.getUserByuserName(userName);
//		return userByuserName;
//
//	}
//
//	public User getUserByuserAddress(String userAddress) {
//
//		User userByuserAddress = userServiceI.getUserByuserAddress(userAddress);
//		return userByuserAddress;
//	}
//
//	public User getUserByuserAge(int userAge) {
//
//		User userByuserAge = userServiceI.getUserByuserAge(userAge);
//		return userByuserAge;
//	}
//
//	public User getUserNameAndUserAddress(String userName, String USerName) {
//
//		User userNameAndUserAddress = userServiceI.getUserNameAndUserAddress(userName, USerName);
//
//		return userNameAndUserAddress;
//	}
//
//	public User getUserNameOrUserAddress(String userName, String UserAddress) {
//		User userNameOrUserAddress = userServiceI.getUserNameOrUserAddress(userName, UserAddress);
//		return userNameOrUserAddress;
//	}
//
//	public List<User> getUserAgeLessThan(int userAge) {
//		List<User> findByUserAgeLessThan = userServiceI.getUserAgeLessThan(userAge);
//		return findByUserAgeLessThan;
//	}
//
//	public int countByUserName(String uname) {
//		int countByUserName = userServiceI.countByUserName(uname);
//		return countByUserName;
//	}
//
//	public List<User> getUserAgeBetween(int age1, int age2) {
//		List<User> findByUserAgeBetween = userServiceI.getUserAgeBetween(age1, age2);
//		return findByUserAgeBetween;
//	}
//
//	public List<User> getUserAgeGreaterThan(int userAge) {
//		List<User> byUserAgeGreaterThan = userServiceI.getUserAgeGreaterThan(userAge);
//		return byUserAgeGreaterThan;
//	}
//
//	public List<User> getUserAgeGreaterThenEqual(int userAge) {
//		List<User> byUserAgeGreaterThenEqual = userServiceI.getUserAgeGreaterThenEqual(userAge);
//		return byUserAgeGreaterThenEqual;
//	}

//	public User getUserByIdHql(int userId) {
//
//		User user = userServiceI.getUserByIdHql(userId);
//		return user;
//
//	}
//
//	public User getUserByNameHql(String userName) {
//		User user = userServiceI.getUserByNameHql(userName);
//		return user;
//
//	}
//
//	public User loginCheck(String userName, int userAge) {
//		User user = userServiceI.loginCheck(userName, userAge);
//		return user;
//	}
	
	public User getUserByIdSql(int userId) {
		User user = userServiceI.getUserByIdSql(userId);
		return user;
	}
	
}