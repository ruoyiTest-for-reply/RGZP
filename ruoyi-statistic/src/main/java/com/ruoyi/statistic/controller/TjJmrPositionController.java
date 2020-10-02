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
import com.ruoyi.statistic.domain.TjJmrPosition;
import com.ruoyi.statistic.service.ITjJmrPositionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 岗位信息Controller
 * 
 * @author liangliang
 * @date 2020-10-02
 */
@Controller
@RequestMapping("/statistic/position")
public class TjJmrPositionController extends BaseController
{
    private String prefix = "statistic/position";

    @Autowired
    private ITjJmrPositionService tjJmrPositionService;

    @RequiresPermissions("statistic:position:view")
    @GetMapping()
    public String position()
    {
        return prefix + "/position";
    }

    /**
     * 查询岗位信息列表
     */
    @RequiresPermissions("statistic:position:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TjJmrPosition tjJmrPosition)
    {
        startPage();
        List<TjJmrPosition> list = tjJmrPositionService.selectTjJmrPositionList(tjJmrPosition);
        return getDataTable(list);
    }

    /**
     * 导出岗位信息列表
     */
    @RequiresPermissions("statistic:position:export")
    @Log(title = "岗位信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TjJmrPosition tjJmrPosition)
    {
        List<TjJmrPosition> list = tjJmrPositionService.selectTjJmrPositionList(tjJmrPosition);
        ExcelUtil<TjJmrPosition> util = new ExcelUtil<TjJmrPosition>(TjJmrPosition.class);
        return util.exportExcel(list, "position");
    }

    /**
     * 新增岗位信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存岗位信息
     */
    @RequiresPermissions("statistic:position:add")
    @Log(title = "岗位信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TjJmrPosition tjJmrPosition)
    {
        return toAjax(tjJmrPositionService.insertTjJmrPosition(tjJmrPosition));
    }

    /**
     * 修改岗位信息
     */
    @GetMapping("/edit/{pId}")
    public String edit(@PathVariable("pId") Long pId, ModelMap mmap)
    {
        TjJmrPosition tjJmrPosition = tjJmrPositionService.selectTjJmrPositionById(pId);
        mmap.put("tjJmrPosition", tjJmrPosition);
        return prefix + "/edit";
    }

    /**
     * 修改保存岗位信息
     */
    @RequiresPermissions("statistic:position:edit")
    @Log(title = "岗位信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TjJmrPosition tjJmrPosition)
    {
        return toAjax(tjJmrPositionService.updateTjJmrPosition(tjJmrPosition));
    }

    /**
     * 删除岗位信息
     */
    @RequiresPermissions("statistic:position:remove")
    @Log(title = "岗位信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tjJmrPositionService.deleteTjJmrPositionByIds(ids));
    }
}
