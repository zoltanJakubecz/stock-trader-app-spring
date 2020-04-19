package com.codecool.traderapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TraderappApplication {

    @Autowired
    private Logger logger;

    @Autowired
    private StockAPIService stockAPIService;

    @Autowired
    private Trader trader;

    public static void main(String[] args) {
        SpringApplication.run(TraderappApplication.class, args);
    }

}
