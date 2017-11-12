package com.luv2code.springdemo;

public class BaseballCoach implements com.luv2code.springdemo.Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30min on batting practice";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}
