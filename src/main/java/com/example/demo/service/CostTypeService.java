package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.dao.entity.CostType;



public interface CostTypeService extends IService<CostType> {
    //添加费用申请

    CostType inster();

//根据费用类型获取其id

    CostType select(String costType );

}
