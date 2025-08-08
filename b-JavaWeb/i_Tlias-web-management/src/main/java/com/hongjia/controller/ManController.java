package com.hongjia.controller;

import com.hongjia.pojo.Man;
import com.hongjia.pojo.Result;
import com.hongjia.service.ManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/man")
@RestController
@CrossOrigin(origins = "http://localhost:5173") // 允许指定来源
public class ManController {

    @Autowired
    private ManService manService;

    /**
     * 查询列表数据
     */
    @GetMapping
    public Result getByVesselOrMonth(@RequestParam(required = false) String vessel, @RequestParam(required = false) String month) {
        List<Man> manList = manService.getByVesselOrMonth(vessel, month);
        return Result.success(manList);
    }
}
