package com.elite.springbootbootstrap.controller;

import com.elite.springbootbootstrap.model.Deptment;
import com.elite.springbootbootstrap.service.DeptmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * 返回页面不要用restcontroller
 */
@Controller
public class DeptmentController {

    @Autowired
    DeptmentService deptmentService;

    //查询所有员工返回列表页面
    @GetMapping("//depts")
    public String  list(Model model){
        Collection<Deptment> depts = deptmentService.getDeptList();

        //放在请求域中
        model.addAttribute("depts",depts);
        // thymeleaf默认就会拼串
        // classpath:/templates/xxxx.html
        return "dept/list";
    }


    @GetMapping("/getDeptList")
    public List<Deptment> getDeptmentList(){
        return deptmentService.getDeptList();
    }

    @GetMapping("/getDeptment")
    public Deptment getDeptment(@RequestParam("deptid") String deptid){
        return deptmentService.getDeptment(deptid);
    }


}
