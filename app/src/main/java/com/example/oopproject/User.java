package com.example.oopproject;

public class User extends People {

    //Properties
    String name,job;

    //Constructor

    public User(){

    }

    public User(String name, String job) {
        this.name = name;
        this.job = job;

        System.out.println("User oluşturuldu");
    }
}
