package com.cbh.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoodsService {

    @Autowired
    private RestTemplate restTemplate;

    public String getGoodsById(){
        return restTemplate.getForObject("http://GOODS-SERVICE/goods", String.class);
    }

}
