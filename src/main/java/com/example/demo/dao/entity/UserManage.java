package com.example.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@Data
@Accessors(chain = true)
public class UserManage implements Serializable {
    @TableId(value="id",type= IdType.ASSIGN_ID)
    private Long id;
    private String userName;
    private String passWord;
    private String userHead;
    private String userPhone;
    private Long responsibleAreaId;
    private Long levelId;
    private String realName;
    private String email;
    private Date loginTime;
    private int state;
    private Date createTime;
    private Date updateTime;
    private int deleted;
}
