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
import com.ruoyi.job.domain.JmrRyStudentMatchResult;
import com.ruoyi.job.service.IJmrRyStudentMatchResultService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 匹配信息查询Controller
 * 
 * @author liangliang
 * @date 2020-10-02
 */
@Controller
@RequestMapping("/job/resultJob")
public class JmrRyStudentMatchResultController extends BaseController
{
    private String prefix = "job/resultJob";

    @Autowired
    private IJmrRyStudentMatchResultService jmrRyStudentMatchResultService;

    @RequiresPermissions("job:resultJob:view")
    @GetMapping()
    public String resultJob()
    {
        return prefix + "/resultJob";
    }

    /**
     * 查询匹配信息查询列表
     */
    @RequiresPermissions("job:resultJob:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrRyStudentMatchResult jmrRyStudentMatchResult)
    {
        startPage();
        List<JmrRyStudentMatchResult> list = jmrRyStudentMatchResultService.selectJmrRyStudentMatchResultList(jmrRyStudentMatchResult);
        return getDataTable(list);
    }

    /**
     * 导出匹配信息查询列表
     */
    @RequiresPermissions("job:resultJob:export")
    @Log(title = "匹配信息查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JmrRyStudentMatchResult jmrRyStudentMatchResult)
    {
        List<JmrRyStudentMatchResult> list = jmrRyStudentMatchResultService.selectJmrRyStudentMatchResultList(jmrRyStudentMatchResult);
        ExcelUtil<JmrRyStudentMatchResult> util = new ExcelUtil<JmrRyStudentMatchResult>(JmrRyStudentMatchResult.class);
        return util.exportExcel(list, "resultJob");
    }

    /**
     * 新增匹配信息查询
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存匹配信息查询
     */
    @RequiresPermissions("job:resultJob:add")
    @Log(title = "匹配信息查询", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JmrRyStudentMatchResult jmrRyStudentMatchResult)
    {
        return toAjax(jmrRyStudentMatchResultService.insertJmrRyStudentMatchResult(jmrRyStudentMatchResult));
    }

    /**
     * 修改匹配信息查询
     */
    @GetMapping("/edit/{smrId}")
    public String edit(@PathVariable("smrId") Long smrId, ModelMap mmap)
    {
        JmrRyStudentMatchResult jmrRyStudentMatchResult = jmrRyStudentMatchResultService.selectJmrRyStudentMatchResultById(smrId);
        mmap.put("jmrRyStudentMatchResult", jmrRyStudentMatchResult);
        return prefix + "/edit";
    }

    /**
     * 修改保存匹配信息查询
     */
    @RequiresPermissions("job:resultJob:edit")
    @Log(title = "匹配信息查询", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JmrRyStudentMatchResult jmrRyStudentMatchResult)
    {
        return toAjax(jmrRyStudentMatchResultService.updateJmrRyStudentMatchResult(jmrRyStudentMatchResult));
    }

    /**
     * 删除匹配信息查询
     */
    @RequiresPermissions("job:resultJob:remove")
    @Log(title = "匹配信息查询", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrRyStudentMatchResultService.deleteJmrRyStudentMatchResultByIds(ids));
    }
}
