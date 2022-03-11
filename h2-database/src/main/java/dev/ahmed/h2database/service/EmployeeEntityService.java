package dev.ahmed.h2database.service;

import dev.ahmed.h2database.dao.EmployeeDao;
import dev.ahmed.h2database.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author Ahmed Bughra
 * @Created 3/11/2022 - 9:41 PM
 * @Project springboot-crud-k8s
 */
@Service
@RequiredArgsConstructor
public class EmployeeEntityService {

    private final EmployeeDao employeeDao;

    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    public Employee saveEmoployee(Employee employee) {
        return employeeDao.save(employee);
    }

    public void deleteEmp(Long id) {
        employeeDao.deleteById(id);
    }
}

