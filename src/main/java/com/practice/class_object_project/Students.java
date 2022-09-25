package com.practice.class_object_project;

import java.util.Objects;

public class Students {
    private int roll;
    private String name;

    //constructor
    public Students(int roll, String name) {
        this.roll = roll;
        this.name = name;

    }

    //getter && setter
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // hash obj convert to string
    @Override
    public String toString() {
        return "Students{ " +
                "roll= " + roll +
                ", name='" + name + '\'' +
                '}';
    }

    //hash check 2 obj are equal or not? using class attribute roll
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  //same obj
        if (!(o instanceof Students students)) return false; //not instance of thus Students class
        return getRoll() == students.getRoll();
    }

    //convert hash roll to int value
    @Override
    public int hashCode() {
        return Objects.hash(getRoll());
    }
}
