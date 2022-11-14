package com.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
