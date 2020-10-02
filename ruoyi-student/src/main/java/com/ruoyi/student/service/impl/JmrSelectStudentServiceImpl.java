package com.ruoyi.student.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.student.mapper.JmrSelectStudentMapper;
import com.ruoyi.student.domain.JmrStudent;
import com.ruoyi.student.service.IJmrStudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生信息管理Service业务层处理
 * 
 * @author wangxh
 * @date 2020-09-27
 */
@Service
public class JmrSelectStudentServiceImpl implements IJmrStudentService
{
    @Autowired
    private JmrSelectStudentMapper jmrSelectStudentMapper;

    /**
     * 查询学生信息管理
     * 
     * @param sId 学生信息管理ID
     * @return 学生信息管理
     */
    @Override
    public JmrStudent selectJmrStudentById(Long sId)
    {
        return jmrSelectStudentMapper.selectJmrStudentById(sId);
    }

    /**
     * 查询学生信息管理列表
     * 
     * @param jmrStudent 学生信息管理
     * @return 学生信息管理
     */
    @Override
    public List<JmrStudent> selectJmrStudentList(JmrStudent jmrStudent)
    {
        return jmrSelectStudentMapper.selectJmrStudentList(jmrStudent);
    }

    /**
     * 新增学生信息管理
     * 
     * @param jmrStudent 学生信息管理
     * @return 结果
     */
    @Override
    public int insertJmrStudent(JmrStudent jmrStudent)
    {
        return jmrSelectStudentMapper.insertJmrStudent(jmrStudent);
    }

    /**
     * 修改学生信息管理
     * 
     * @param jmrStudent 学生信息管理
     * @return 结果
     */
    @Override
    public int updateJmrStudent(JmrStudent jmrStudent)
    {
        return jmrSelectStudentMapper.updateJmrStudent(jmrStudent);
    }

    /**
     * 删除学生信息管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrStudentByIds(String ids)
    {
        return jmrSelectStudentMapper.deleteJmrStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生信息管理信息
     * 
     * @param sId 学生信息管理ID
     * @return 结果
     */
    @Override
    public int deleteJmrStudentById(Long sId)
    {
        return jmrSelectStudentMapper.deleteJmrStudentById(sId);
    }

    @Override
    public List<JmrStudent> selectJmrStudentByUserId(JmrStudent jmrStudent)
    {
        return jmrStudentMapper.selectJmrStudentByUserId(jmrStudent);
    }
}
