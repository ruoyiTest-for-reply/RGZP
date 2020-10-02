package com.ruoyi.statistic.mapper;

import java.util.List;
import com.ruoyi.statistic.domain.TjJmrJobMatchResult;

/**
 * 学生匹配信息统计Mapper接口
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
public interface TjJmrJobMatchResultMapper 
{
    /**
     * 查询学生匹配信息统计
     * 
     * @param jmrId 学生匹配信息统计ID
     * @return 学生匹配信息统计
     */
    public TjJmrJobMatchResult selectTjJmrJobMatchResultById(Long jmrId);

    /**
     * 查询学生匹配信息统计列表
     * 
     * @param tjJmrJobMatchResult 学生匹配信息统计
     * @return 学生匹配信息统计集合
     */
    public List<TjJmrJobMatchResult> selectTjJmrJobMatchResultList(TjJmrJobMatchResult tjJmrJobMatchResult);

    /**
     * 新增学生匹配信息统计
     * 
     * @param tjJmrJobMatchResult 学生匹配信息统计
     * @return 结果
     */
    public int insertTjJmrJobMatchResult(TjJmrJobMatchResult tjJmrJobMatchResult);

    /**
     * 修改学生匹配信息统计
     * 
     * @param tjJmrJobMatchResult 学生匹配信息统计
     * @return 结果
     */
    public int updateTjJmrJobMatchResult(TjJmrJobMatchResult tjJmrJobMatchResult);

    /**
     * 删除学生匹配信息统计
     * 
     * @param jmrId 学生匹配信息统计ID
     * @return 结果
     */
    public int deleteTjJmrJobMatchResultById(Long jmrId);

    /**
     * 批量删除学生匹配信息统计
     * 
     * @param jmrIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTjJmrJobMatchResultByIds(String[] jmrIds);
}
