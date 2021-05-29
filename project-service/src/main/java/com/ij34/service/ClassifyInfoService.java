package com.ij34.service;

import com.ij34.model.ClassifyInfo;
import com.ij34.model.ClassifyTypeEnum;

import java.util.List;

public interface ClassifyInfoService {

    ClassifyInfo insert(ClassifyInfo record, ClassifyTypeEnum typeEnum);
    int delete(ClassifyInfo record, ClassifyTypeEnum typeEnum);
    int update(ClassifyInfo record, ClassifyTypeEnum typeEnum);
    List<ClassifyInfo> select(ClassifyInfo record, ClassifyTypeEnum typeEnum);
    int deleteBatchById(List<Long> list, ClassifyTypeEnum typeEnum);
}
