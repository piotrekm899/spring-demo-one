package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve a bean from the spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        //call the method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call new methods
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();

    }
}
