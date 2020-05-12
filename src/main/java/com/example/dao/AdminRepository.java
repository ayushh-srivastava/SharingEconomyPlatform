package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,String> {
	@Query("select a from Admin a where adminId=?1 and password=?2")
	Admin validateAdmin(String adminId, String password);
	
	@Query("select a.adminId from Admin a where a.adminId=?1")
	String checkAdminId(String adminId);

	@Query("select a.adminId from Admin a where a.password=?1")
	String checkPassword(String password);



}
