package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.demo.dao.entity.CostType;
import com.example.demo.dao.mapper.CostTypeMapper;
import com.example.demo.service.CostTypeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class CostTypeServiceImpl extends ServiceImpl<CostTypeMapper, CostType> implements CostTypeService {

    @Resource
    private CostTypeMapper costTypeMapper;
    @Override
    public CostType inster() {
        return null;
    }

    @Override
    public CostType select(String costType) {
        return costTypeMapper.select(costType);
    }
}