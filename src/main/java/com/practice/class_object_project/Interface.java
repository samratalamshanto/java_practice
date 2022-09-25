package com.practice.class_object_project;


//static elements are fixed, common for all objects of that class
//static element can access using class name without creating object
// example: Animal2.types="animal";
//save memory too. takes space only one time.

class Animal2 {
    String name;
    static String types;

    public static void setTypes() {
        types = "new animal";
    }
}

interface Animals {
    //public static and fixed
    int eyes = 2;


    //by default method public and abstract
    void walk(); //abstract method only, no constructor,no destructor, no non-abstract method


    //default methods which allow the interfaces to have methods with implementation
    default void eat() {
        System.out.println("Eating");
    }
/*
    Animal(){
         #gives error
    }
    void eat(){
          ### gives error
    }
*/

    // derived class ###implements interface class, not ##extends
}

interface Pet {
    void love();
}

//###multiple inheritance possible only of interfaces
// ##multiple inheritance not possible in classes in java
class Cat implements Animals, Pet {  //multiple inheritance from 2 interfaces(Animal, Pet)

    public void love() {
        System.out.println("Loving Cat");
    }

    public void walk() {
        System.out.println("Cat Walking");
    }

    public void eat() {
        System.out.println("Cat Eating");
    }
}

class Horses implements Animals {
    public void walk() {
        System.out.println("Horse Walking.");
    }

    public void eat() {
        System.out.println("Horse eating");
    }
}


public class Interface {
    public static void main(String args[]) {
        Horses horses = new Horses();
        horses.walk();
        horses.eat();

        System.out.println();

        Cat cat = new Cat();
        cat.eat();
        cat.love();


        //static properties
        Animal2.types = "animals";  //static so we can access before creating obj. and cmn for all obj
        Animal2 animal = new Animal2();
        animal.name = "chicken";

    }
}
