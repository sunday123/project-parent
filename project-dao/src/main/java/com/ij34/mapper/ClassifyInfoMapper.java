package com.ij34.mapper;


import com.ij34.model.ClassifyInfo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


@Repository
public interface ClassifyInfoMapper extends Mapper<ClassifyInfo> {

    Integer insert2(ClassifyInfo record);

    List<ClassifyInfo> selectAll2();
}
