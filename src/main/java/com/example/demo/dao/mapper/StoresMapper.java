package com.example.demo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.dao.entity.Stores;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StoresMapper extends BaseMapper<Stores> {
    //添加陈列照
    Stores insert(String storesDisplayPhoto1, String storesName);
    //根据门店名模糊查询
    List<Stores> like(String storesName);
}
