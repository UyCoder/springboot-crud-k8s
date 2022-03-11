package dev.ahmed.h2database.controller;

import dev.ahmed.h2database.entity.Employee;
import dev.ahmed.h2database.service.EmployeeEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Ahmed Bughra
 * @Created 3/11/2022 - 9:19 PM
 * @Project springboot-crud-k8s
 */
@Controller
@RequestMapping("/emp")
@RequiredArgsConstructor
public class ControllerE {

    public final EmployeeEntityService employeeEntityService;

    @GetMapping("")
    public ResponseEntity findAll() {
        List<Employee> employeeList = employeeEntityService.findAll();
        return ResponseEntity.ok(employeeList);
    }

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        employee = employeeEntityService.saveEmoployee(employee);
        return ResponseEntity.ok(employee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteEmp(Long id) {
        employeeEntityService.deleteEmp(id);
        return ResponseEntity.ok(Void.TYPE);
    }


}
