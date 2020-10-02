package com.ruoyi.statistic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.statistic.mapper.TjJmrJobMatchResultMapper;
import com.ruoyi.statistic.domain.TjJmrJobMatchResult;
import com.ruoyi.statistic.service.ITjJmrJobMatchResultService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生匹配信息统计Service业务层处理
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
@Service
public class TjJmrJobMatchResultServiceImpl implements ITjJmrJobMatchResultService 
{
    @Autowired
    private TjJmrJobMatchResultMapper tjJmrJobMatchResultMapper;

    /**
     * 查询学生匹配信息统计
     * 
     * @param jmrId 学生匹配信息统计ID
     * @return 学生匹配信息统计
     */
    @Override
    public TjJmrJobMatchResult selectTjJmrJobMatchResultById(Long jmrId)
    {
        return tjJmrJobMatchResultMapper.selectTjJmrJobMatchResultById(jmrId);
    }

    /**
     * 查询学生匹配信息统计列表
     * 
     * @param tjJmrJobMatchResult 学生匹配信息统计
     * @return 学生匹配信息统计
     */
    @Override
    public List<TjJmrJobMatchResult> selectTjJmrJobMatchResultList(TjJmrJobMatchResult tjJmrJobMatchResult)
    {
        return tjJmrJobMatchResultMapper.selectTjJmrJobMatchResultList(tjJmrJobMatchResult);
    }

    /**
     * 新增学生匹配信息统计
     * 
     * @param tjJmrJobMatchResult 学生匹配信息统计
     * @return 结果
     */
    @Override
    public int insertTjJmrJobMatchResult(TjJmrJobMatchResult tjJmrJobMatchResult)
    {
        return tjJmrJobMatchResultMapper.insertTjJmrJobMatchResult(tjJmrJobMatchResult);
    }

    /**
     * 修改学生匹配信息统计
     * 
     * @param tjJmrJobMatchResult 学生匹配信息统计
     * @return 结果
     */
    @Override
    public int updateTjJmrJobMatchResult(TjJmrJobMatchResult tjJmrJobMatchResult)
    {
        return tjJmrJobMatchResultMapper.updateTjJmrJobMatchResult(tjJmrJobMatchResult);
    }

    /**
     * 删除学生匹配信息统计对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrJobMatchResultByIds(String ids)
    {
        return tjJmrJobMatchResultMapper.deleteTjJmrJobMatchResultByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生匹配信息统计信息
     * 
     * @param jmrId 学生匹配信息统计ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrJobMatchResultById(Long jmrId)
    {
        return tjJmrJobMatchResultMapper.deleteTjJmrJobMatchResultById(jmrId);
    }
}
