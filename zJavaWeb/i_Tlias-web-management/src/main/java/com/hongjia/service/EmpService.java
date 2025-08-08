package com.hongjia.service;

import com.hongjia.pojo.Emp;
import com.hongjia.pojo.EmpQueryParam;
import com.hongjia.pojo.LoginInfo;
import com.hongjia.pojo.PageResult;

import java.util.List;

public interface EmpService {

    /**
     * 分页查询
     *
     * @param empQueryParam
     * @return
     */
    PageResult<Emp> page(EmpQueryParam empQueryParam);

    /**
     * 新增员工信息
     *
     * @param emp
     */
    void save(Emp emp);

    /**
     * 批量删除员工信息
     *
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 根据ID查询员工信息
     *
     * @param id
     * @return
     */
    Emp getInfo(Integer id);

    /**
     * 修改员工
     *
     * @param emp
     */
    void update(Emp emp);

    /**
     * 员工登录
     *
     * @param emp
     * @return
     */
    LoginInfo login(Emp emp);

    /**
     * 分页查询
     * @param page 页码
     * @param pageSize 每页展示的记录数
     * @return
     */
    // PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);
}
