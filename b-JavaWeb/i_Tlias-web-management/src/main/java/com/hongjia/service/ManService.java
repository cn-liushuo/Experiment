package com.hongjia.service;

import com.hongjia.pojo.Man;

import java.util.List;

public interface ManService {
    /**
     * 查询列表数据
     */
    List<Man> getByVesselOrMonth(String vessel, String month);
}
