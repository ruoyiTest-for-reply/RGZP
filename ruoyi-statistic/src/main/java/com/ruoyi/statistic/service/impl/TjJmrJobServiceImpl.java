package com.ruoyi.statistic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.statistic.mapper.TjJmrJobMapper;
import com.ruoyi.statistic.domain.TjJmrJob;
import com.ruoyi.statistic.service.ITjJmrJobService;
import com.ruoyi.common.core.text.Convert;

/**
 * 存储企业保存的岗位信息Service业务层处理
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
@Service
public class TjJmrJobServiceImpl implements ITjJmrJobService 
{
    @Autowired
    private TjJmrJobMapper tjJmrJobMapper;

    /**
     * 查询存储企业保存的岗位信息
     * 
     * @param jId 存储企业保存的岗位信息ID
     * @return 存储企业保存的岗位信息
     */
    @Override
    public TjJmrJob selectTjJmrJobById(Integer jId)
    {
        return tjJmrJobMapper.selectTjJmrJobById(jId);
    }

    /**
     * 查询存储企业保存的岗位信息列表
     * 
     * @param tjJmrJob 存储企业保存的岗位信息
     * @return 存储企业保存的岗位信息
     */
    @Override
    public List<TjJmrJob> selectTjJmrJobList(TjJmrJob tjJmrJob)
    {
        return tjJmrJobMapper.selectTjJmrJobList(tjJmrJob);
    }

    /**
     * 新增存储企业保存的岗位信息
     * 
     * @param tjJmrJob 存储企业保存的岗位信息
     * @return 结果
     */
    @Override
    public int insertTjJmrJob(TjJmrJob tjJmrJob)
    {
        return tjJmrJobMapper.insertTjJmrJob(tjJmrJob);
    }

    /**
     * 修改存储企业保存的岗位信息
     * 
     * @param tjJmrJob 存储企业保存的岗位信息
     * @return 结果
     */
    @Override
    public int updateTjJmrJob(TjJmrJob tjJmrJob)
    {
        return tjJmrJobMapper.updateTjJmrJob(tjJmrJob);
    }

    /**
     * 删除存储企业保存的岗位信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrJobByIds(String ids)
    {
        return tjJmrJobMapper.deleteTjJmrJobByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除存储企业保存的岗位信息信息
     * 
     * @param jId 存储企业保存的岗位信息ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrJobById(Integer jId)
    {
        return tjJmrJobMapper.deleteTjJmrJobById(jId);
    }
}
