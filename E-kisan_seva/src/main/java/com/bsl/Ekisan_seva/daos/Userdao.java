package com.bsl.Ekisan_seva.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bsl.Ekisan_seva.pojo.User;

@Repository
public interface Userdao extends JpaRepository<User, Integer> {

	@Query("select u from User u where u.email=:email and u.password=:password")
	public User validateUser(@Param("email") String email, @Param("password") String password);
	
	
	@Query("select u from User u where u.email=:email")
	public User getuser(@Param("email") String email);
	
}
