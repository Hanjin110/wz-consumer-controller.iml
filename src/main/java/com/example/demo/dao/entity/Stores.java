package com.example.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class Stores implements Serializable {
    @TableId(value="id",type= IdType.ASSIGN_ID)
    private Long id;
    private Long userId;
    private String storesName;
    private String storesAddress;
    private String storesHeadPhoto;
    private String storesDisplayPhoto1;
    private String storesDisplayPhoto2;
    private String storesDisplayPhoto3;
    private String storesDisplayPhoto4;
    private String lng;
    private String lat;
    private int state;
    private Date createTime;
    private Date updateTime;
    private int deleted;
}
