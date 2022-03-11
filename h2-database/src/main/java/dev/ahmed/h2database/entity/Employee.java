package dev.ahmed.h2database.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author Ahmed Bughra
 * @Created 3/11/2022 - 9:25 PM
 * @Project springboot-crud-k8s
 */

@Entity
@Table(name="TBL_EMPLOYEES")
@Getter
@Setter
public class Employee {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firsName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "EMAIL", nullable = false)
    private String email;
}
