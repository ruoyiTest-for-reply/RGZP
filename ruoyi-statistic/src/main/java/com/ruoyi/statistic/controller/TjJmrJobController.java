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
import com.ruoyi.statistic.domain.TjJmrJob;
import com.ruoyi.statistic.service.ITjJmrJobService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 存储企业保存的岗位信息Controller
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
@Controller
@RequestMapping("/statistic/job")
public class TjJmrJobController extends BaseController
{
    private String prefix = "statistic/job";

    @Autowired
    private ITjJmrJobService tjJmrJobService;

    @RequiresPermissions("statistic:job:view")
    @GetMapping()
    public String job()
    {
        return prefix + "/job";
    }

    /**
     * 查询存储企业保存的岗位信息列表
     */
    @RequiresPermissions("statistic:job:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TjJmrJob tjJmrJob)
    {
        startPage();
        List<TjJmrJob> list = tjJmrJobService.selectTjJmrJobList(tjJmrJob);
        return getDataTable(list);
    }

    /**
     * 导出存储企业保存的岗位信息列表
     */
    @RequiresPermissions("statistic:job:export")
    @Log(title = "存储企业保存的岗位信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TjJmrJob tjJmrJob)
    {
        List<TjJmrJob> list = tjJmrJobService.selectTjJmrJobList(tjJmrJob);
        ExcelUtil<TjJmrJob> util = new ExcelUtil<TjJmrJob>(TjJmrJob.class);
        return util.exportExcel(list, "job");
    }

    /**
     * 新增存储企业保存的岗位信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存存储企业保存的岗位信息
     */
    @RequiresPermissions("statistic:job:add")
    @Log(title = "存储企业保存的岗位信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TjJmrJob tjJmrJob)
    {
        return toAjax(tjJmrJobService.insertTjJmrJob(tjJmrJob));
    }

    /**
     * 修改存储企业保存的岗位信息
     */
    @GetMapping("/edit/{jId}")
    public String edit(@PathVariable("jId") Integer jId, ModelMap mmap)
    {
        TjJmrJob tjJmrJob = tjJmrJobService.selectTjJmrJobById(jId);
        mmap.put("tjJmrJob", tjJmrJob);
        return prefix + "/edit";
    }

    /**
     * 修改保存存储企业保存的岗位信息
     */
    @RequiresPermissions("statistic:job:edit")
    @Log(title = "存储企业保存的岗位信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TjJmrJob tjJmrJob)
    {
        return toAjax(tjJmrJobService.updateTjJmrJob(tjJmrJob));
    }

    /**
     * 删除存储企业保存的岗位信息
     */
    @RequiresPermissions("statistic:job:remove")
    @Log(title = "存储企业保存的岗位信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tjJmrJobService.deleteTjJmrJobByIds(ids));
    }
}
