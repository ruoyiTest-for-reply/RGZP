package com.ruoyi.student.controller;

import java.util.List;

import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysUser;
import org.apache.shiro.authz.annotation.Logical;
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
import com.ruoyi.student.domain.JmrStudent;
import com.ruoyi.student.service.IJmrStudentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生信息管理Controller
 * 
 * @author liangliang
 * @date 2020-09-27
 */
@Controller
@RequestMapping("/student/student")
public class JmrStudentController extends BaseController
{
    private String prefix = "student/student";
/*
* 新建 路径     将原来的学生新建学生信息 更改为发布简历
* */
    private String prefix1 = "student/resume";

    @Autowired
    private IJmrStudentService jmrStudentService;

    @RequiresPermissions("student:student:view")
    @GetMapping()
    /*
    * 最终version：
    * 才看到 这里的prefix + /student 即     /student/student/student
    *
    * 那么我在这里选择了新建一个相同的页面  并在原来的基础上进行修改
    *
    * 可以在这里进行判断 是admin 和 student 来选择跳转到不同的页面
    *
    * 总结：
    * 初识 ruoyi 对框架的配置等不熟悉。开始下一功能的实现
    * */
    public String student()
    {
        SysUser user = ShiroUtils.getSysUser();
        String loginName = user.getLoginName();
        if(loginName.equals("admin")){
            return prefix + "/admin";
        }else{
            return prefix + "/student";
        }
    }


    /**
     * 查询学生信息管理列表
     */
    @RequiresPermissions("student:student:list")
//    @RequiresRoles(value={"student", "admin"}, logical= Logical.OR)
    @RequiresRoles("admin")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JmrStudent jmrStudent)
    {
        startPage();
        /*
        * version2: 直接在同一handle中判断是不是 管理员 来执行 不同的方法
        *
        * 此方法会导致在修改学生显示界面的时候 同时将admin 的界面修改掉
        *
        * 然而 在最初设计的时候 不希望 admin 和 student 的显示界面相同
        *
        * 继续思考！！
        * */
//        SysUser user = ShiroUtils.getSysUser();
//        String loginName = user.getLoginName();
//        if(loginName.equals("admin")){
            List<JmrStudent> list = jmrStudentService.selectJmrStudentList(jmrStudent);
            return getDataTable(list);
//        }else{
//            List<JmrStudent> list = jmrStudentService.selectJmrStudentByUserId(jmrStudent);
//            return getDataTable(list);
//        }
    }

    /*
    * version1:admin 和 student 不同界面
    * 但 在寻找url时出现了瓶颈 找不到对应url 需再了解
    * */
    @RequiresRoles("student")
    @PostMapping("/student")
    @ResponseBody
    public TableDataInfo selectJmrStudentByUserId(JmrStudent jmrStudent)
    {
        startPage();
        List<JmrStudent> list = jmrStudentService.selectJmrStudentByUserId(jmrStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生信息管理列表
     */
    @RequiresPermissions("student:student:export")
    @Log(title = "学生信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JmrStudent jmrStudent)
    {
        List<JmrStudent> list = jmrStudentService.selectJmrStudentList(jmrStudent);
        ExcelUtil<JmrStudent> util = new ExcelUtil<JmrStudent>(JmrStudent.class);
        return util.exportExcel(list, "student");
    }

    /**
     * 新增学生信息管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生信息管理
     *
     * 需要将这里的功能更换为    学生发布简历
     */
    @RequiresPermissions("student:student:add")
    @Log(title = "学生信息管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JmrStudent jmrStudent)
    {
        return toAjax(jmrStudentService.insertJmrStudent(jmrStudent));
    }

    /**
     * 修改学生信息管理
     */
    @GetMapping("/edit/{sId}")
    public String edit(@PathVariable("sId") Long sId, ModelMap mmap)
    {
        JmrStudent jmrStudent = jmrStudentService.selectJmrStudentById(sId);
        mmap.put("jmrStudent", jmrStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生信息管理
     */
    @RequiresPermissions("student:student:edit")
    @Log(title = "学生信息管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JmrStudent jmrStudent)
    {
        return toAjax(jmrStudentService.updateJmrStudent(jmrStudent));
    }

    /**
     * 删除学生信息管理
     */
    @RequiresPermissions("student:student:remove")
    @Log(title = "学生信息管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jmrStudentService.deleteJmrStudentByIds(ids));
    }

    /*
    * 学生用户查询个人信息
    * */
//    @RequiresPermissions("student:student:student")
//    只有管理员可以查看 所有的学生信息列表，学生用户只能查看、修改自己的信息
    /*@RequiresRoles("student")
    @PostMapping("/student")
    @ResponseBody
    public JmrStudent selectJmrStudentByUserId(){
//        System.out.println();
        startPage();
        JmrStudent jmrStudent = jmrStudentService.selectJmrStudentByUserId();
        return jmrStudent;
    }*/


    //test for connection sys_user and jmr_student

}
