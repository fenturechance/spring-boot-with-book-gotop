package com.example.demo;
import javax.persistence.*;


@Entity
@Table (name = "T_PERSON")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
public class Person {
    @Id
    @GeneratedValue
    @Column (name = "ID")
    private Long id;
    @Column (name = "FIRST_NAME")
    private String firstName;
    @Column (name = "LAST_NAME")
    private String lastName;
}