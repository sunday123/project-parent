package com.ij34.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ij34.mapper.AddressInfoMapper;
import com.ij34.model.AddressInfo;
import com.ij34.service.IAddressInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyx
 * @since 2021-05-30
 */
@Service
public class AddressInfoServiceImpl implements IAddressInfoService {

    @Autowired
    AddressInfoMapper addressInfoMapper;

    @Override
    public List<AddressInfo> select(AddressInfo record) {
        return addressInfoMapper.selectList(new QueryWrapper<>(record));
    }

    @Override
    public AddressInfo insert(AddressInfo record) {
        if (addressInfoMapper.insert(record)>0){
            return record;
        }else {
            return null;
        }
    }
}
