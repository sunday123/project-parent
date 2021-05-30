package com.ij34.controller;

import com.ij34.model.AddressInfo;
import com.ij34.service.IAddressInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lyx
 * @since 2021-05-30
 */
@Api(tags = "address")
@RestController
@RequestMapping("/address")
public class AddressInfoController {

    @Autowired
    IAddressInfoService addressInfoService;

    @ApiOperation(value = "增")
    @PostMapping("/insert")
    public AddressInfo insert(@RequestBody AddressInfo record) {
       return addressInfoService.insert(record);
    }

    @ApiOperation(value = "查找")
    @PostMapping("/select")
    public List<AddressInfo> select(@RequestBody AddressInfo record) {
        return addressInfoService.select(record);

    }

}
