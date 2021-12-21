package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.demo.dao.entity.UserManage;
import com.example.demo.dao.mapper.UserManageMapper;
import com.example.demo.service.UserManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserManageServiceImpl extends ServiceImpl<UserManageMapper, UserManage> implements UserManageService {
    @Resource
    private UserManageMapper userManageMapper;
    @Override
    public List<UserManage> getByphone(String userPhone) {
        return userManageMapper.getByphone(userPhone);
    }
}
