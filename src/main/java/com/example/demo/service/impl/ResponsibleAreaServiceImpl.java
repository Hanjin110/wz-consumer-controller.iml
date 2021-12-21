package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.demo.dao.entity.ResponsibleArea;
import com.example.demo.dao.mapper.ResponsibleAreaMapper;
import com.example.demo.service.ResponsibleAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ResponsibleAreaServiceImpl extends ServiceImpl<ResponsibleAreaMapper, ResponsibleArea> implements ResponsibleAreaService {

    @Resource
    private ResponsibleAreaMapper responsibleAreaMapper;
    @Override
    public ResponsibleArea selectresponsibleArea(String responsibleArea) {
        return responsibleAreaMapper.selectresponsibleArea(responsibleArea);
    }
}
