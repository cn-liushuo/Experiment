package com.hongjia.service;

import com.hongjia.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有的部门
     *
     * @return
     */
    List<Dept> findAll();

    /**
     * 根据ID删除部门
     *
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 新增部门
     *
     * @param dept
     */
    void add(Dept dept);

    /**
     * 根据ID查询部门数据
     *
     * @param id
     * @return
     */
    Dept getById(Integer id);

    /**
     * 修改部门
     *
     * @param dept
     */
    void update(Dept dept);
}
