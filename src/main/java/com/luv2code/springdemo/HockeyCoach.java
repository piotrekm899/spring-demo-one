package com.luv2code.springdemo;

public class HockeyCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "ice skate 5 circles";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
