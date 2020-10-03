package com.ruoyi.job.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.job.domain.JmrRyStudent;
import com.ruoyi.job.service.IJmrRyStudentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生信息查询Controller
 * 
 * @author liangliang
 * @date 2020-10-02
 */
@Controller
@RequestMapping("/job/studentJob")
public class JmrRyStudentController extends BaseController
{
    private String prefix = "job/studentJob";

    @Autowired
    private IJmrRyStudentService jmrRyStudentService;

    @RequiresPermissions("job:studentJob:view")
    @GetMapping()
    public String studentJob()
    {
        return prefix + "/studentJob";
    }

    /**
     * 查询学生信息查询列表
     */
    @RequiresPermissions("job:studentJob:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrRyStudent jmrRyStudent)
    {
        startPage();
        List<JmrRyStudent> list = jmrRyStudentService.selectJmrRyStudentList(jmrRyStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生信息查询列表
     */
    @RequiresPermissions("job:studentJob:export")
    @Log(title = "学生信息查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JmrRyStudent jmrRyStudent)
    {
        List<JmrRyStudent> list = jmrRyStudentService.selectJmrRyStudentList(jmrRyStudent);
        ExcelUtil<JmrRyStudent> util = new ExcelUtil<JmrRyStudent>(JmrRyStudent.class);
        return util.exportExcel(list, "studentJob");
    }

    /**
     * 新增学生信息查询
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生信息查询
     */
    @RequiresPermissions("job:studentJob:add")
    @Log(title = "学生信息查询", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JmrRyStudent jmrRyStudent)
    {
        return toAjax(jmrRyStudentService.insertJmrRyStudent(jmrRyStudent));
    }

    /**
     * 修改学生信息查询
     */
    @GetMapping("/edit/{sId}")
    public String edit(@PathVariable("sId") Long sId, ModelMap mmap)
    {
        JmrRyStudent jmrRyStudent = jmrRyStudentService.selectJmrRyStudentById(sId);
        mmap.put("jmrRyStudent", jmrRyStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生信息查询
     */
    @RequiresPermissions("job:studentJob:edit")
    @Log(title = "学生信息查询", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JmrRyStudent jmrRyStudent)
    {
        return toAjax(jmrRyStudentService.updateJmrRyStudent(jmrRyStudent));
    }

    /**
     * 删除学生信息查询
     */
    @RequiresPermissions("job:studentJob:remove")
    @Log(title = "学生信息查询", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrRyStudentService.deleteJmrRyStudentByIds(ids));
    }
}
