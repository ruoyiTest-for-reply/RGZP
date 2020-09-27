package com.ruoyi.enterprise.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.enterprise.mapper.JmrPositionMapper;
import com.ruoyi.enterprise.domain.JmrPosition;
import com.ruoyi.enterprise.service.IJmrPositionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 岗位信息Service业务层处理
 * 
 * @author liangliang
 * @date 2020-09-27
 */
@Service
public class JmrPositionServiceImpl implements IJmrPositionService 
{
    @Autowired
    private JmrPositionMapper jmrPositionMapper;

    /**
     * 查询岗位信息
     * 
     * @param pId 岗位信息ID
     * @return 岗位信息
     */
    @Override
    public JmrPosition selectJmrPositionById(Long pId)
    {
        return jmrPositionMapper.selectJmrPositionById(pId);
    }

    /**
     * 查询岗位信息列表
     * 
     * @param jmrPosition 岗位信息
     * @return 岗位信息
     */
    @Override
    public List<JmrPosition> selectJmrPositionList(JmrPosition jmrPosition)
    {
        return jmrPositionMapper.selectJmrPositionList(jmrPosition);
    }

    /**
     * 新增岗位信息
     * 
     * @param jmrPosition 岗位信息
     * @return 结果
     */
    @Override
    public int insertJmrPosition(JmrPosition jmrPosition)
    {
        return jmrPositionMapper.insertJmrPosition(jmrPosition);
    }

    /**
     * 修改岗位信息
     * 
     * @param jmrPosition 岗位信息
     * @return 结果
     */
    @Override
    public int updateJmrPosition(JmrPosition jmrPosition)
    {
        return jmrPositionMapper.updateJmrPosition(jmrPosition);
    }

    /**
     * 删除岗位信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrPositionByIds(String ids)
    {
        return jmrPositionMapper.deleteJmrPositionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除岗位信息信息
     * 
     * @param pId 岗位信息ID
     * @return 结果
     */
    @Override
    public int deleteJmrPositionById(Long pId)
    {
        return jmrPositionMapper.deleteJmrPositionById(pId);
    }
}
