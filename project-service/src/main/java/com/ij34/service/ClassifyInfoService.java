package com.ij34.service;

import com.ij34.model.ClassifyInfo;

import java.util.List;

public interface ClassifyInfoService {

    Integer insert(ClassifyInfo record);
    List<ClassifyInfo> select( );
}
