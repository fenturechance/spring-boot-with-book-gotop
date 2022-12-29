package com.example.demo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="T_EMPLOYER")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private int id;

    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "BIRTHDATE")
    private Date birthDate;
    @Column(name = "SALARY")
    private float salary;
}
