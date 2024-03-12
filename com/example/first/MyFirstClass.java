package com.example.first;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MyFirstClass {

    public String myFirst(){
        return "hello man";
    }
}
