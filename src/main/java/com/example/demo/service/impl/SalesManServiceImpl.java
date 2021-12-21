package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.demo.dao.entity.SalesMan;
import com.example.demo.dao.mapper.SalesManMapper;
import com.example.demo.service.SalesManService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SalesManServiceImpl extends ServiceImpl<SalesManMapper, SalesMan> implements SalesManService {
    @Resource
    private SalesManMapper salesManMapper;


    @Override
    public SalesMan getByOpenId(String openId) {
        SalesMan salesMan=salesManMapper.getByOpenId(openId);
        return salesMan;
    }

    @Override
    public List<SalesMan>
      getbyresponsibleAreaId(Long responsibleAreaId) {
        return salesManMapper.selectresponsibleAreaId(responsibleAreaId);
    }
}
