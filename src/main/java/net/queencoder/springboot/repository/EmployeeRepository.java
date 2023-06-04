package net.queencoder.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.queencoder.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
