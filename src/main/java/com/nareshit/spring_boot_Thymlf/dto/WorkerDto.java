package com.nareshit.spring_boot_Thymlf.dto;

public class WorkerDto {
	 private Long id;
	 private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + "]";
	}
	 
}
