package com.example.demo;
import javax.persistence.*;
import java.util.*;


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

    @OneToOne
    @JoinColumn(name = "ID_CARD_ID")
    private IdCard idCard;

    public IdCard getIdCard () {
        return idCard;
    }
    public void setIdCard (IdCard idCard) {
        this.idCard = idCard;
    }
    @OneToMany (mappedBy = "person")
    private List<Phone> phones = new ArrayList<Phone>();
    public List<Phone> getPhones () {
        return phones;
    }
}