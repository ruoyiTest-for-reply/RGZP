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
import com.ruoyi.job.domain.JmrRyPosition;
import com.ruoyi.job.service.IJmrRyPositionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 岗位信息查询Controller
 * 
 * @author liangliang
 * @date 2020-10-02
 */
@Controller
@RequestMapping("/job/positionJob")
public class JmrRyPositionController extends BaseController
{
    private String prefix = "job/positionJob";

    @Autowired
    private IJmrRyPositionService jmrRyPositionService;

    @RequiresPermissions("job:positionJob:view")
    @GetMapping()
    public String positionJob()
    {
        return prefix + "/positionJob";
    }

    /**
     * 查询岗位信息查询列表
     */
    @RequiresPermissions("job:positionJob:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrRyPosition jmrRyPosition)
    {
        startPage();
        List<JmrRyPosition> list = jmrRyPositionService.selectJmrRyPositionList(jmrRyPosition);
        return getDataTable(list);
    }

    /**
     * 导出岗位信息查询列表
     */
    @RequiresPermissions("job:positionJob:export")
    @Log(title = "岗位信息查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JmrRyPosition jmrRyPosition)
    {
        List<JmrRyPosition> list = jmrRyPositionService.selectJmrRyPositionList(jmrRyPosition);
        ExcelUtil<JmrRyPosition> util = new ExcelUtil<JmrRyPosition>(JmrRyPosition.class);
        return util.exportExcel(list, "positionJob");
    }

    /**
     * 新增岗位信息查询
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存岗位信息查询
     */
    @RequiresPermissions("job:positionJob:add")
    @Log(title = "岗位信息查询", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JmrRyPosition jmrRyPosition)
    {
        return toAjax(jmrRyPositionService.insertJmrRyPosition(jmrRyPosition));
    }

    /**
     * 修改岗位信息查询
     */
    @GetMapping("/edit/{pId}")
    public String edit(@PathVariable("pId") Long pId, ModelMap mmap)
    {
        JmrRyPosition jmrRyPosition = jmrRyPositionService.selectJmrRyPositionById(pId);
        mmap.put("jmrRyPosition", jmrRyPosition);
        return prefix + "/edit";
    }

    /**
     * 修改保存岗位信息查询
     */
    @RequiresPermissions("job:positionJob:edit")
    @Log(title = "岗位信息查询", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JmrRyPosition jmrRyPosition)
    {
        return toAjax(jmrRyPositionService.updateJmrRyPosition(jmrRyPosition));
    }

    /**
     * 删除岗位信息查询
     */
    @RequiresPermissions("job:positionJob:remove")
    @Log(title = "岗位信息查询", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrRyPositionService.deleteJmrRyPositionByIds(ids));
    }
}
