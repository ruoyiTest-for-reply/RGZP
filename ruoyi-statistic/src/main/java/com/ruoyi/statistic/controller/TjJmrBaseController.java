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
import com.ruoyi.statistic.domain.TjJmrBase;
import com.ruoyi.statistic.service.ITjJmrBaseService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 存储匹配好的岗位信息（面向学生端）的依赖数据Controller
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
@Controller
@RequestMapping("/statistic/base")
public class TjJmrBaseController extends BaseController
{
    private String prefix = "statistic/base";

    @Autowired
    private ITjJmrBaseService tjJmrBaseService;

    @RequiresPermissions("statistic:base:view")
    @GetMapping()
    public String base()
    {
        return prefix + "/base";
    }

    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据列表
     */
    @RequiresPermissions("statistic:base:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TjJmrBase tjJmrBase)
    {
        startPage();
        List<TjJmrBase> list = tjJmrBaseService.selectTjJmrBaseList(tjJmrBase);
        return getDataTable(list);
    }

    /**
     * 导出存储匹配好的岗位信息（面向学生端）的依赖数据列表
     */
    @RequiresPermissions("statistic:base:export")
    @Log(title = "存储匹配好的岗位信息（面向学生端）的依赖数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TjJmrBase tjJmrBase)
    {
        List<TjJmrBase> list = tjJmrBaseService.selectTjJmrBaseList(tjJmrBase);
        ExcelUtil<TjJmrBase> util = new ExcelUtil<TjJmrBase>(TjJmrBase.class);
        return util.exportExcel(list, "base");
    }

    /**
     * 新增存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    @RequiresPermissions("statistic:base:add")
    @Log(title = "存储匹配好的岗位信息（面向学生端）的依赖数据", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TjJmrBase tjJmrBase)
    {
        return toAjax(tjJmrBaseService.insertTjJmrBase(tjJmrBase));
    }

    /**
     * 修改存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    @GetMapping("/edit/{jmrBId}")
    public String edit(@PathVariable("jmrBId") Integer jmrBId, ModelMap mmap)
    {
        TjJmrBase tjJmrBase = tjJmrBaseService.selectTjJmrBaseById(jmrBId);
        mmap.put("tjJmrBase", tjJmrBase);
        return prefix + "/edit";
    }

    /**
     * 修改保存存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    @RequiresPermissions("statistic:base:edit")
    @Log(title = "存储匹配好的岗位信息（面向学生端）的依赖数据", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TjJmrBase tjJmrBase)
    {
        return toAjax(tjJmrBaseService.updateTjJmrBase(tjJmrBase));
    }

    /**
     * 删除存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    @RequiresPermissions("statistic:base:remove")
    @Log(title = "存储匹配好的岗位信息（面向学生端）的依赖数据", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tjJmrBaseService.deleteTjJmrBaseByIds(ids));
    }
}
