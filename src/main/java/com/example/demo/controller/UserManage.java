package com.example.demo.controller;


import com.example.demo.dao.entity.SalesMan;
import com.example.demo.service.SalesManService;
import com.example.demo.service.UserManageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.List;



@RestController
@AllArgsConstructor
@RequestMapping("/userManage")
@Api(value = "userManage", tags = "业务员基本资料")
public class UserManage {
    @Resource
    private  UserManageService userManageService;
    @Resource
    private  SalesManService salesManService;
    /**
     * 通过openId查询表
     *
     * @param openId
     * @return R
     */
    @ApiOperation(value = "通过openId查询", notes = "通过openId查询")
    @GetMapping("/{openId}")
    public List<UserManage> get(@PathVariable("openId") String openId) {

        SalesMan salesMan=salesManService.getByOpenId(openId);
        List list=userManageService.getByphone(salesMan.getMobile());

        return list;
    }


}
