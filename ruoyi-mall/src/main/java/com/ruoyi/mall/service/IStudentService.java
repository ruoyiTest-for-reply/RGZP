package com.ruoyi.mall.service;

import com.ruoyi.mall.domain.Student;

import java.util.List;

/**
 * 学生列表Service接口
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
public interface IStudentService 
{
    /**
     * 查询学生列表
     * 
     * @param id 学生列表ID
     * @return 学生列表
     */
    public Student selectStudentById(Long id);

    /**
     * 查询学生列表列表
     * 
     * @param student 学生列表
     * @return 学生列表集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增学生列表
     * 
     * @param student 学生列表
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 修改学生列表
     * 
     * @param student 学生列表
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 批量删除学生列表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudentByIds(String ids);

    /**
     * 删除学生列表信息
     * 
     * @param id 学生列表ID
     * @return 结果
     */
    public int deleteStudentById(Long id);
}
