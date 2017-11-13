package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach myCoach = context.getBean("myCoach",Coach.class);
        Coach yourCoach = context.getBean("myCoach",Coach.class);

        boolean result = (myCoach==yourCoach);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\n Memory location for myCoach: " + myCoach);
        System.out.println("\n Memory location for yourCoach: " + yourCoach);

        context.close();

    }
}
