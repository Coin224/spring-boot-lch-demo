package com.lch.controller;

import com.lch.domain.Food;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    /**
     * 从配置文件中获取值
     */
    @Value("${food.rice}")
    private String rice;
    @Value("${food.meat}")
    private String meat;

    @RequestMapping("/json")
    public Food json() {
        Food food = new Food();
        food.setRice(rice);
        food.setMeat(meat);

        return food;
    }
}
