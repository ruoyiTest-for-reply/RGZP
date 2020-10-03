package com.ruoyi.student.service;

import java.util.List;
import com.ruoyi.student.domain.JmrResume;

/**
 * 学生简历Service接口
 * 
 * @author liangliang
 * @date 2020-09-28
 */
public interface IJmrResumeService 
{
    /**
     * 查询学生简历
     * 
     * @param rId 学生简历ID
     * @return 学生简历
     */
    public JmrResume selectJmrResumeById(Long rId);

    /**
     * 查询学生简历列表
     * 
     * @param jmrResume 学生简历
     * @return 学生简历集合
     */
    public List<JmrResume> selectJmrResumeList(JmrResume jmrResume);

    public List<JmrResume> selectJmrResumeByUserId(JmrResume jmrResume);

    /**
     * 新增学生简历
     * 
     * @param jmrResume 学生简历
     * @return 结果
     */
    public int insertJmrResume(JmrResume jmrResume);

    /**
     * 修改学生简历
     * 
     * @param jmrResume 学生简历
     * @return 结果
     */
    public int updateJmrResume(JmrResume jmrResume);

    /**
     * 批量删除学生简历
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrResumeByIds(String ids);

    /**
     * 删除学生简历信息
     * 
     * @param rId 学生简历ID
     * @return 结果
     */
    public int deleteJmrResumeById(Long rId);
}
