package com.practice.class_object_project;

class Shape {
    String color;

    public void area() {
        System.out.println("area....");
    }
}

//inheritance one to one
class Triangle extends Shape { //single level inheritance
    public void area(int l, int h) {
        System.out.println("area of triangle: " + 0.5 * l * h);
    }

    public void printColor() {
        System.out.println("Color of triangle:  " + this.color);
    }
}

class SubTriangle extends Triangle { //multiple level inheritance
    public void area(int l, int h, int w) {
        System.out.println("Sub triangle area: " + l * h * w);
    }
}

class Circle extends Shape {  //heriarchical inheritance. triangle and circle shape
    public void area(int r) {
        System.out.println("Circle area: " + 3.14 * r * r);
    }
}


public class Inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.printColor();

        SubTriangle subT = new SubTriangle();
        subT.area(2, 4);

        Circle cir = new Circle();
        cir.area(4);

    }
}

