package com.ruoyi.statistic.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.statistic.domain.JmrStudent;
import com.ruoyi.statistic.service.IJmrStudentService;
import com.ruoyi.statistic.service.impl.JmrStudentServiceImpl;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生t统计Controller
 * 
 * @author LiangLiang
 * @date 2020-09-27
 */
@Controller
@RequestMapping(value = "/student")
public class JmrStudentController {

    @Autowired
    private IJmrStudentService ijmrStudentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getList() {
        Map<String,Object> map = new HashMap<>();
        map.put("msg", "ok");
        map.put("data", ijmrStudentService.findAll());
        return map;
    }
}
