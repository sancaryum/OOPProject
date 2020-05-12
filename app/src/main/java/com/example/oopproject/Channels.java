package com.example.oopproject;

public class Channels {

    private String name,sector;

    private int subscriber;


    public Channels(String name,String sector,int subscriber){
        this.name=name;
        this.sector=sector;
        this.subscriber=subscriber;

        System.out.println("Channel created");

    }


    public String getName() {
        return name;
    }

    public String getSector() {
        return sector;
    }

    public int getSubscriber() {
        return subscriber;
    }

    public void setName(String name,String password) {
        if(password.matches("Gir")){
            this.name = name;
        }

    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setSubscriber(int subscriber) {
        this.subscriber = subscriber;
    }


}
