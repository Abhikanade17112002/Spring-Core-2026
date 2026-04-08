package com.springcore;

import com.springcore.classes.Airtel;
import com.springcore.classes.Jio;
import com.springcore.classes.Mobile;
import com.springcore.configuration.AppConfig;
import com.springcore.interfces.Sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {


        // Without Dependency Injection And IoC

//        Sim jio = new Jio() ;
//
//        Sim airtel = new Airtel() ;
//
//        System.out.println(jio.call() + "  " + jio.data() );
//
//        System.out.println(airtel.call() + "  " + airtel.data() );

//         Ioc With XML Based Config
//           ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//           Sim Airtel = context.getBean("sim", Airtel.class) ;
//           System.out.println(Airtel.call() + "  " + Airtel.data() );

//        IoC With Config Class

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        Sim airtel = context.getBean("airtel", Airtel.class) ;
//
//        System.out.println(airtel.call() + " " + airtel.data());



//         IoC With Annotation Based

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class) ;

//        Sim jio = context.getBean(Sim.class) ;

        Mobile mobile = context.getBean(Mobile.class) ;

        System.out.println(mobile.getSim().call() + " " + mobile.getSim().data());








        }
    }
