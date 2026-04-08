package com.springcore.classes;

import com.springcore.interfces.Sim;

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
