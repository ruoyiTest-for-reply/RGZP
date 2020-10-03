package com.ruoyi.student.service;

import java.util.List;
import com.ruoyi.student.domain.JmrStudent;
import org.springframework.stereotype.Service;

/**
 * 学生信息管理Service接口
 * 
 * @author liangliang
 * @date 2020-09-27
 */

@Service("studentService")
public interface IJmrStudentService 
{
    /**
     * 查询学生信息管理
     * 
     * @param sId 学生信息管理ID
     * @return 学生信息管理
     */
    public JmrStudent selectJmrStudentById(Long sId);

    /**
     * 查询学生信息管理列表
     * 
     * @param jmrStudent 学生信息管理
     * @return 学生信息管理集合
     */
    public List<JmrStudent> selectJmrStudentList(JmrStudent jmrStudent);

    /**
     * 新增学生信息管理
     * 
     * @param jmrStudent 学生信息管理
     * @return 结果
     */
    public int insertJmrStudent(JmrStudent jmrStudent);

    /**
     * 修改学生信息管理
     * 
     * @param jmrStudent 学生信息管理
     * @return 结果
     */
    public int updateJmrStudent(JmrStudent jmrStudent);

    /**
     * 批量删除学生信息管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrStudentByIds(String ids);

    /**
     * 删除学生信息管理信息
     * 
     * @param sId 学生信息管理ID
     * @return 结果
     */
    public int deleteJmrStudentById(Long sId);

    public List<JmrStudent> selectJmrStudentByUserId(JmrStudent jmrStudent);
}
