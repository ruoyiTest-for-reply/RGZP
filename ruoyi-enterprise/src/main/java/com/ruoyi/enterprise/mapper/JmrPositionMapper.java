package com.ruoyi.enterprise.mapper;

import com.ruoyi.enterprise.domain.JmrPosition;

import java.util.List;

/**
 * 岗位信息Mapper接口
 * 
 * @author liangliang
 * @date 2020-09-27
 */
public interface JmrPositionMapper 
{
    /**
     * 查询岗位信息
     * 
     * @param pId 岗位信息ID
     * @return 岗位信息
     */
    public JmrPosition selectJmrPositionById(Long pId);

    /**
     * 查询岗位信息列表
     * 
     * @param jmrPosition 岗位信息
     * @return 岗位信息集合
     */
    public List<JmrPosition> selectJmrPositionList(JmrPosition jmrPosition);

    /**
     * 新增岗位信息
     * 
     * @param jmrPosition 岗位信息
     * @return 结果
     */
    public int insertJmrPosition(JmrPosition jmrPosition);

    /**
     * 修改岗位信息
     * 
     * @param jmrPosition 岗位信息
     * @return 结果
     */
    public int updateJmrPosition(JmrPosition jmrPosition);

    /**
     * 删除岗位信息
     * 
     * @param pId 岗位信息ID
     * @return 结果
     */
    public int deleteJmrPositionById(Long pId);

    /**
     * 批量删除岗位信息
     * 
     * @param pIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrPositionByIds(String[] pIds);
}
