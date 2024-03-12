package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private MyFirstClass myFirstClass;

    public String myService(){
        return "service and"+myFirstClass.myFirst();
    }

}
