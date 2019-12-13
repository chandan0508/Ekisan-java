package com.bsl.Ekisan_seva.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.bsl.Ekisan_seva.pojo.Admin;

@Repository
public interface Admindao extends JpaRepository<Admin, Integer> {

	@Query("select a from Admin a where a.email=:email and a.password=:password")
	public Admin validateAdmin(@Param("email") String email, @Param("password") String password);
}

