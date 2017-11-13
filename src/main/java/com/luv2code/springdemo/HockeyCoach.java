package com.luv2code.springdemo;

public class HockeyCoach implements Coach{

    private FortuneService fortuneService;

    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public HockeyCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "ice skate 5 circles";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
