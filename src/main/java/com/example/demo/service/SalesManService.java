package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.dao.entity.SalesMan;


import java.util.List;


public interface SalesManService extends IService<SalesMan> {
    //根据opid获取手机号
    SalesMan  getByOpenId(String openId);
    //根据区域id获取业务员列表
    List<SalesMan> getbyresponsibleAreaId(Long responsibleAreaId);
}
