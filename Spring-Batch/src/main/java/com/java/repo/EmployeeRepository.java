
package com.java.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
