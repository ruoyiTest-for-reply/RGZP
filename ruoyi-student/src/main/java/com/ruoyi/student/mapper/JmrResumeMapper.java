package com.ruoyi.student.mapper;

import java.util.List;
import com.ruoyi.student.domain.JmrResume;

/**
 * 学生简历Mapper接口
 * 
 * @author liangliang
 * @date 2020-09-28
 */
public interface JmrResumeMapper 
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

    /*
    * 学生查看个人的简历
    *
    * */
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
     * 删除学生简历
     * 
     * @param rId 学生简历ID
     * @return 结果
     */
    public int deleteJmrResumeById(Long rId);

    /**
     * 批量删除学生简历
     * 
     * @param rIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrResumeByIds(String[] rIds);
}
