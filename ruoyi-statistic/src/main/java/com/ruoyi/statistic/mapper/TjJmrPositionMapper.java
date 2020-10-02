package com.ruoyi.statistic.mapper;

import java.util.List;
import com.ruoyi.statistic.domain.TjJmrPosition;

/**
 * 岗位信息Mapper接口
 * 
 * @author liangliang
 * @date 2020-10-02
 */
public interface TjJmrPositionMapper 
{
    /**
     * 查询岗位信息
     * 
     * @param pId 岗位信息ID
     * @return 岗位信息
     */
    public TjJmrPosition selectTjJmrPositionById(Long pId);

    /**
     * 查询岗位信息列表
     * 
     * @param tjJmrPosition 岗位信息
     * @return 岗位信息集合
     */
    public List<TjJmrPosition> selectTjJmrPositionList(TjJmrPosition tjJmrPosition);

    /**
     * 新增岗位信息
     * 
     * @param tjJmrPosition 岗位信息
     * @return 结果
     */
    public int insertTjJmrPosition(TjJmrPosition tjJmrPosition);

    /**
     * 修改岗位信息
     * 
     * @param tjJmrPosition 岗位信息
     * @return 结果
     */
    public int updateTjJmrPosition(TjJmrPosition tjJmrPosition);

    /**
     * 删除岗位信息
     * 
     * @param pId 岗位信息ID
     * @return 结果
     */
    public int deleteTjJmrPositionById(Long pId);

    /**
     * 批量删除岗位信息
     * 
     * @param pIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTjJmrPositionByIds(String[] pIds);
}
