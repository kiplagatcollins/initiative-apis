package com.coki.initiative.domain;

import com.coki.initiative.domain.enumeration.Designation;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

public class Officer extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 100)
    @Column(name = "name", length = 100)
    private  String name;

    @Size(max = 100)
    @Column(name = "email_id", length = 100)
    private  String emailId;

    @Enumerated(EnumType.STRING)
    @Column(name = "designation")
    private Designation designation;


    @ManyToOne
    private  Section section;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", designation=" + designation +
                ", section=" + section +
                '}';
    }
}
