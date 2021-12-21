package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.commom.util.Http;
import com.example.demo.commom.util.WXBizDataCrypt;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.json.JSONException;

import org.springframework.web.bind.annotation.*;
import java.lang.String;




@RestController
@RequestMapping("/getUserWXInfo")
@AllArgsConstructor
@Api(value = "手机号授权", tags = "手机号授权")
public class MiniProgramLogin {
    //小程序 AppID
    private static final String appid = "wx477a405d265e1d00";
    //小程序 AppSecret
    private static final String secret = "07f8f7e5d3080d33af94986dc6ae33f9";

    /**
     * 小程序授权登录
     * @return
     */
    @ApiOperation(value = "通过code，encryptedData，iv", notes = "code，encryptedData，iv")
    @PostMapping(value = "/miniLogin")
    @ResponseBody
    public cn.hutool.json.JSONObject miniLogin(String code, String encryptedData, String iv) throws JSONException {



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
        String s=Http.sendGet("https://qyapi.weixin.qq.com/cgi-bin/miniprogram/jscode2session?",param);
        JSONObject json1 =JSON.parseObject(s);
        String sessionKey=json1.getString("sessionKey").toString();
        cn.hutool.json.JSONObject jsonObject= WXBizDataCrypt.getUserInfo(encryptedData,iv,sessionKey);
         return jsonObject;
    }
}
