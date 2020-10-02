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
import com.ruoyi.job.domain.JmrRyCompany;
import com.ruoyi.job.service.IJmrRyCompanyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 企业信息查询Controller
 * 
 * @author liangliang
 * @date 2020-10-02
 */
@Controller
@RequestMapping("/job/companyJob")
public class JmrRyCompanyController extends BaseController
{
    private String prefix = "job/companyJob";

    @Autowired
    private IJmrRyCompanyService jmrRyCompanyService;

    @RequiresPermissions("job:companyJob:view")
    @GetMapping()
    public String companyJob()
    {
        return prefix + "/companyJob";
    }

    /**
     * 查询企业信息查询列表
     */
    @RequiresPermissions("job:companyJob:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrRyCompany jmrRyCompany)
    {
        startPage();
        List<JmrRyCompany> list = jmrRyCompanyService.selectJmrRyCompanyList(jmrRyCompany);
        return getDataTable(list);
    }

    /**
     * 导出企业信息查询列表
     */
    @RequiresPermissions("job:companyJob:export")
    @Log(title = "企业信息查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JmrRyCompany jmrRyCompany)
    {
        List<JmrRyCompany> list = jmrRyCompanyService.selectJmrRyCompanyList(jmrRyCompany);
        ExcelUtil<JmrRyCompany> util = new ExcelUtil<JmrRyCompany>(JmrRyCompany.class);
        return util.exportExcel(list, "companyJob");
    }

    /**
     * 新增企业信息查询
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存企业信息查询
     */
    @RequiresPermissions("job:companyJob:add")
    @Log(title = "企业信息查询", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JmrRyCompany jmrRyCompany)
    {
        return toAjax(jmrRyCompanyService.insertJmrRyCompany(jmrRyCompany));
    }

    /**
     * 修改企业信息查询
     */
    @GetMapping("/edit/{cId}")
    public String edit(@PathVariable("cId") Long cId, ModelMap mmap)
    {
        JmrRyCompany jmrRyCompany = jmrRyCompanyService.selectJmrRyCompanyById(cId);
        mmap.put("jmrRyCompany", jmrRyCompany);
        return prefix + "/edit";
    }

    /**
     * 修改保存企业信息查询
     */
    @RequiresPermissions("job:companyJob:edit")
    @Log(title = "企业信息查询", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JmrRyCompany jmrRyCompany)
    {
        return toAjax(jmrRyCompanyService.updateJmrRyCompany(jmrRyCompany));
    }

    /**
     * 删除企业信息查询
     */
    @RequiresPermissions("job:companyJob:remove")
    @Log(title = "企业信息查询", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrRyCompanyService.deleteJmrRyCompanyByIds(ids));
    }
}
