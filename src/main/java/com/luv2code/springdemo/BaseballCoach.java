package com.luv2code.springdemo;

public class BaseballCoach implements com.luv2code.springdemo.Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30min on batting practice";
    }
}
