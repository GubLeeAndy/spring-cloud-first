package com.example.product.controller;

import com.example.api.util.Result;
import com.example.product.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product", produces = "application/json; charset=utf-8")
public class ProductInfoController {
    @Autowired
    private ProductInfoService productInfoService;

    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    public Result findAll(){
        return productInfoService.findAll();
    }
}
