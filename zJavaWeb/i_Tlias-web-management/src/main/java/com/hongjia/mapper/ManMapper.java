package com.hongjia.mapper;

import com.hongjia.pojo.Man;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ManMapper {

    // 根据船名查询数据
    List<Man> getByVesselOrMonth(@Param("vessel") String vessel, @Param("month") String month);
}
