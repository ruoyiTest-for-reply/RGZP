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
import com.ruoyi.enterprise.domain.JmrCompany;
import com.ruoyi.enterprise.service.IJmrCompanyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 企业列表Controller
 * 
 * @author liangliang
 * @date 2020-09-27
 */
@Controller
@RequestMapping("/enterprise/company")
public class JmrCompanyController extends BaseController
{
    private String prefix = "enterprise/company";

    @Autowired
    private IJmrCompanyService jmrCompanyService;

    @RequiresPermissions("enterprise:company:view")
    @GetMapping()
    public String company()
    {
        return prefix + "/company";
    }

    /**
     * 查询企业列表列表
     */
    @RequiresPermissions("enterprise:company:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrCompany jmrCompany)
    {
        startPage();
        List<JmrCompany> list = jmrCompanyService.selectJmrCompanyList(jmrCompany);
        return getDataTable(list);
    }

    /**
     * 导出企业列表列表
     */
    @RequiresPermissions("enterprise:company:export")
    @Log(title = "企业列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JmrCompany jmrCompany)
    {
        List<JmrCompany> list = jmrCompanyService.selectJmrCompanyList(jmrCompany);
        ExcelUtil<JmrCompany> util = new ExcelUtil<JmrCompany>(JmrCompany.class);
        return util.exportExcel(list, "company");
    }

    /**
     * 新增企业列表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存企业列表
     */
    @RequiresPermissions("enterprise:company:add")
    @Log(title = "企业列表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JmrCompany jmrCompany)
    {
        return toAjax(jmrCompanyService.insertJmrCompany(jmrCompany));
    }

    /**
     * 修改企业列表
     */
    @GetMapping("/edit/{cId}")
    public String edit(@PathVariable("cId") Long cId, ModelMap mmap)
    {
        JmrCompany jmrCompany = jmrCompanyService.selectJmrCompanyById(cId);
        mmap.put("jmrCompany", jmrCompany);
        return prefix + "/edit";
    }

    /**
     * 修改保存企业列表
     */
    @RequiresPermissions("enterprise:company:edit")
    @Log(title = "企业列表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JmrCompany jmrCompany)
    {
        return toAjax(jmrCompanyService.updateJmrCompany(jmrCompany));
    }

    /**
     * 删除企业列表
     */
    @RequiresPermissions("enterprise:company:remove")
    @Log(title = "企业列表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrCompanyService.deleteJmrCompanyByIds(ids));
    }
}
