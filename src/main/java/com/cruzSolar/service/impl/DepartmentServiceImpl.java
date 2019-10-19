package com.cruzSolar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruzSolar.model.entity.Department;
import com.cruzSolar.model.repository.DepartmentRepository;
import com.cruzSolar.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public List<Department> getAll() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getOneById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long create(Department entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Long id, Department entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
