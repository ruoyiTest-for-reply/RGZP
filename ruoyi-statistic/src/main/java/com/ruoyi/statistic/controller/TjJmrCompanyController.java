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
import com.ruoyi.statistic.domain.TjJmrCompany;
import com.ruoyi.statistic.service.ITjJmrCompanyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 存储企业信息Controller
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
@Controller
@RequestMapping("/statistic/company")
public class TjJmrCompanyController extends BaseController
{
    private String prefix = "statistic/company";

    @Autowired
    private ITjJmrCompanyService tjJmrCompanyService;

    @RequiresPermissions("statistic:company:view")
    @GetMapping()
    public String company()
    {
        return prefix + "/company";
    }

    /**
     * 查询存储企业信息列表
     */
    @RequiresPermissions("statistic:company:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TjJmrCompany tjJmrCompany)
    {
        startPage();
        List<TjJmrCompany> list = tjJmrCompanyService.selectTjJmrCompanyList(tjJmrCompany);
        return getDataTable(list);
    }

    /**
     * 导出存储企业信息列表
     */
    @RequiresPermissions("statistic:company:export")
    @Log(title = "存储企业信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TjJmrCompany tjJmrCompany)
    {
        List<TjJmrCompany> list = tjJmrCompanyService.selectTjJmrCompanyList(tjJmrCompany);
        ExcelUtil<TjJmrCompany> util = new ExcelUtil<TjJmrCompany>(TjJmrCompany.class);
        return util.exportExcel(list, "company");
    }

    /**
     * 新增存储企业信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存存储企业信息
     */
    @RequiresPermissions("statistic:company:add")
    @Log(title = "存储企业信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TjJmrCompany tjJmrCompany)
    {
        return toAjax(tjJmrCompanyService.insertTjJmrCompany(tjJmrCompany));
    }

    /**
     * 修改存储企业信息
     */
    @GetMapping("/edit/{cId}")
    public String edit(@PathVariable("cId") Long cId, ModelMap mmap)
    {
        TjJmrCompany tjJmrCompany = tjJmrCompanyService.selectTjJmrCompanyById(cId);
        mmap.put("tjJmrCompany", tjJmrCompany);
        return prefix + "/edit";
    }

    /**
     * 修改保存存储企业信息
     */
    @RequiresPermissions("statistic:company:edit")
    @Log(title = "存储企业信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TjJmrCompany tjJmrCompany)
    {
        return toAjax(tjJmrCompanyService.updateTjJmrCompany(tjJmrCompany));
    }

    /**
     * 删除存储企业信息
     */
    @RequiresPermissions("statistic:company:remove")
    @Log(title = "存储企业信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tjJmrCompanyService.deleteTjJmrCompanyByIds(ids));
    }
}
