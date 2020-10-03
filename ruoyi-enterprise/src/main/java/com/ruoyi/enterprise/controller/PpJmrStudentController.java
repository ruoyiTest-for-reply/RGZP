package com.ruoyi.enterprise.controller;

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
import com.ruoyi.enterprise.domain.PpJmrStudent;
import com.ruoyi.enterprise.service.IPpJmrStudentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 手动匹配Controller
 * 
 * @author liangliang
 * @date 2020-10-03
 */
@Controller
@RequestMapping("/enterprise/estudent")
public class PpJmrStudentController extends BaseController
{
    private String prefix = "enterprise/estudent";

    @Autowired
    private IPpJmrStudentService ppJmrStudentService;

    @RequiresPermissions("enterprise:estudent:view")
    @GetMapping()
    public String estudent()
    {
        return prefix + "/estudent";
    }

    /**
     * 查询手动匹配列表
     */
    @RequiresPermissions("enterprise:estudent:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PpJmrStudent ppJmrStudent)
    {
        startPage();
        List<PpJmrStudent> list = ppJmrStudentService.selectPpJmrStudentList(ppJmrStudent);
        return getDataTable(list);
    }

    /**
     * 导出手动匹配列表
     */
    @RequiresPermissions("enterprise:estudent:export")
    @Log(title = "手动匹配", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PpJmrStudent ppJmrStudent)
    {
        List<PpJmrStudent> list = ppJmrStudentService.selectPpJmrStudentList(ppJmrStudent);
        ExcelUtil<PpJmrStudent> util = new ExcelUtil<PpJmrStudent>(PpJmrStudent.class);
        return util.exportExcel(list, "estudent");
    }

    /**
     * 新增手动匹配
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存手动匹配
     */
    @RequiresPermissions("enterprise:estudent:add")
    @Log(title = "手动匹配", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PpJmrStudent ppJmrStudent)
    {
        return toAjax(ppJmrStudentService.insertPpJmrStudent(ppJmrStudent));
    }

    /**
     * 修改手动匹配
     */
    @GetMapping("/edit/{sId}")
    public String edit(@PathVariable("sId") Long sId, ModelMap mmap)
    {
        PpJmrStudent ppJmrStudent = ppJmrStudentService.selectPpJmrStudentById(sId);
        mmap.put("ppJmrStudent", ppJmrStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存手动匹配
     */
    @RequiresPermissions("enterprise:estudent:edit")
    @Log(title = "手动匹配", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PpJmrStudent ppJmrStudent)
    {
        return toAjax(ppJmrStudentService.updatePpJmrStudent(ppJmrStudent));
    }

    /**
     * 删除手动匹配
     */
    @RequiresPermissions("enterprise:estudent:remove")
    @Log(title = "手动匹配", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ppJmrStudentService.deletePpJmrStudentByIds(ids));
    }
}
