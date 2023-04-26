package com.BikkadIT.CrudRepositoryMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.BikkadIT.CrudRepositoryMethod.controller.UserController;
import com.BikkadIT.CrudRepositoryMethod.model.User;

@SpringBootApplication
public class CrudRepositoryMethodApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudRepositoryMethodApplication.class, args);

		UserController controller = context.getBean(UserController.class);

//		User user=new User();
//		
//		user.setUserName("Nikhil");
//		user.setUserAddress("Salekasa");
//		user.setUserAge(26);
//		
//		controller.saveUser(user);
//
//		User user = new User();
//		user.setUserId(2);
//		user.setUserName("Saurabh");
//		user.setUserAddress("Pune");
//		user.setUserAge(29);
//
//		User user1 = new User();
//		 user1.setUserId(3);
//		user1.setUserName("Indrakumar");
//		user1.setUserAddress("Nagpur");
//		user1.setUserAge(64);
//
//		User user2 = new User();
//		//user2.setUserId(4);
//		user2.setUserName("Pallavi"); 
//		user2.setUserAddress("Gondia");
//		user2.setUserAge(30);
//		
//		List<User> list=new ArrayList();
//		list.add(user);
//		list.add(user1);
//		list.add(user2);
//		
//		List<User> saveAllUser = controller.saveAllUser(list);
//		System.out.println(saveAllUser);

		// To get total records count of the table
//		long countNoOfrecords = controller.countNoOfrecords();
//		System.out.println(countNoOfrecords);
//		
////To check presence of record using Primary Key
//		boolean existsRecord = controller.existsRecord(4);
//		System.out.println(existsRecord);
//		
//		//To check presence of record using ID
//		User user7 = controller.getRecordById(3);
//		System.out.println(user7);
//
//		// To retrieve all records from the table
//		List<User> allUser = controller.getAllUser();
//		System.out.println(allUser);
//
//		List<Integer> list = Arrays.asList(2, 4);
//		List<User> recordsMultiplePK = controller.getRecordsMultiplePK(list);
//		System.out.println(recordsMultiplePK);
		
		
//		controller.deleteRecordById(2);
		
//		User user=new User();
//		user.setUserId(3);
//		controller.deleteRecordByObject(user);
		
		//List<Integer> list = Arrays.asList(1, 4);
	//	controller.deleteAllRecordByMPK(list);
		
	//	controller.deleteAllRecords();
		
//		Page<User> userPagination = controller.userPagination();
//		System.out.println(userPagination);
//		for (User u : userPagination) {
//	
//		System.out.println(u);
//		}
		
//		List<User> sortingUser = controller.sortingUser();
//		System.out.println(sortingUser);
//		
//		for(User u:sortingUser) {
//			System.out.println(u);
//		}
		
//		User userById1 = controller.getUserById1(1);
//		System.out.println(userById1);
//		
//		User userByuserName = controller.getUserByuserName("anil");
//		System.out.println(userByuserName);
		
//		User address = controller.getUserByuserAddress("salekasa");
//		System.out.println(address);
		
//		User byuserAge = controller.getUserByuserAge(20);
//		System.out.println(byuserAge);
		
		
	//	User userNameAndUserAddress = controller.getUserNameAndUserAddress("rahul", "salekasa");
	//	System.out.println(userNameAndUserAddress);
		
		
//		User userNameOrUserAddress = controller.getUserNameOrUserAddress("sunil", "pune");
//		System.out.println(userNameOrUserAddress);
		
//		List<User> userAgeLessThan = controller.getUserAgeLessThan(55);
//		System.out.println(userAgeLessThan);
		
		
//		int countByUserName = controller.countByUserName("anil");
//		
//		System.out.println(countByUserName);
		
//		List<User> userAgeBetween = controller.getUserAgeBetween(10,60);
//		System.out.println(userAgeBetween);
		
//		List<User> userAgeGreaterThan = controller.getUserAgeGreaterThan(30);
//		System.out.println(userAgeGreaterThan);
		
	
//		List<User> ageGreaterThenEqual = controller.getUserAgeGreaterThenEqual(20);
//		System.out.println(ageGreaterThenEqual);
		
		
//		User user = controller.getUserByIdHql(3);
//		System.out.println(user);
		
//		User userByNameHql = controller.getUserByNameHql("Mogli");
//		System.out.println(userByNameHql);
//		
//		User loginCheck = controller.loginCheck("Saurabh", 21);
//		System.out.println(loginCheck);
		
		User userByIdSql = controller.getUserByIdSql(2);
		System.out.println(userByIdSql);
	}


}

