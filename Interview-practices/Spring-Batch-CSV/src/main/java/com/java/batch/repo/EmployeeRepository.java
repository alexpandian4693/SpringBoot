
package com.java.batch.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.java.batch.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
