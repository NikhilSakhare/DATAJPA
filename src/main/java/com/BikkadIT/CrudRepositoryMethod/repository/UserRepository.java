package com.BikkadIT.CrudRepositoryMethod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CrudRepositoryMethod.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

//	//Find user using without primary key
//	public User findByUserId(int uid);	
//	
//	public User findByUserName(String userName);
//	
//	public User findByuserAddress(String userAddress);
//	
//	public User findByUserAge(int userAge);
//	
//	public User findByUserNameAndUserAddress(String userName, String UserAddress);
//	
//	public User findByUserNameOrUserAddress(String userName, String UserAddress);
//	
//	public List<User> findByUserAgeLessThan(int userAge);
//	
//	public int countByUserName(String uname);
//	
//	public List<User> findByUserAgeBetween(int age1,int age2);
	
//	public List<User> findByUserAgeGreaterThan(int userAge);
//	
//	public List<User> findByUserAgeGreaterThenEqual(int userAge);
	
	//custom HQL Quarys
	
//	@Query("from User where userId=:userId ")
//	public User getUserByIdHql(int userId);
//	
//	@Query("from User where userName=:userName")
//	public User getUserByNameHql(String userName);
//
//	@Query("from User where userName=: userName and userAge=:userAge")
//	public User loginCheck(String userName,int userAge);
	
	@Query(value ="select * from user_details where user_details =:userId ")
	public User getUserByIdSql(int userId);
}
