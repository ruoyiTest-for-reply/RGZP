package com.ruoyi.job.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.job.mapper.JmrRyStudentMatchResultMapper;
import com.ruoyi.job.domain.JmrRyStudentMatchResult;
import com.ruoyi.job.service.IJmrRyStudentMatchResultService;
import com.ruoyi.common.core.text.Convert;

/**
 * 匹配信息查询Service业务层处理
 * 
 * @author liangliang
 * @date 2020-10-02
 */
@Service
public class JmrRyStudentMatchResultServiceImpl implements IJmrRyStudentMatchResultService 
{
    @Autowired
    private JmrRyStudentMatchResultMapper jmrRyStudentMatchResultMapper;

    /**
     * 查询匹配信息查询
     * 
     * @param smrId 匹配信息查询ID
     * @return 匹配信息查询
     */
    @Override
    public JmrRyStudentMatchResult selectJmrRyStudentMatchResultById(Long smrId)
    {
        return jmrRyStudentMatchResultMapper.selectJmrRyStudentMatchResultById(smrId);
    }

    /**
     * 查询匹配信息查询列表
     * 
     * @param jmrRyStudentMatchResult 匹配信息查询
     * @return 匹配信息查询
     */
    @Override
    public List<JmrRyStudentMatchResult> selectJmrRyStudentMatchResultList(JmrRyStudentMatchResult jmrRyStudentMatchResult)
    {
        return jmrRyStudentMatchResultMapper.selectJmrRyStudentMatchResultList(jmrRyStudentMatchResult);
    }

    /**
     * 新增匹配信息查询
     * 
     * @param jmrRyStudentMatchResult 匹配信息查询
     * @return 结果
     */
    @Override
    public int insertJmrRyStudentMatchResult(JmrRyStudentMatchResult jmrRyStudentMatchResult)
    {
        return jmrRyStudentMatchResultMapper.insertJmrRyStudentMatchResult(jmrRyStudentMatchResult);
    }

    /**
     * 修改匹配信息查询
     * 
     * @param jmrRyStudentMatchResult 匹配信息查询
     * @return 结果
     */
    @Override
    public int updateJmrRyStudentMatchResult(JmrRyStudentMatchResult jmrRyStudentMatchResult)
    {
        return jmrRyStudentMatchResultMapper.updateJmrRyStudentMatchResult(jmrRyStudentMatchResult);
    }

    /**
     * 删除匹配信息查询对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrRyStudentMatchResultByIds(String ids)
    {
        return jmrRyStudentMatchResultMapper.deleteJmrRyStudentMatchResultByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除匹配信息查询信息
     * 
     * @param smrId 匹配信息查询ID
     * @return 结果
     */
    @Override
    public int deleteJmrRyStudentMatchResultById(Long smrId)
    {
        return jmrRyStudentMatchResultMapper.deleteJmrRyStudentMatchResultById(smrId);
    }
}
