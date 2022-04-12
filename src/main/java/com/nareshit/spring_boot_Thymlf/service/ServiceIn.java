package com.nareshit.spring_boot_Thymlf.service;

import java.util.List;

import com.nareshit.spring_boot_Thymlf.dto.WorkerDto;

public interface ServiceIn {
	public void add(WorkerDto worker);
	public List<WorkerDto> getAl();
}
