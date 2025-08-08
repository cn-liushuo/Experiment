package com.hongjia.service.impl;

import com.hongjia.mapper.ManMapper;
import com.hongjia.pojo.Man;
import com.hongjia.service.ManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManServiceImpl implements ManService {

    @Autowired
    private ManMapper manMapper;

    @Override
    public List<Man> getByVesselOrMonth(String vessel, String month) {
        return manMapper.getByVesselOrMonth(vessel, month);
    }
}
