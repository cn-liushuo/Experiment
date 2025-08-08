package com.hongjia.service;

import com.hongjia.pojo.JobOption;
import com.hongjia.pojo.StudentOption;

import java.util.List;
import java.util.Map;

public interface ReportService {
    /**
     * 统计员工职位人数
     */
    JobOption getEmpJobData();

    /**
     * 统计员工性别人数
     */
    List<Map<String, Object>> getEmpGenderData();

    /**
     * 统计班级人数
     */
    StudentOption getStudentCountData();
}
