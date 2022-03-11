package dev.ahmed.h2database.dao;

import dev.ahmed.h2database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Ahmed Bughra
 * @Created 3/11/2022 - 9:37 PM
 * @Project springboot-crud-k8s
 */
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
