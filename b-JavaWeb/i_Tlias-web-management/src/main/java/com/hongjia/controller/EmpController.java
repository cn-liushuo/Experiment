package com.hongjia.controller;

import com.hongjia.pojo.Emp;
import com.hongjia.pojo.EmpQueryParam;
import com.hongjia.pojo.PageResult;
import com.hongjia.pojo.Result;
import com.hongjia.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 员工管理
 */
@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    /**
     * 分页查询
     *
     * @return
     */
    // @GetMapping
    // public Result page(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize, String name, Integer gender, @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin, @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
    //     log.info("分页查询：{},{},{},{},{},{}", page, pageSize,name, gender, begin, end);
    //     PageResult<Emp> pageResult = empService.page(page, pageSize,name,gender,begin,end);
    //     return Result.success(pageResult);
    // }

    /**
     * 分页查询
     *
     * @return
     */
    @GetMapping
    public Result page(EmpQueryParam empQueryParam) {
        log.info("分页查询：{}", empQueryParam);
        PageResult<Emp> pageResult = empService.page(empQueryParam);
        return Result.success(pageResult);
    }

    /**
     * 新增员工
     *
     * @param emp
     * @return
     */
    @PostMapping
    public Result save(@RequestBody Emp emp) {
        log.info("新增员工：{}", emp);
        empService.save(emp);
        return Result.success();
    }

    /**
     * 删除员工 - 数组
     * @param ids
     * @return
     */
    /*@DeleteMapping
    public Result delete(Integer[] ids){
        log.info("删除员工信息,{}", Arrays.toString(ids));
        return Result.success();
    }*/

    /**
     * 删除员工 - List集合
     *
     * @param ids
     * @return
     */
    @DeleteMapping
    public Result delete(@RequestParam List<Integer> ids) {
        log.info("删除员工信息,{}", ids);
        empService.delete(ids);
        return Result.success();
    }

    /**
     * 根据ID查询员工信息
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getInfo(@PathVariable Integer id) {
        log.info("根据ID查询员工信息，{}", id);
        Emp emp = empService.getInfo(id);
        return Result.success(emp);
    }

    /**
     * 修改员工
     *
     * @param emp
     * @return
     */
    @PutMapping
    public Result update(@RequestBody Emp emp) {
        log.info("修改员工,{}", emp);
        empService.update(emp);
        return Result.success();
    }
}
