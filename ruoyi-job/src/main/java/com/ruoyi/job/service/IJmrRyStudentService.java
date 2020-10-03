package com.ruoyi.job.service;

import java.util.List;
import com.ruoyi.job.domain.JmrRyStudent;

/**
 * 学生信息查询Service接口
 * 
 * @author liangliang
 * @date 2020-10-02
 */
public interface IJmrRyStudentService 
{
    /**
     * 查询学生信息查询
     * 
     * @param sId 学生信息查询ID
     * @return 学生信息查询
     */
    public JmrRyStudent selectJmrRyStudentById(Long sId);

    /**
     * 查询学生信息查询列表
     * 
     * @param jmrRyStudent 学生信息查询
     * @return 学生信息查询集合
     */
    public List<JmrRyStudent> selectJmrRyStudentList(JmrRyStudent jmrRyStudent);

    /**
     * 新增学生信息查询
     * 
     * @param jmrRyStudent 学生信息查询
     * @return 结果
     */
    public int insertJmrRyStudent(JmrRyStudent jmrRyStudent);

    /**
     * 修改学生信息查询
     * 
     * @param jmrRyStudent 学生信息查询
     * @return 结果
     */
    public int updateJmrRyStudent(JmrRyStudent jmrRyStudent);

    /**
     * 批量删除学生信息查询
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrRyStudentByIds(String ids);

    /**
     * 删除学生信息查询信息
     * 
     * @param sId 学生信息查询ID
     * @return 结果
     */
    public int deleteJmrRyStudentById(Long sId);
}
