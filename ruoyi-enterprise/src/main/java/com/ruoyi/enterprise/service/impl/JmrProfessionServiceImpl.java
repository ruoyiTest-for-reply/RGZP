package com.ruoyi.enterprise.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.enterprise.domain.JmrProfession;
import com.ruoyi.enterprise.mapper.JmrProfessionMapper;
import com.ruoyi.enterprise.service.IJmrProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 专业信息Service业务层处理
 * 
 * @author liangliang
 * @date 2020-09-29
 */
@Service
public class JmrProfessionServiceImpl implements IJmrProfessionService 
{
    @Autowired
    private JmrProfessionMapper jmrProfessionMapper;

    /**
     * 查询专业信息
     * 
     * @param pId 专业信息ID
     * @return 专业信息
     */
    @Override
    public JmrProfession selectJmrProfessionById(Long pId)
    {
        return jmrProfessionMapper.selectJmrProfessionById(pId);
    }

    /**
     * 查询专业信息列表
     * 
     * @param jmrProfession 专业信息
     * @return 专业信息
     */
    @Override
    public List<JmrProfession> selectJmrProfessionList(JmrProfession jmrProfession)
    {
        return jmrProfessionMapper.selectJmrProfessionList(jmrProfession);
    }

    /**
     * 新增专业信息
     * 
     * @param jmrProfession 专业信息
     * @return 结果
     */
    @Override
    public int insertJmrProfession(JmrProfession jmrProfession)
    {
        return jmrProfessionMapper.insertJmrProfession(jmrProfession);
    }

    /**
     * 修改专业信息
     * 
     * @param jmrProfession 专业信息
     * @return 结果
     */
    @Override
    public int updateJmrProfession(JmrProfession jmrProfession)
    {
        return jmrProfessionMapper.updateJmrProfession(jmrProfession);
    }

    /**
     * 删除专业信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrProfessionByIds(String ids)
    {
        return jmrProfessionMapper.deleteJmrProfessionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除专业信息信息
     * 
     * @param pId 专业信息ID
     * @return 结果
     */
    @Override
    public int deleteJmrProfessionById(Long pId)
    {
        return jmrProfessionMapper.deleteJmrProfessionById(pId);
    }
}
