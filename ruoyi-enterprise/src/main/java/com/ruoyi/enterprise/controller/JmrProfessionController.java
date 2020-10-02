package com.ruoyi.enterprise.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.enterprise.domain.JmrProfession;
import com.ruoyi.enterprise.service.IJmrProfessionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 专业信息Controller
 * 
 * @author liangliang
 * @date 2020-09-29
 */
@Controller
@RequestMapping("/enterprise/profession")
public class JmrProfessionController extends BaseController
{
    private String prefix = "enterprise/profession";

    @Autowired
    private IJmrProfessionService jmrProfessionService;

    @RequiresPermissions("enterprise:profession:view")
    @GetMapping()
    public String profession()
    {
        return prefix + "/profession";
    }

    /**
     * 查询专业信息列表
     */
    @RequiresPermissions("enterprise:profession:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrProfession jmrProfession)
    {
        startPage();
        List<JmrProfession> list = jmrProfessionService.selectJmrProfessionList(jmrProfession);
        return getDataTable(list);
    }

    /**
     * 导出专业信息列表
     */
    @RequiresPermissions("enterprise:profession:export")
    @Log(title = "专业信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JmrProfession jmrProfession)
    {
        List<JmrProfession> list = jmrProfessionService.selectJmrProfessionList(jmrProfession);
        ExcelUtil<JmrProfession> util = new ExcelUtil<JmrProfession>(JmrProfession.class);
        return util.exportExcel(list, "profession");
    }

    /**
     * 新增专业信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存专业信息
     */
    @RequiresPermissions("enterprise:profession:add")
    @Log(title = "专业信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JmrProfession jmrProfession)
    {
        return toAjax(jmrProfessionService.insertJmrProfession(jmrProfession));
    }

    /**
     * 修改专业信息
     */
    @GetMapping("/edit/{pId}")
    public String edit(@PathVariable("pId") Long pId, ModelMap mmap)
    {
        JmrProfession jmrProfession = jmrProfessionService.selectJmrProfessionById(pId);
        mmap.put("jmrProfession", jmrProfession);
        return prefix + "/edit";
    }

    /**
     * 修改保存专业信息
     */
    @RequiresPermissions("enterprise:profession:edit")
    @Log(title = "专业信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JmrProfession jmrProfession)
    {
        return toAjax(jmrProfessionService.updateJmrProfession(jmrProfession));
    }

    /**
     * 删除专业信息
     */
    @RequiresPermissions("enterprise:profession:remove")
    @Log(title = "专业信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrProfessionService.deleteJmrProfessionByIds(ids));
    }
}
