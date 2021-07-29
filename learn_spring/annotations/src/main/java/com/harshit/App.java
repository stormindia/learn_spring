package com.harshit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;
import java.lang.annotation.Annotation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //System.out.println( "Hello World!" );

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
