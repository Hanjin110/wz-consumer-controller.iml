package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.commom.util.Http;



import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import java.util.Map;

@RestController
@RequestMapping("/getUserWXInfo")
@AllArgsConstructor

public class WxQiYeInfo {
    @ApiOperation(value = "第三方授权", notes = "企业微信授权")
    @GetMapping("/code")
    public Map<String, Object> getUserWXInfo(String code) throws JSONException {
        Map<String, Object> map = new HashMap<>();
        //小程序唯一标识   (在微信小程序管理后台获取)
        String wxspAppid = "wx477a405d265e1d00";
        //小程序的 app secret (在微信小程序管理后台获取)
        String wxspSecret = "07f8f7e5d3080d33af94986dc6ae33f9";

        //请求参数
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret ;
        //发送请求
        String sr = Http.sendGet("https://qyapi.weixin.qq.com/cgi-bin/gettoken?", params);
        //解析相应内容（转换成json对象）
        JSONObject json = JSON.parseObject(sr);
        String access_token = json.get("access_token").toString();
        String param = "access_token=" +access_token  + "&js_code=" + code+"grant_type=authorization_code";

        String s= Http.sendGet("https://qyapi.weixin.qq.com/cgi-bin/miniprogram/jscode2session?",param);
        JSONObject json1 =JSON.parseObject(s);
        String userid=json1.get("userid").toString();
        String corpid=json1.get("corpid").toString();
        //权限校验
        if(corpid.equals(wxspAppid)){
            String param1 = "access_token=" +access_token  + "&userid="+userid ;
            String S1=Http.sendGet("https://qyapi.weixin.qq.com/cgi-bin/user/get?",param1);
            JSONObject json2 =JSON.parseObject(S1);
            String errMsg=json2.getString("errMsg").toString();
            String name=json2.getString("name").toString();
            String telephone=json2.getString("telephone").toString();
            if(errMsg.equals("ok")){
                map.put("access_token",access_token);
                map.put("userid",userid);
                map.put("name",name);
                map.put("telephone",telephone);
                map.put("msg", "success");
            }

        }else{
            map.put("msg", "无权限");
        }

        return map;
    }
}
