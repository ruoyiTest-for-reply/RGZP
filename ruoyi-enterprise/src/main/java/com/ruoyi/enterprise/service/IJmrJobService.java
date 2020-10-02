package com.ruoyi.enterprise.service;

import com.ruoyi.enterprise.domain.JmrJob;

import java.util.List;

/**
 * 企业岗位要求Service接口
 * 
 * @author liangliang
 * @date 2020-09-28
 */
public interface IJmrJobService 
{
    /**
     * 查询企业岗位要求
     * 
     * @param jId 企业岗位要求ID
     * @return 企业岗位要求
     */
    public JmrJob selectJmrJobById(Long jId);

    /**
     * 查询企业岗位要求列表
     * 
     * @param jmrJob 企业岗位要求
     * @return 企业岗位要求集合
     */
    public List<JmrJob> selectJmrJobList(JmrJob jmrJob);

    /**
     * 新增企业岗位要求
     * 
     * @param jmrJob 企业岗位要求
     * @return 结果
     */
    public int insertJmrJob(JmrJob jmrJob);

    /**
     * 修改企业岗位要求
     * 
     * @param jmrJob 企业岗位要求
     * @return 结果
     */
    public int updateJmrJob(JmrJob jmrJob);

    /**
     * 批量删除企业岗位要求
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrJobByIds(String ids);

    /**
     * 删除企业岗位要求信息
     * 
     * @param jId 企业岗位要求ID
     * @return 结果
     */
    public int deleteJmrJobById(Long jId);
}
