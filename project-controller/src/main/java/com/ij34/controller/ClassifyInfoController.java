package com.ij34.controller;

/**
 * <p>
 * 废品回收:大类、小类、规格 前端控制器
 * </p>
 *
 */

import com.ij34.model.ClassifyInfo;
import com.ij34.service.ClassifyInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "物品")
@RestController
@RequestMapping("/classify")
public class ClassifyInfoController {

    @Autowired
    ClassifyInfoService classifyInfoService;




    @ApiOperation(value = "新增数据")
    @PostMapping("/insert")
    public Integer insert(@RequestBody ClassifyInfo record) {
        return classifyInfoService.insert(record);
    }
    @ApiOperation(value = "查找数据")
    @GetMapping("/select")
    public List<ClassifyInfo> select() {
        return classifyInfoService.select();
    }


}
