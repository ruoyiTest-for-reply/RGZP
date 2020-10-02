package com.ruoyi.enterprise.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.enterprise.domain.JmrJob;
import com.ruoyi.enterprise.service.IJmrJobService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 企业岗位要求Controller
 * 
 * @author liangliang
 * @date 2020-09-28
 */
@Controller
@RequestMapping("/enterprise/job")
public class JmrJobController extends BaseController
{
    private String prefix = "enterprise/job";

    @Autowired
    private IJmrJobService jmrJobService;

    @RequiresPermissions("enterprise:job:view")
    @GetMapping()
    public String job()
    {
        return prefix + "/job";
    }

    /**
     * 查询企业岗位要求列表
     */
    @RequiresPermissions("enterprise:job:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrJob jmrJob)
    {
        startPage();
        List<JmrJob> list = jmrJobService.selectJmrJobList(jmrJob);
        return getDataTable(list);
    }

    /**
     * 导出企业岗位要求列表
     */
    @RequiresPermissions("enterprise:job:export")
    @Log(title = "企业岗位要求", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JmrJob jmrJob)
    {
        List<JmrJob> list = jmrJobService.selectJmrJobList(jmrJob);
        ExcelUtil<JmrJob> util = new ExcelUtil<JmrJob>(JmrJob.class);
        return util.exportExcel(list, "job");
    }

    /**
     * 新增企业岗位要求
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存企业岗位要求
     */
    @RequiresPermissions("enterprise:job:add")
    @Log(title = "企业岗位要求", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JmrJob jmrJob)
    {
        return toAjax(jmrJobService.insertJmrJob(jmrJob));
    }

    /**
     * 修改企业岗位要求
     */
    @GetMapping("/edit/{jId}")
    public String edit(@PathVariable("jId") Long jId, ModelMap mmap)
    {
        JmrJob jmrJob = jmrJobService.selectJmrJobById(jId);
        mmap.put("jmrJob", jmrJob);
        return prefix + "/edit";
    }

    /**
     * 修改保存企业岗位要求
     */
    @RequiresPermissions("enterprise:job:edit")
    @Log(title = "企业岗位要求", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JmrJob jmrJob)
    {
        return toAjax(jmrJobService.updateJmrJob(jmrJob));
    }

    /**
     * 删除企业岗位要求
     */
    @RequiresPermissions("enterprise:job:remove")
    @Log(title = "企业岗位要求", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrJobService.deleteJmrJobByIds(ids));
    }
}
