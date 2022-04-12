package com.nareshit.spring_boot_Thymlf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nareshit.spring_boot_Thymlf.model.Worker;

public interface DAO extends JpaRepository<Worker,Long> {

	
	
}
