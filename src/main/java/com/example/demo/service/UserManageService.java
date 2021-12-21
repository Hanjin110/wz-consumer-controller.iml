package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.dao.entity.UserManage;
import java.util.List;

public interface UserManageService extends IService<UserManage> {
    //根据手机号获取基本信息
    List<UserManage> getByphone(String userPhone);
}
