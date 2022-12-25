package com.foodbox.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.foodbox.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	


}
