package com.nikhil.springboot2.springboot2jpacrud.repository;

import com.nikhil.springboot2.springboot2jpacrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
