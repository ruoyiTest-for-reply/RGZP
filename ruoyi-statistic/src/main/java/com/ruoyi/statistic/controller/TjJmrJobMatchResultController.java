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
import com.ruoyi.statistic.domain.TjJmrJobMatchResult;
import com.ruoyi.statistic.service.ITjJmrJobMatchResultService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生匹配信息统计Controller
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
@Controller
@RequestMapping("/statistic/result")
public class TjJmrJobMatchResultController extends BaseController
{
    private String prefix = "statistic/result";

    @Autowired
    private ITjJmrJobMatchResultService tjJmrJobMatchResultService;

    @RequiresPermissions("statistic:result:view")
    @GetMapping()
    public String result()
    {
        return prefix + "/result";
    }

    /**
     * 查询学生匹配信息统计列表
     */
    @RequiresPermissions("statistic:result:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TjJmrJobMatchResult tjJmrJobMatchResult)
    {
        startPage();
        List<TjJmrJobMatchResult> list = tjJmrJobMatchResultService.selectTjJmrJobMatchResultList(tjJmrJobMatchResult);
        return getDataTable(list);
    }

    /**
     * 导出学生匹配信息统计列表
     */
    @RequiresPermissions("statistic:result:export")
    @Log(title = "学生匹配信息统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TjJmrJobMatchResult tjJmrJobMatchResult)
    {
        List<TjJmrJobMatchResult> list = tjJmrJobMatchResultService.selectTjJmrJobMatchResultList(tjJmrJobMatchResult);
        ExcelUtil<TjJmrJobMatchResult> util = new ExcelUtil<TjJmrJobMatchResult>(TjJmrJobMatchResult.class);
        return util.exportExcel(list, "result");
    }

    /**
     * 新增学生匹配信息统计
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生匹配信息统计
     */
    @RequiresPermissions("statistic:result:add")
    @Log(title = "学生匹配信息统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TjJmrJobMatchResult tjJmrJobMatchResult)
    {
        return toAjax(tjJmrJobMatchResultService.insertTjJmrJobMatchResult(tjJmrJobMatchResult));
    }

    /**
     * 修改学生匹配信息统计
     */
    @GetMapping("/edit/{jmrId}")
    public String edit(@PathVariable("jmrId") Long jmrId, ModelMap mmap)
    {
        TjJmrJobMatchResult tjJmrJobMatchResult = tjJmrJobMatchResultService.selectTjJmrJobMatchResultById(jmrId);
        mmap.put("tjJmrJobMatchResult", tjJmrJobMatchResult);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生匹配信息统计
     */
    @RequiresPermissions("statistic:result:edit")
    @Log(title = "学生匹配信息统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TjJmrJobMatchResult tjJmrJobMatchResult)
    {
        return toAjax(tjJmrJobMatchResultService.updateTjJmrJobMatchResult(tjJmrJobMatchResult));
    }

    /**
     * 删除学生匹配信息统计
     */
    @RequiresPermissions("statistic:result:remove")
    @Log(title = "学生匹配信息统计", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tjJmrJobMatchResultService.deleteTjJmrJobMatchResultByIds(ids));
    }
}
