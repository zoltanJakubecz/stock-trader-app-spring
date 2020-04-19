package com.codecool.traderapp.controller;


import com.codecool.traderapp.Trader;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DemoController {

    @Autowired
    private Trader trader;

    @RequestMapping("/buy/{stock}/{price}")
    public String buying(@PathVariable("stock") String stock, @PathVariable("price") String price) throws IOException, JSONException {
        double priceValue = Double.parseDouble(price);
        return trader.buy(stock, priceValue);
//        return stock + " " + priceValue;
    }
}
