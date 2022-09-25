package com.practice.class_object_project;

class Account {  //encapsulation class
    public String name;
    protected String email;
    int age;
    //default--- access by all in package but denied by others outside package
    private String password;

    //need getter setter
    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getPassword() {
        return this.password;
    }

}

public class Encapsulation {
    public static void main(String args[]) {
        Account act1 = new Account();
        act1.setPassword("abcd1234");
        System.out.println("password: " + act1.getPassword());
    }
}
