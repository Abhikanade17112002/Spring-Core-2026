package com.springcore.components;

import com.springcore.interfces.Sim;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("airtel")
//@Primary
public class Airtel implements Sim {
    @Override
    public String call() {
        return "Calling With Airtel";
    }

    @Override
    public String data() {
        return "Using Data With Airtel";
    }
}
