package com.ij34.service.impl;

import com.ij34.mapper.ClassifyInfoMapper;
import com.ij34.model.ClassifyInfo;
import com.ij34.service.ClassifyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClassifyInfoServiceImpl implements ClassifyInfoService {


    @Autowired
    ClassifyInfoMapper classifyInfoMapper;

    @Override
    public Integer insert(ClassifyInfo record) {
        return classifyInfoMapper.insert2(record);
    }

    @Override
    public List<ClassifyInfo> select() {
        return classifyInfoMapper.selectAll2();
    }
}
