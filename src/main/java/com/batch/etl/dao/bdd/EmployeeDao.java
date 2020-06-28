package com.batch.etl.dao.bdd;

import com.batch.etl.domain.bdd.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
