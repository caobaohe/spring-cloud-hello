package com.cbh.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

//    private final Logger logger = Logger.getLogger(GoodsController.class);

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @RequestMapping("/goods")
    public String goods(){
        //logger.info(discoveryClient);
        //return "商品服务：" + System.currentTimeMillis();
        return "商品服务";
    }
}
