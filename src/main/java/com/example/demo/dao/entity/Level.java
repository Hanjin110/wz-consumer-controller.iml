package com.example.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class Level implements Serializable {
    @TableId(value="id",type= IdType.ASSIGN_ID)
    private long id;
    private String level;
    private int state;
    private Date createTime;
    private Date updateTime;
    private int deleted;
}
