package com.Jpa.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Dept {

    private int id;
    @Id
    private String name;
    private String HodName;
    @OneToOne
    private Student student;

    public Dept() {
    }

    public Dept(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHodName() {
        return HodName;
    }

    public void setHodName(String hodName) {
        HodName = hodName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
