package com.example.demo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.dao.entity.SalesMan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SalesManMapper extends BaseMapper<SalesMan> {
    //根据opid获取手机号
    SalesMan getByOpenId(String openId);

    //根据区域获取业务员列表
    List<SalesMan> selectresponsibleAreaId(Long responsibleareaId);
}
