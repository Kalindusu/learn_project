package com.example.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class dev {
    @Autowired //field injection
private  Laptop laptop;

    //constructor injection
    public dev(Laptop laptop){
        this.laptop=laptop;
    }

    //setter injection
    @Autowired
    public void setLaptop(Laptop laptop){
        this.laptop=laptop;
    }
    public void build(){
        laptop.compile();
        System.out.println("Working on the awesome project");
    }
}
