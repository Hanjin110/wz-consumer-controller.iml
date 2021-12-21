package com.example.demo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.dao.entity.UserManage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserManageMapper extends BaseMapper<UserManage> {
    //根据手机号获取基本信息
    List<UserManage> getByphone(String userPhone);
}
