package com.example.demo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.dao.entity.ResponsibleArea;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResponsibleAreaMapper extends BaseMapper<ResponsibleArea> {
    ResponsibleArea selectresponsibleArea(String responsibleArea);
}
