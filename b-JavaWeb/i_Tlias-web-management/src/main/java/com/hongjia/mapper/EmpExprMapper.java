package com.hongjia.mapper;

import com.hongjia.pojo.EmpExpr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 员工工作经历
 */
@Mapper
public interface EmpExprMapper {
    /**
     * 批量保存员工的工作经历信息
     *
     * @param exprList
     */
    void insertBatch(List<EmpExpr> exprList);

    /**
     * 根据员工ID毗连删除员工工作经历
     *
     * @param empIds
     */
    void deleteByEmpIds(List<Integer> empIds);
}
