package com.example.simulacro11.servicies;



import com.example.simulacro11.entities.Role;

import java.util.List;


public interface IRoleService {
	public void insert(Role role);

	List<Role> list();

}
