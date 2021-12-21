package com.example.demo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.dao.entity.CostType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CostTypeMapper extends BaseMapper<CostType> {
    CostType select(String costType );
}
