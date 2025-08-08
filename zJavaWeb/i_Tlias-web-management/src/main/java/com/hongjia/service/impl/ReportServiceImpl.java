package com.hongjia.service.impl;

import com.hongjia.mapper.EmpMapper;
import com.hongjia.pojo.JobOption;
import com.hongjia.pojo.StudentOption;
import com.hongjia.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public JobOption getEmpJobData() {
        // 1.调用mapper接口，获取统计数据
        List<Map<String, Object>> list = empMapper.countEmpJobData(); // map: pos=校验主管, num=1

        // 2.组装结果，并返回
        List<Object> jobList = list.stream().map(dataMap -> dataMap.get("pos")).toList();
        List<Object> dataList = list.stream().map(dataMap -> dataMap.get("num")).toList();

        return new JobOption(jobList, dataList);
    }

    @Override
    public List<Map<String, Object>> getEmpGenderData() {
        return empMapper.countEmpGenderData();
    }

    @Override
    public StudentOption getStudentCountData() {
        List<Map<String, Object>> list = empMapper.countEmpStudentData();

        List<Object> classList = list.stream().map(dataMap -> dataMap.get("class_name")).toList();
        List<Object> dataList = list.stream().map(dataMap -> dataMap.get("num")).toList();
        return new StudentOption(classList, dataList);
    }
}
