package com.ruoyi.job.service;

import java.util.List;
import com.ruoyi.job.domain.JmrRyStudentMatchResult;

/**
 * 匹配信息查询Service接口
 * 
 * @author liangliang
 * @date 2020-10-02
 */
public interface IJmrRyStudentMatchResultService 
{
    /**
     * 查询匹配信息查询
     * 
     * @param smrId 匹配信息查询ID
     * @return 匹配信息查询
     */
    public JmrRyStudentMatchResult selectJmrRyStudentMatchResultById(Long smrId);

    /**
     * 查询匹配信息查询列表
     * 
     * @param jmrRyStudentMatchResult 匹配信息查询
     * @return 匹配信息查询集合
     */
    public List<JmrRyStudentMatchResult> selectJmrRyStudentMatchResultList(JmrRyStudentMatchResult jmrRyStudentMatchResult);

    /**
     * 新增匹配信息查询
     * 
     * @param jmrRyStudentMatchResult 匹配信息查询
     * @return 结果
     */
    public int insertJmrRyStudentMatchResult(JmrRyStudentMatchResult jmrRyStudentMatchResult);

    /**
     * 修改匹配信息查询
     * 
     * @param jmrRyStudentMatchResult 匹配信息查询
     * @return 结果
     */
    public int updateJmrRyStudentMatchResult(JmrRyStudentMatchResult jmrRyStudentMatchResult);

    /**
     * 批量删除匹配信息查询
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrRyStudentMatchResultByIds(String ids);

    /**
     * 删除匹配信息查询信息
     * 
     * @param smrId 匹配信息查询ID
     * @return 结果
     */
    public int deleteJmrRyStudentMatchResultById(Long smrId);
}
