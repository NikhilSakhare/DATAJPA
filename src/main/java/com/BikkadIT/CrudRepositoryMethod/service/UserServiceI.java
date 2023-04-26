package com.BikkadIT.CrudRepositoryMethod.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.BikkadIT.CrudRepositoryMethod.model.User;

public interface UserServiceI {
	
	
//	public User saveUser(User user);
//	//===TO Save and UPdate Data
//	public List<User> saveAllUser(List<User> list);
//
//	// To get total records count of the table
//	public long countNoOfrecords();
//	
//	
//	//To check presence of record using Primary Key
//	public boolean existsRecord(int id);
//	
//	//To check presence of record using ID
//
//	public User getRecordById(int id);
//
//	// To retrieve all records from the table
//	public List<User> getAllUser();
//	
//	// To find  records using multiple Primary Keys
//	public List<User> getRecordsMultiplePK(List<Integer> list);
//	
//	//To delete record by using id
//	public void deleteRecordById(int id);
//	
//	//To delete record by using object
//	public void deleteRecordByObject(User user);
//	//To delete Data using PrimaryKey
//	public void deleteAllRecordByMPK(List<Integer> list );
//	
//	//To delete all record 
//	public void deleteAllRecords();
//	//To create Multiple Pages
//	public Page<User> userPagination();
//	
//	//To sorting user
//	public List<User> sortingUser();
//	//==========Customize methods======
//	//To get user using uid
//	public User getUserById1(int uid);
//	//To get user details using user name
//	public User getUserByuserName(String userName);
//	//to get details using userAddress
//	public User getUserByuserAddress(String userAddress);
//	//To get User details using age
//	public User getUserByuserAge(int userAge);
//	
//	//To get User details using AND operator
//	public User getUserNameAndUserAddress(String userName, String USerName);
//	
//	public User getUserNameOrUserAddress(String userName, String UserAddress);
//	
//	public List<User> getUserAgeLessThan(int userAge);
//	
//	public int countByUserName(String uname);
//	
//	public List<User> getUserAgeBetween(int age1,int age2);
//	
//	public List<User> getUserAgeGreaterThan(int userAge);
//	
//	public List<User> getUserAgeGreaterThenEqual(int userAge);	
//	
	
//	public User getUserByIdHql(int userId);
//	
//	public User getUserByNameHql(String userName);
//	
//	public User loginCheck(String userName,int userAge);
	
	public User getUserByIdSql(int userId);

}
