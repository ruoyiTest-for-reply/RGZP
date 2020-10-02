package com.ruoyi.job.service;

import java.util.List;
import com.ruoyi.job.domain.JmrRyPosition;

/**
 * 岗位信息查询Service接口
 * 
 * @author liangliang
 * @date 2020-10-02
 */
public interface IJmrRyPositionService 
{
    /**
     * 查询岗位信息查询
     * 
     * @param pId 岗位信息查询ID
     * @return 岗位信息查询
     */
    public JmrRyPosition selectJmrRyPositionById(Long pId);

    /**
     * 查询岗位信息查询列表
     * 
     * @param jmrRyPosition 岗位信息查询
     * @return 岗位信息查询集合
     */
    public List<JmrRyPosition> selectJmrRyPositionList(JmrRyPosition jmrRyPosition);

    /**
     * 新增岗位信息查询
     * 
     * @param jmrRyPosition 岗位信息查询
     * @return 结果
     */
    public int insertJmrRyPosition(JmrRyPosition jmrRyPosition);

    /**
     * 修改岗位信息查询
     * 
     * @param jmrRyPosition 岗位信息查询
     * @return 结果
     */
    public int updateJmrRyPosition(JmrRyPosition jmrRyPosition);

    /**
     * 批量删除岗位信息查询
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrRyPositionByIds(String ids);

    /**
     * 删除岗位信息查询信息
     * 
     * @param pId 岗位信息查询ID
     * @return 结果
     */
    public int deleteJmrRyPositionById(Long pId);
}
