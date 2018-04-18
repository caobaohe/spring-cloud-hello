package com.cbh.springcloud.controller;

import com.cbh.springcloud.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/order")
    public String order() {
        return goodsService.getGoodsById();
    }


}