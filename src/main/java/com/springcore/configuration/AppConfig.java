package com.springcore.configuration;


import com.springcore.classes.Airtel;
import com.springcore.classes.Jio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = "com.springcore")
public class AppConfig {

//    @Bean("jio")
//    public Jio getJioBean(){
//        return new Jio() ;
//    }
//
//    @Bean("airtel")
//    public Airtel getAirtelBean(){
//        return new Airtel() ;
//    }
}
