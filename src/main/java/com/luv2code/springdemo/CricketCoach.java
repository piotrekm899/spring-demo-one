package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;


    public CricketCoach() {
        //System.out.println("CricketCoach:no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        //System.out.println("Cricket setter");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        //System.out.println("Cricket email setter");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        //System.out.println("Cricket team setter");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 20mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
