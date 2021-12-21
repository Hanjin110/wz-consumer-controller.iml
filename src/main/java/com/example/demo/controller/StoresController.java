package com.example.demo.controller;


import com.example.demo.dao.entity.Stores;
import com.example.demo.service.StoresService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/stores")
@Api(value = "stores", tags = "门店")
public class StoresController {
    @Resource
    private StoresService storesService;
    @ApiOperation(value = "新增陈列照", notes = "新增陈列照")
    @PostMapping("/add")
    public Stores insert(String storesDisplayPhoto1, String storesName) {
        Stores stores=storesService.insert(storesDisplayPhoto1,storesName);
        return stores;
    }
    @ApiOperation(value = "模糊查询", notes = "模糊查询")
    @PostMapping("/like")
    public List<Stores> like(String storesName){
        List list=storesService.like(storesName);
        return list;
    }
}
