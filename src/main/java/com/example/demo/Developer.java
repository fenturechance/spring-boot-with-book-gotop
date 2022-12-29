package com.example.demo;
import javax.persistence.*;
@Entity
@Access(AccessType.PROPERTY)
public class Developer extends Person {
    private String programmingLanguage;
    @Column(name = "PROG_LANG")
    public String getProgrammingLanguage () {
        return programmingLanguage;
    }
    public void setProgrammingLanguage (String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}