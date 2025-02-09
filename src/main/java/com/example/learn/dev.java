package com.example.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class dev {
    @Autowired //field injection
private  Laptop laptop;
    public void build(){
        laptop.compile();
        System.out.println("Working on the awesome project");
    }
}
