package com.ruoyi.job.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.job.mapper.JmrRyStudentMapper;
import com.ruoyi.job.domain.JmrRyStudent;
import com.ruoyi.job.service.IJmrRyStudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生信息查询Service业务层处理
 * 
 * @author liangliang
 * @date 2020-10-02
 */
@Service
public class JmrRyStudentServiceImpl implements IJmrRyStudentService 
{
    @Autowired
    private JmrRyStudentMapper jmrRyStudentMapper;

    /**
     * 查询学生信息查询
     * 
     * @param sId 学生信息查询ID
     * @return 学生信息查询
     */
    @Override
    public JmrRyStudent selectJmrRyStudentById(Long sId)
    {
        return jmrRyStudentMapper.selectJmrRyStudentById(sId);
    }

    /**
     * 查询学生信息查询列表
     * 
     * @param jmrRyStudent 学生信息查询
     * @return 学生信息查询
     */
    @Override
    public List<JmrRyStudent> selectJmrRyStudentList(JmrRyStudent jmrRyStudent)
    {
        return jmrRyStudentMapper.selectJmrRyStudentList(jmrRyStudent);
    }

    /**
     * 新增学生信息查询
     * 
     * @param jmrRyStudent 学生信息查询
     * @return 结果
     */
    @Override
    public int insertJmrRyStudent(JmrRyStudent jmrRyStudent)
    {
        return jmrRyStudentMapper.insertJmrRyStudent(jmrRyStudent);
    }

    /**
     * 修改学生信息查询
     * 
     * @param jmrRyStudent 学生信息查询
     * @return 结果
     */
    @Override
    public int updateJmrRyStudent(JmrRyStudent jmrRyStudent)
    {
        return jmrRyStudentMapper.updateJmrRyStudent(jmrRyStudent);
    }

    /**
     * 删除学生信息查询对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrRyStudentByIds(String ids)
    {
        return jmrRyStudentMapper.deleteJmrRyStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生信息查询信息
     * 
     * @param sId 学生信息查询ID
     * @return 结果
     */
    @Override
    public int deleteJmrRyStudentById(Long sId)
    {
        return jmrRyStudentMapper.deleteJmrRyStudentById(sId);
    }
}
