package com.ruoyi.student.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.student.mapper.JmrResumeMapper;
import com.ruoyi.student.domain.JmrResume;
import com.ruoyi.student.service.IJmrResumeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生简历Service业务层处理
 * 
 * @author liangliang
 * @date 2020-09-28
 */
@Service
public class JmrResumeServiceImpl implements IJmrResumeService 
{
    @Autowired
    private JmrResumeMapper jmrResumeMapper;

    /**
     * 查询学生简历
     * 
     * @param rId 学生简历ID
     * @return 学生简历
     */
    @Override
    public JmrResume selectJmrResumeById(Long rId)
    {
        return jmrResumeMapper.selectJmrResumeById(rId);
    }

    /**
     * 查询学生简历列表
     * 
     * @param jmrResume 学生简历
     * @return 学生简历
     */
    @Override
    public List<JmrResume> selectJmrResumeList(JmrResume jmrResume)
    {
        return jmrResumeMapper.selectJmrResumeList(jmrResume);
    }

    @Override
    public List<JmrResume> selectJmrResumeByUserId(JmrResume jmrResume)
    {
        return jmrResumeMapper.selectJmrResumeByUserId(jmrResume);
    }

    /**
     * 新增学生简历
     * 
     * @param jmrResume 学生简历
     * @return 结果
     */
    @Override
    public int insertJmrResume(JmrResume jmrResume)
    {
        return jmrResumeMapper.insertJmrResume(jmrResume);
    }

    /**
     * 修改学生简历
     * 
     * @param jmrResume 学生简历
     * @return 结果
     */
    @Override
    public int updateJmrResume(JmrResume jmrResume)
    {
        return jmrResumeMapper.updateJmrResume(jmrResume);
    }

    /**
     * 删除学生简历对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrResumeByIds(String ids)
    {
        return jmrResumeMapper.deleteJmrResumeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生简历信息
     * 
     * @param rId 学生简历ID
     * @return 结果
     */
    @Override
    public int deleteJmrResumeById(Long rId)
    {
        return jmrResumeMapper.deleteJmrResumeById(rId);
    }
}
