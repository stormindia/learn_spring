package com.harshit;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;
import org.springframework.context.support.*;

import java.applet.AppletContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/storm/Desktop/learn_spring/src/spring.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("~/Desktop/learn_spring/src/spring.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/storm/Desktop/learn_spring/src/main/java/com/harshit/spring.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("file:spring.xml");
//        Vehicle obj = (Vehicle)context.getBean("car");
//        obj.drive();

        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);

        Car obj = (Car) context.getBean("car");
        obj.drive();

    }
}
