package com.ruoyi.statistic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.statistic.mapper.TjJmrPositionMapper;
import com.ruoyi.statistic.domain.TjJmrPosition;
import com.ruoyi.statistic.service.ITjJmrPositionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 岗位信息Service业务层处理
 * 
 * @author liangliang
 * @date 2020-10-02
 */
@Service
public class TjJmrPositionServiceImpl implements ITjJmrPositionService 
{
    @Autowired
    private TjJmrPositionMapper tjJmrPositionMapper;

    /**
     * 查询岗位信息
     * 
     * @param pId 岗位信息ID
     * @return 岗位信息
     */
    @Override
    public TjJmrPosition selectTjJmrPositionById(Long pId)
    {
        return tjJmrPositionMapper.selectTjJmrPositionById(pId);
    }

    /**
     * 查询岗位信息列表
     * 
     * @param tjJmrPosition 岗位信息
     * @return 岗位信息
     */
    @Override
    public List<TjJmrPosition> selectTjJmrPositionList(TjJmrPosition tjJmrPosition)
    {
        return tjJmrPositionMapper.selectTjJmrPositionList(tjJmrPosition);
    }

    /**
     * 新增岗位信息
     * 
     * @param tjJmrPosition 岗位信息
     * @return 结果
     */
    @Override
    public int insertTjJmrPosition(TjJmrPosition tjJmrPosition)
    {
        return tjJmrPositionMapper.insertTjJmrPosition(tjJmrPosition);
    }

    /**
     * 修改岗位信息
     * 
     * @param tjJmrPosition 岗位信息
     * @return 结果
     */
    @Override
    public int updateTjJmrPosition(TjJmrPosition tjJmrPosition)
    {
        return tjJmrPositionMapper.updateTjJmrPosition(tjJmrPosition);
    }

    /**
     * 删除岗位信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrPositionByIds(String ids)
    {
        return tjJmrPositionMapper.deleteTjJmrPositionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除岗位信息信息
     * 
     * @param pId 岗位信息ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrPositionById(Long pId)
    {
        return tjJmrPositionMapper.deleteTjJmrPositionById(pId);
    }
}
