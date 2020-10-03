package com.ruoyi.student.controller;

import java.util.List;

import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysUser;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
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
import com.ruoyi.student.domain.JmrResume;
import com.ruoyi.student.service.IJmrResumeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生简历Controller
 * 
 * @author liangliang
 * @date 2020-09-28
 */
@Controller
@RequestMapping("/student/resume")
public class JmrResumeController extends BaseController
{
    private String prefix = "student/resume";

    @Autowired
    private IJmrResumeService jmrResumeService;

    @RequiresPermissions("student:resume:view")
    @GetMapping()
    public String resume()
    {
        SysUser user = ShiroUtils.getSysUser();
        String loginName = user.getLoginName();
        if(loginName.equals("admin")){
            return prefix + "/admin";
        }else{
            return prefix + "/resume";
        }
    }

    /**
     * admin查询学生简历列表
     */
    @RequiresPermissions("student:resume:list")
    @PostMapping("/list")
    @RequiresRoles("admin")
    @ResponseBody
    public TableDataInfo list(JmrResume jmrResume)
    {
        startPage();
        List<JmrResume> list = jmrResumeService.selectJmrResumeList(jmrResume);
        return getDataTable(list);
    }
/*
* 和学生信息同理 学生查询个人简历
* */
    @PostMapping("/resume")
    @RequiresRoles("student")
    @ResponseBody
    public TableDataInfo selectJmrResumeByUserId(JmrResume jmrResume)
    {
        startPage();
        List<JmrResume> list = jmrResumeService.selectJmrResumeByUserId(jmrResume);
        return getDataTable(list);
    }

    /**
     * 导出学生简历列表
     */
    @RequiresPermissions("student:resume:export")
    @Log(title = "学生简历", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JmrResume jmrResume)
    {
        List<JmrResume> list = jmrResumeService.selectJmrResumeList(jmrResume);
        ExcelUtil<JmrResume> util = new ExcelUtil<JmrResume>(JmrResume.class);
        return util.exportExcel(list, "resume");
    }

    /**
     * 新增学生简历
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生简历
     */
    @RequiresPermissions("student:resume:add")
    @Log(title = "学生简历", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JmrResume jmrResume)
    {
        return toAjax(jmrResumeService.insertJmrResume(jmrResume));
    }

    /**
     * 修改学生简历
     */
    @GetMapping("/edit/{rId}")
    public String edit(@PathVariable("rId") Long rId, ModelMap mmap)
    {
        JmrResume jmrResume = jmrResumeService.selectJmrResumeById(rId);
        mmap.put("jmrResume", jmrResume);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生简历
     */
    @RequiresPermissions("student:resume:edit")
    @Log(title = "学生简历", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JmrResume jmrResume)
    {
        return toAjax(jmrResumeService.updateJmrResume(jmrResume));
    }

    /**
     * 删除学生简历
     */
    @RequiresPermissions("student:resume:remove")
    @Log(title = "学生简历", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrResumeService.deleteJmrResumeByIds(ids));
    }
}
