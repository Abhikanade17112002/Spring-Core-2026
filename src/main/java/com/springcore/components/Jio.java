package com.springcore.components;

import com.springcore.interfces.Sim;
import org.springframework.stereotype.Component;


@Component("jio")
public class Jio implements Sim {
    @Override
    public String call() {
        return "Calling With Jio" ;
    }

    @Override
    public String data() {
        return "Using Data With Jio" ;
    }
}
