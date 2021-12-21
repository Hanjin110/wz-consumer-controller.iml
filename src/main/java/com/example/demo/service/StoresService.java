package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.dao.entity.Stores;

import java.util.List;

public interface StoresService extends IService<Stores> {

    //添加陈列照
    Stores insert(String storesDisplayPhoto1,String storesName);
    //根据门店名模糊查询
    List<Stores> like(String storesName);
}
