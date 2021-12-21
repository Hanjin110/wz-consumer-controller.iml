package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.dao.entity.ResponsibleArea;

public interface ResponsibleAreaService extends IService<ResponsibleArea> {
   //通过区域名获取区域id
    ResponsibleArea selectresponsibleArea(String responsibleArea);
}
