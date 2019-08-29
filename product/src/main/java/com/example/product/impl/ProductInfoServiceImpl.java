package com.example.product.impl;

import com.example.api.entity.ProductInfo;
import com.example.api.util.CodeEnum;
import com.example.api.util.Result;
import com.example.product.dao.ProductInfoMapper;
import com.example.product.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public Result findAll() {
        List<ProductInfo> all = productInfoMapper.findAll();
        return Result.success(CodeEnum.SUCCESS,all);
    }
}
