package com.BikkadIT.CrudRepositoryMethod.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepositoryMethod.model.User;
import com.BikkadIT.CrudRepositoryMethod.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserRepository userRepository;

//	@Override
//	public User saveUser(User user) {
//		User user2 = userRepository.save(user);
//		return user2;
//	}
//
//	//===TO Save and UPdate Data
//	@Override
//	public List<User> saveAllUser(List<User> list) {
//	List<User> saveAll = (List<User>) userRepository.saveAll(list);
//		return saveAll;
//	}
//	//== To get total records count of the table
//	@Override
//	public long countNoOfrecords() {
//		long count = userRepository.count();
//		return count;
//	}
//
//	//To check presence of record using Primary Key
//	@Override
//	public boolean existsRecord(int id) {
//		boolean existsById = userRepository.existsById(id);
//		return existsById;
//	}
//
//	//To check presence of record using ID
//
//	@Override
//	public User getRecordById(int id) {
//		User findById = userRepository.findById(id).get();
//		return findById;
//	}
//
//	// To retrieve all records from the tabl
//	@Override
//	public List<User> getAllUser() {
//		List<User> findAll = (List<User>) userRepository.findAll();
//		return findAll;
//	}
//
//	// To find  records using multiple Primary Keys
//	@Override
//	public List<User> getRecordsMultiplePK(List<Integer> list) {
//		List<User> allById = (List<User>) userRepository.findAllById(list);
//		return allById;
//	}
//
//	@Override
//	public void deleteRecordById(int id) {
//		userRepository.deleteById(id);
//		
//	}
//
//	public void deleteRecordByObject(User user) {
//				userRepository.delete(user);
//		
//	}
//
//	@Override
//	public void deleteAllRecordByMPK(List<Integer> list) {
//		userRepository.deleteAllById(list);
//		
//	}
//
//	@Override
//	public void deleteAllRecords() {
//		userRepository.deleteAll();
//	}
//	
//
//	@Override
//	public Page<User> userPagination() {
//		PageRequest of = PageRequest.of(2, 3);
//		Page<User> findAll = userRepository.findAll(of);
//		return findAll;
//	
//
//	
//	}
//
//	@Override
//	public List<User> sortingUser() {
//		List<User> findAll = userRepository.findAll(Sort.by("userId"));
//		return findAll;
//	}
//
//	@Override
//	public User getUserById1(int uid) {
//		User user = userRepository.findByUserId(uid);
//		return user;
//	}
//
//	@Override
//	public User getUserByuserName(String userName) {
//		
//		User findByUserName = userRepository.findByUserName(userName);
//		return findByUserName;
//	}
//
//	@Override
//	public User getUserByuserAddress(String userAddress) {
//		User address = userRepository.findByuserAddress(userAddress);
//		return address;
//	}
//
//	@Override
//	public User getUserByuserAge(int userAge) {
//		User byUserAge = userRepository.findByUserAge(userAge);
//		return byUserAge;
//	}
//
//	@Override
//	public User getUserNameAndUserAddress(String userName, String USerName) {
//
//		User findByUserNameAndUserAddress = userRepository.findByUserNameAndUserAddress(userName, USerName);
//		return findByUserNameAndUserAddress;
//	}
//
//	@Override
//	public User getUserNameOrUserAddress(String userName, String UserAddress) {
//		User findByUserNameOrUserAddress = userRepository.findByUserNameOrUserAddress(userName, UserAddress);
//		
//		return findByUserNameOrUserAddress;
//	}
//
//	@Override
//	public List<User> getUserAgeLessThan(int userAge) {
//		List<User> findByUserAgeLessThan = userRepository.findByUserAgeLessThan(userAge);
//		return findByUserAgeLessThan;
//	}
//
//	@Override
//	public int countByUserName(String uname) {
//		int countByUserName = userRepository.countByUserName(uname);
//		return countByUserName;
//	}
//
//	@Override
//	public List<User> getUserAgeBetween(int age1, int age2) {
//		List<User> findByUserAgeBetween = userRepository.findByUserAgeBetween(age1, age2);
//		
//		return findByUserAgeBetween;
//	}

	//@Override
//	public List<User> getUserAgeGreaterThan(int userAge) {
//		List<User> byUserAgeGreaterThan = userRepository.findByUserAgeGreaterThan(userAge);
//		return byUserAgeGreaterThan;
//	}
//
//	@Override
//	public List<User> getUserAgeGreaterThenEqual(int userAge) {
//		List<User> byUserAgeGreaterThenEqual = userRepository.findByUserAgeGreaterThenEqual(userAge);
//		return byUserAgeGreaterThenEqual;
//	}
//	@Override
//	public User getUserByIdHql(int userId) {
//		User user = userRepository.getUserByIdHql(userId);
//		return user;
//	}
//
//	@Override
//	public User getUserByNameHql(String userName) {
//		User user = userRepository.getUserByNameHql(userName);
//		return user;
//	}
//
//	
//	@Override
//	public User loginCheck(String userName, int userAge) {
//		User loginCheck = userRepository.loginCheck(userName, userAge);
//		return loginCheck;
//	}

	@Override
	public User getUserByIdSql(int userId) {
		User user = userRepository.getUserByIdSql(userId);
		return user;
	}

	
		
}