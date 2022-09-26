package com.practice.class_object_project;

class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void area() {
        System.out.println("area....");
    }

    public void msg() {
        System.out.println("overriding parent.");
    }


    public void msg2() {
        System.out.println("Not overriding parent.");
    }
}

//inheritance one to one
class Triangle extends Shape { //single level inheritance
    public int len;


    public Triangle(String color, int len) {
        super(color);  //super call the parent constructor here
        this.len = len;  //this is the class's property, not parent's property
    }


    @Override
    public void msg() {
        super.msg();
        System.out.println("Overriding form child triangle class");
    }

    public void area(int l, int h) {

        super.area();  //it will call super class area() method first
        System.out.println("area of triangle: " + 0.5 * l * h);
    }

    public void printColor() {
        System.out.println("Color of triangle:  " + this.color);
    }
}

class SubTriangle extends Triangle { //multi-level inheritance
    public SubTriangle(String color, int len) {
        super(color, len);
    }


    public void area(int l, int h, int w) {
        System.out.println("Sub triangle area: " + l * h * w);
    }
}

class Circle extends Shape {  //hierarchical inheritance. triangle and circle shape

    public Circle(String color) {
        super(color);
    }

    public void area(int r) {
        System.out.println("Circle area: " + 3.14 * r * r);
    }
}


public class Inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle("red", 4);
        t1.color = "red";
        t1.printColor();
        // t1.msg();

        SubTriangle subT = new SubTriangle("black", 3);
        subT.area(2, 4);


        Circle cir = new Circle("blue");
        cir.area(4);

    }
}

