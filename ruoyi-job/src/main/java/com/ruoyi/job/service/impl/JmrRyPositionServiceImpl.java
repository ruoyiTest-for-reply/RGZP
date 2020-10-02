package com.ruoyi.job.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.job.mapper.JmrRyPositionMapper;
import com.ruoyi.job.domain.JmrRyPosition;
import com.ruoyi.job.service.IJmrRyPositionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 岗位信息查询Service业务层处理
 * 
 * @author liangliang
 * @date 2020-10-02
 */
@Service
public class JmrRyPositionServiceImpl implements IJmrRyPositionService 
{
    @Autowired
    private JmrRyPositionMapper jmrRyPositionMapper;

    /**
     * 查询岗位信息查询
     * 
     * @param pId 岗位信息查询ID
     * @return 岗位信息查询
     */
    @Override
    public JmrRyPosition selectJmrRyPositionById(Long pId)
    {
        return jmrRyPositionMapper.selectJmrRyPositionById(pId);
    }

    /**
     * 查询岗位信息查询列表
     * 
     * @param jmrRyPosition 岗位信息查询
     * @return 岗位信息查询
     */
    @Override
    public List<JmrRyPosition> selectJmrRyPositionList(JmrRyPosition jmrRyPosition)
    {
        return jmrRyPositionMapper.selectJmrRyPositionList(jmrRyPosition);
    }

    /**
     * 新增岗位信息查询
     * 
     * @param jmrRyPosition 岗位信息查询
     * @return 结果
     */
    @Override
    public int insertJmrRyPosition(JmrRyPosition jmrRyPosition)
    {
        return jmrRyPositionMapper.insertJmrRyPosition(jmrRyPosition);
    }

    /**
     * 修改岗位信息查询
     * 
     * @param jmrRyPosition 岗位信息查询
     * @return 结果
     */
    @Override
    public int updateJmrRyPosition(JmrRyPosition jmrRyPosition)
    {
        return jmrRyPositionMapper.updateJmrRyPosition(jmrRyPosition);
    }

    /**
     * 删除岗位信息查询对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrRyPositionByIds(String ids)
    {
        return jmrRyPositionMapper.deleteJmrRyPositionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除岗位信息查询信息
     * 
     * @param pId 岗位信息查询ID
     * @return 结果
     */
    @Override
    public int deleteJmrRyPositionById(Long pId)
    {
        return jmrRyPositionMapper.deleteJmrRyPositionById(pId);
    }
}
