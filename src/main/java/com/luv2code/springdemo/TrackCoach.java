package com.luv2code.springdemo;

public class TrackCoach implements com.luv2code.springdemo.Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5km";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it!" + fortuneService.getFortune();
    }
}
