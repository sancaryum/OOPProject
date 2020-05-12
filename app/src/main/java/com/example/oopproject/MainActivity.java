package com.example.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.example.oopproject.HouseDecor.roomName;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        User myUser = new User("Yasin", "Entrepreneur");

        //User user2 = new User("Aleyna","Student");

        System.out.println(myUser.name);
*/
        //Encapsulation
        Channels reynmen = new Channels("Yusuf Aktaş", "Music",5000000);

        System.out.println(reynmen.getName());

        reynmen.setName("Mehmet Aktaş", "Gir");

        System.out.println(reynmen.getName());

        //Inheritance
        SuperChannels Enes = new SuperChannels("Enes","Eğlence",10000000);

        System.out.println(Enes.getName());

        //Bu çağrılamaz.
        //Reynmen.price();

        //Static Polymorphism

        Mathematics math = new Mathematics();
        System.out.println(math.sum());
        System.out.println(math.sum(2,3));
        System.out.println(math.sum(3,4,5));

        //Dynamic Polymorphism
        Flowers myFlower = new Flowers();
        System.out.println(myFlower.name());

        Rose myRose = new Rose();
        System.out.println(myRose.name());

        //Abstract
        User user = new User();
        System.out.println(user.information());


        //Interface
        System.out.println(roomName);

        Piano myPiano = new Piano();
        myPiano.brand="pa3x";
        myPiano.digital=true;
        myPiano.info();

    }
}
