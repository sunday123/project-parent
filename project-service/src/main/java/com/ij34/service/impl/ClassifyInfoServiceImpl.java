package com.ij34.service.impl;

import com.ij34.mapper.ClassifyInfoMapper;
import com.ij34.model.ClassifyInfo;
import com.ij34.model.ClassifyTypeEnum;
import com.ij34.service.ClassifyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClassifyInfoServiceImpl implements ClassifyInfoService {


    @Autowired
    ClassifyInfoMapper classifyInfoMapper;


    @Override
    public ClassifyInfo insert(ClassifyInfo record, ClassifyTypeEnum typeEnum) {
       return null;
    }
    @Override
    public int delete(ClassifyInfo record, ClassifyTypeEnum typeEnum) {
        return 0;
    }

    @Override
    public int update(ClassifyInfo record, ClassifyTypeEnum typeEnum) {
        return 0;
    }

    @Override
    public List<ClassifyInfo> select(ClassifyInfo record, ClassifyTypeEnum typeEnum) {
        return null;
    }

    @Override
    public int deleteBatchById(List<Long> list, ClassifyTypeEnum typeEnum) {
        return 0;
    }
}
