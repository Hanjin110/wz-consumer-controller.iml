package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.demo.dao.entity.Stores;
import com.example.demo.dao.mapper.StoresMapper;
import com.example.demo.service.StoresService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StoresServicesImpl extends ServiceImpl<StoresMapper, Stores> implements StoresService {
   @Resource
   private  StoresMapper storesMapper;
    @Override
    public Stores insert(String storesDisplayPhoto1, String storesName) {
        return storesMapper.insert(storesDisplayPhoto1,storesName);
    }

    @Override
    public List<Stores> like(String storesName) {
        return storesMapper.like(storesName);
    }
}
