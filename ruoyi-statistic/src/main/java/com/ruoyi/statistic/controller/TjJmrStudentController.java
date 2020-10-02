package com.ruoyi.statistic.controller;

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
import com.ruoyi.statistic.domain.TjJmrStudent;
import com.ruoyi.statistic.service.ITjJmrStudentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生统计Controller
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
@Controller
@RequestMapping("/statistic/student")
public class TjJmrStudentController extends BaseController
{
    private String prefix = "statistic/student";

    @Autowired
    private ITjJmrStudentService tjJmrStudentService;

    @RequiresPermissions("statistic:student:view")
    @GetMapping()
    public String student()
    {
        return prefix + "/student";
    }

    /**
     * 查询学生统计列表
     */
    @RequiresPermissions("statistic:student:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TjJmrStudent tjJmrStudent)
    {
        startPage();
        List<TjJmrStudent> list = tjJmrStudentService.selectTjJmrStudentList(tjJmrStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生统计列表
     */
    @RequiresPermissions("statistic:student:export")
    @Log(title = "学生统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TjJmrStudent tjJmrStudent)
    {
        List<TjJmrStudent> list = tjJmrStudentService.selectTjJmrStudentList(tjJmrStudent);
        ExcelUtil<TjJmrStudent> util = new ExcelUtil<TjJmrStudent>(TjJmrStudent.class);
        return util.exportExcel(list, "student");
    }

    /**
     * 新增学生统计
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生统计
     */
    @RequiresPermissions("statistic:student:add")
    @Log(title = "学生统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TjJmrStudent tjJmrStudent)
    {
        return toAjax(tjJmrStudentService.insertTjJmrStudent(tjJmrStudent));
    }

    /**
     * 修改学生统计
     */
    @GetMapping("/edit/{sId}")
    public String edit(@PathVariable("sId") Long sId, ModelMap mmap)
    {
        TjJmrStudent tjJmrStudent = tjJmrStudentService.selectTjJmrStudentById(sId);
        mmap.put("tjJmrStudent", tjJmrStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生统计
     */
    @RequiresPermissions("statistic:student:edit")
    @Log(title = "学生统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TjJmrStudent tjJmrStudent)
    {
        return toAjax(tjJmrStudentService.updateTjJmrStudent(tjJmrStudent));
    }

    /**
     * 删除学生统计
     */
    @RequiresPermissions("statistic:student:remove")
    @Log(title = "学生统计", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tjJmrStudentService.deleteTjJmrStudentByIds(ids));
    }
}
