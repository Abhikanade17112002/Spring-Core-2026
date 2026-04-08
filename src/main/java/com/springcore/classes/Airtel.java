package com.springcore.classes;

import com.springcore.interfces.Sim;

public class Airtel implements Sim {

    @Override
    public String call() {
        return "Calling With Airtel" ;
    }

    @Override
    public String data() {
        return  "Using Data With Airtel" ;
    }
}
