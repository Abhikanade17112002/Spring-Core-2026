package com.springcore.classes;

import com.springcore.interfces.Sim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {
    @Autowired
    @Qualifier("jio")
    private Sim sim ;

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }
}
