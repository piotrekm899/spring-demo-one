package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] fortunes = {"Your lucky day!","You're going to lose","Nothing to say"};


    @Override
    public String getFortune() {

        Random random = new Random();
        return fortunes[random.nextInt(2)];
    }
}
