package com.Jpa.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    @OneToOne(mappedBy = "Student", cascade = CascadeType.ALL)
    private Dept dept;

    public Student(int id) {
        this.id = id;
    }

    public Student() {
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

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}
