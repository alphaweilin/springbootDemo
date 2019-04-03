package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	@Transactional
	public void insertList(List<Employee> list) {
		if(null == list || list.isEmpty()) {
			return;
		}

		for(int i = 0; i < list.size(); i++) {
			repository.save(list.get(i));
		}

	}
}
