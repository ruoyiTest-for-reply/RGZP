package com.ruoyi.statistic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.statistic.service.ITjStudentService;

/**
 * 学生t统计Controller
 * 
 * @author LiangLiang
 * @date 2020-09-27
 */
@Controller
@RequestMapping(value = "/student")
public class TjStudentController {

    @Autowired
    private ITjStudentService itjStudentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList() {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", itjStudentService.findAll());
        return map;
    }
}
