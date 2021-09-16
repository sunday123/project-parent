package com.ij34.service.impl;

import com.ij34.model.ChildInfo;
import com.ij34.model.ClassifyInfo;
import com.ij34.service.ClassifyInfoService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ClassifyInfoServiceImpl implements ClassifyInfoService {




    @Override
    public Integer insert(ClassifyInfo record) {
        System.out.println("插入："+record.toString());
        try {
            int i=0;
            i=22000/i;
        }catch (Exception e){
            System.out.println("e::::"+e);
        }
        return 1;
    }

    @Override
    public List<ClassifyInfo> select() {
        List<ClassifyInfo> list =new ArrayList<>();
        int i=10;
        while (i-->0){
            list.add(new ClassifyInfo(1L,"MING",new ArrayList<ChildInfo>()));
        }
        return list;
    }
}
