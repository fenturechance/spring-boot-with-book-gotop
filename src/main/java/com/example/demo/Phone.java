package com.example.demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="T_PHONE")
@Data
public class Phone {
    private Long id;
    private String number;
    private Person person;
    @Id
    @GeneratedValue (strategy = GenerationType.TABLE, generator = "MY_TABLE_GENERATOR")
    @TableGenerator (name = "MY_TABLE_GENERATOR",
            table="T SEQUENCES",
            pkColumnName = "SEQ_NAME",
            valueColumnName = "SEO_VALUE",
            pkColumnValue = "PHONE")
    @Column (name = "ID")
    public Long getId() {
        return id;
    }
    @Column (name = "NUMBER")
    public String getNumber () {
        return number;
    }
    @ManyToOne
    @JoinColumn (name = "PERSON_ID")
    public Person getPerson () {
        return person;
    }
}
