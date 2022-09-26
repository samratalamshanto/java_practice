package com.practice.class_object_project;

abstract class Animal { //abstract class //can not create object of abstract class
    abstract void walk(); //abstract method

    public void eat() {
        System.out.println("Eating");
    }


    //we can not create object of abstract class.
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Horse Walking");
    }
}

class Cow extends Animal {
    public void walk() {
        System.out.println("Cow walking");
    }
}


public class Abstract {
    public static void main(String args[]) {
        Horse horse = new Horse();
        Cow cow = new Cow();

        System.out.println();
        horse.walk();
        cow.walk();

        horse.eat();
        // Animal animal = new Animal() ;
        // 'Animal' is abstract; cannot be instantiated

    }
}
