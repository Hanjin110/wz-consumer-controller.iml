package com.example.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@TableName(value = "costType")//
public class CostType implements Serializable {
    @TableId(value="id",type= IdType.ASSIGN_ID)
    private Long id;
    private String costType;


}
