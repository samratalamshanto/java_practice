package com.practice.class_object_project;

class Pen {
    String color;
    String type; //gel pen, boll pen

    public void write() {
        System.out.println("writing ....");
    }

    public void printPen() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student {
    int id;
    String name;
    int age;

    Student() {
        //constructor
        System.out.println("constructor....");
    }

    Student(int id, String name, int age) //parameterized constructor
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    Student(Student s1)  //copy constructor
    {
        this.name = s1.name;
        this.age = s1.age;
        this.id = s1.id;
    }

    public void study() {
        System.out.println("reading ....");
    }

    public void printStudent() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //compile time polymorphism
    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age, String name, int id) {
        System.out.println("id: " + id + ", " + "name: " + name + ", " + "age: " + age);
    }
}

public class OOP {
    public static void main(String args[]) {
//         Pen pen1 = new Pen();
//         pen1.color= "red";
//         pen1.type="gel";
//
//
//         pen1.printPen();
//         pen1.write();
//
//        System.out.println( );
//
//         Pen pen2= new Pen();
//         pen2.color="black";
//         pen2.type= "boll";
//
//         pen2.printPen();
//         pen2.write();

        System.out.println();
        System.out.println("Student: ");
        //student class
        Student student1 = new Student();

        student1.id = 1;
        student1.name = "abc";
        student1.age = 11;

        student1.printStudent();

        Student student2 = new Student(2, "bbb", 20);
        student2.printStudent();


        Student student3 = new Student(student1);
        student3.printStudent();

        System.out.println();

        //polymorphism overloading compile time
        student3.printInfo(20);
        student3.printInfo("polymorphism");
        student3.printInfo(12, "compile time", 4);
    }
}
