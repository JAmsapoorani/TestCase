package com.SpringDATAJPATestCase.TestCase.Repository;

import com.SpringDATAJPATestCase.TestCase.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByEmail(String email);
}