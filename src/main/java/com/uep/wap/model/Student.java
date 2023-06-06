package com.uep.wap.model;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long id;
    @Column(name ="name")
    private String name;
    @Column(name ="points")
    private Integer points;


    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Student(String name, Integer points){

    }
}


