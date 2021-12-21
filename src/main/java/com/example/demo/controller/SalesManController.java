package com.example.demo.controller;


import com.example.demo.dao.entity.ResponsibleArea;
import com.example.demo.dao.entity.SalesMan;
import com.example.demo.service.ResponsibleAreaService;
import com.example.demo.service.SalesManService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;



@RestController
@AllArgsConstructor
@RequestMapping("/SalesMan")
public class SalesManController {
    @Resource
    private ResponsibleAreaService responsibleAreaService;
    @Resource
    private SalesManService salesManService;
    /**
     * 通过responsibleArea查询表
     *
     * @param responsibleArea
     * @return R
     */
    @ApiOperation(value = "通过String responsibleArea查询", notes = "通过String responsibleArea查询")
    @PostMapping ("/responsibleArea")
    public List<SalesMan> get(String responsibleArea) {

        ResponsibleArea responsibleArea1=responsibleAreaService.selectresponsibleArea(responsibleArea);
        List list=salesManService.getbyresponsibleAreaId(responsibleArea1.getId());
       return list;
    }







}
