package com.example.demo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_ID_CARD")
@Data
public class IdCard {
    private Long id;
    private String idNumber;
    private Date issueDate;
    private boolean valid;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name ="ID")
    public Long getId() {
        return id;
    }
    @Column (name ="ID_NUMBER")
    public String getIdNumber() {
        return idNumber;
    }
    @Column (name="ISSUE_DATE")
    @Temporal (TemporalType.TIMESTAMP)
    public Date getIssueDate() {
        return issueDate;
    }
    @Column (name="VALID")
    @Convert (converter = BooleanConverter.class)
    public boolean isValid() {
        return valid;
    }
    // setter methods
    @Override
    public String toString() {
        return "IdCard [id=" + id + "idNumber=" + idNumber + "issueDate=" + issueDate + ", valid=" + valid + "]";
    }
}
