package com.nareshit.spring_boot_Thymlf.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.spring_boot_Thymlf.dto.WorkerDto;
import com.nareshit.spring_boot_Thymlf.model.Worker;
import com.nareshit.spring_boot_Thymlf.repository.DAO;

@Service
public class ServiceImpl implements ServiceIn {

	@Autowired
	private DAO dao;

	@Override
	public void add(WorkerDto worker) {
		System.out.println(worker);
		Worker work = new Worker();
		work.setName(worker.getName());
		dao.save(work);

	}

	@Override
	public List<WorkerDto> getAl() {

		List<Worker> list = dao.findAll();
		List<WorkerDto> li = new ArrayList<WorkerDto>();
		list.stream().forEach(worker -> {
			WorkerDto dto = new WorkerDto();
			dto.setId(worker.getId());
			dto.setName(worker.getName());
			li.add(dto);
		});
		return li;
	}

}
