package com.ij34.mapper;


import com.ij34.model.ClassifyInfo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * <p>
 * 废品回收:大类、小类、规格 Mapper 接口
 * </p>
 *
 * @author gdlv
 * @since 2021-05-23
 */
@Repository
public interface ClassifyInfoMapper extends Mapper<ClassifyInfo> {

}
