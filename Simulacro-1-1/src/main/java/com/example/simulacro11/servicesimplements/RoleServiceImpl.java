package com.example.simulacro11.servicesimplements;

import com.example.simulacro11.entities.Role;
import com.example.simulacro11.repositories.RoleRepository;
import com.example.simulacro11.servicies.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private RoleRepository rR;

	@Override
	public void insert(Role role) {
		rR.save(role);
	}

	@Override
	public List<Role> list() {
		// TODO Auto-generated method stub
		return rR.findAll();
	}
}
