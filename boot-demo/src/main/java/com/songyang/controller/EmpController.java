package com.songyang.controller;

import com.songyang.entity.Emp;
import com.songyang.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-22
 */
@Controller
public class EmpController {
    private final IEmpService empService;
    private EmpController(IEmpService empService){
        this.empService = empService;
    }
    @GetMapping("/getAll")
    @ResponseBody
    public List<Emp> testAll(){
        return empService.list();
    }
    @GetMapping("/")
    @ResponseBody
    public String index(){
        System.out.println("假设我是首页");
        return "index测试 --宋洋";
    }
}
