package com.ruoyi.enterprise.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.enterprise.domain.JmrJob;
import com.ruoyi.enterprise.mapper.JmrJobMapper;
import com.ruoyi.enterprise.service.IJmrJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 企业岗位要求Service业务层处理
 * 
 * @author liangliang
 * @date 2020-09-28
 */
@Service
public class JmrJobServiceImpl implements IJmrJobService 
{
    @Autowired
    private JmrJobMapper jmrJobMapper;

    /**
     * 查询企业岗位要求
     * 
     * @param jId 企业岗位要求ID
     * @return 企业岗位要求
     */
    @Override
    public JmrJob selectJmrJobById(Long jId)
    {
        return jmrJobMapper.selectJmrJobById(jId);
    }

    /**
     * 查询企业岗位要求列表
     * 
     * @param jmrJob 企业岗位要求
     * @return 企业岗位要求
     */
    @Override
    public List<JmrJob> selectJmrJobList(JmrJob jmrJob)
    {
        return jmrJobMapper.selectJmrJobList(jmrJob);
    }

    /**
     * 新增企业岗位要求
     * 
     * @param jmrJob 企业岗位要求
     * @return 结果
     */
    @Override
    public int insertJmrJob(JmrJob jmrJob)
    {
        return jmrJobMapper.insertJmrJob(jmrJob);
    }

    /**
     * 修改企业岗位要求
     * 
     * @param jmrJob 企业岗位要求
     * @return 结果
     */
    @Override
    public int updateJmrJob(JmrJob jmrJob)
    {
        return jmrJobMapper.updateJmrJob(jmrJob);
    }

    /**
     * 删除企业岗位要求对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrJobByIds(String ids)
    {
        return jmrJobMapper.deleteJmrJobByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除企业岗位要求信息
     * 
     * @param jId 企业岗位要求ID
     * @return 结果
     */
    @Override
    public int deleteJmrJobById(Long jId)
    {
        return jmrJobMapper.deleteJmrJobById(jId);
    }
}
