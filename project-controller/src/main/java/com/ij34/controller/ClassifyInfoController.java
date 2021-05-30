package com.ij34.controller;

/**
 * <p>
 * 废品回收:大类、小类、规格 前端控制器
 * </p>
 *
 */

import com.ij34.service.ClassifyInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(tags = "物品")
@RestController
@RequestMapping("/classify")
public class ClassifyInfoController {

    @Autowired
    ClassifyInfoService classifyInfoService;


    /**
     * 新增数据
     * @param record 实体对象
     * @return 新增结果
     */
/*
    @ApiOperation(value = "新增数据")
    @PostMapping("/insert")
    public ClassifyInfo insert(@RequestBody ClassifyInfo record) {
        System.out.println("插入数据啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊"+record.toString());
        return classifyInfoService.insert(record);
    }
*/


}
