package com.hongjia.controller;

import com.hongjia.pojo.Dept;
import com.hongjia.pojo.Result;
import com.hongjia.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {

//     private static final Logger log = LoggerFactory.getLogger(DeptController.class);//固定的

    @Autowired
    private DeptService deptService;

    //@RequestMapping(value = "/depts", method = RequestMethod.GET)//method: 指定请求方式

    /**
     * 查询部门列表
     *
     * @return
     */
//    @GetMapping("/depts")
    @GetMapping
    public Result list() {
//        System.out.println("查询全部的部门数据");
        log.info("查询全部的部门数据");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }

    /**
     * 删除部门 - 方式一：HttpServletRequest 获取请求参数 不推荐
     * @param request
     * @return
     */
//    @DeleteMapping("/depts")
//    public Result delete(HttpServletRequest request) {
//        String idStr = request.getParameter("id");
//        int id = Integer.parseInt(idStr);
//        System.out.println("根据ID删除部门数据" + id);
//        return Result.success();
//

    /**
     * 删除部门 - 方式二：@RequestParam 获取请求参数
     * 注意事项：一旦声明了@RequestParam，该参数在请求时必须传递，如果不传递将会报错。（默认 required 为 true）
     *
     * @param deptId
     * @return
     */
//    @DeleteMapping("/depts")
//    public Result delete(@RequestParam(value = "id", required = false) Integer deptId) {
//        System.out.println("根据ID删除部门数据：" + deptId);
//        return Result.success();
//    }

    /**
     * 删除部门 - 方式三：省略@RequestParam（前端传递的请求参数名与服务端方法形参名一致） 【推荐】
     *
     * @param id
     * @return
     */
//    @DeleteMapping("/depts")
    @DeleteMapping
    public Result delete(Integer id) {
//        System.out.println("根据ID删除部门数据：" + id);
        log.info("根据ID删除部门数据：{}", id);
        deptService.deleteById(id);
        return Result.success();
    }

    /**
     * 新增部门
     *
     * @param dept
     * @return
     */
//    @PostMapping("/depts")
    @PostMapping
    public Result add(@RequestBody Dept dept) {
//        System.out.println("新增部门：" + dept);
        log.info("新增部门：{}", dept);
        deptService.add(dept);
        return Result.success();
    }

    /**
     * 根据ID查询部门
     * @param deptId
     * @return
     */
//    @GetMapping("/depts/{id}")
//    public Result getInfo(@PathVariable("id") Integer deptId){
//        System.out.println("根据ID查询部门：" + deptId);
//        return Result.success();
//    }

    /**
     * 根据ID查询部门
     *
     * @param id
     * @return
     */
//    @GetMapping("/depts/{id}")
    @GetMapping("/{id}")
    public Result getInfo(@PathVariable Integer id) {
//        System.out.println("根据ID查询部门：" + id);
        log.info("根据ID查询部门：{}", id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    /**
     * 修改部门
     *
     * @param dept
     * @return
     */
//    @PutMapping("/depts")
    @PutMapping
    public Result update(@RequestBody Dept dept) {
//        System.out.println("修改部门：" + dept);
        log.info("修改部门：{}", dept);
        deptService.update(dept);
        return Result.success();
    }
}
