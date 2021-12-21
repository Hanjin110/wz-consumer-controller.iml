package com.example.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class Cost implements Serializable {
    @TableId(value="id",type= IdType.ASSIGN_ID)
    private Long id;
    private Long userId;
    private Long salesmanId;
    private Long costTypeId;
    private int storesNum;
    private int price;
    private String market;
    private String promotionalProductsName;
    private String promotionalObjective;
    private String promotionalObj;
    private Date promotionalStartTime;
    private Date promotionalEndTime;
    private String promotionalMode;
    private int salesForecast;
    private String costShare;
    private int costProportion;
    private String nucleusMode;
    private int costState;
}
