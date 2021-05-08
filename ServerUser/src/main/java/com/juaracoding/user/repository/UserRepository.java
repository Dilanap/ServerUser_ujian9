package com.juaracoding.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.juaracoding.user.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value = "select * from user where name LIKE %?1%",nativeQuery=true)
	List<User> findByName(String name);
	
	@Query(value = "select * from user where email LIKE %?1%",nativeQuery=true)
	List<User> findByEmail(String email);
	
	@Query(value = "select * from user where address LIKE %?1%",nativeQuery=true)
	List<User> findByAddress(String address);
}
