package com.ruoyi.job.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.job.mapper.JmrRyCompanyMapper;
import com.ruoyi.job.domain.JmrRyCompany;
import com.ruoyi.job.service.IJmrRyCompanyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 企业信息查询Service业务层处理
 * 
 * @author liangliang
 * @date 2020-10-02
 */
@Service
public class JmrRyCompanyServiceImpl implements IJmrRyCompanyService 
{
    @Autowired
    private JmrRyCompanyMapper jmrRyCompanyMapper;

    /**
     * 查询企业信息查询
     * 
     * @param cId 企业信息查询ID
     * @return 企业信息查询
     */
    @Override
    public JmrRyCompany selectJmrRyCompanyById(Long cId)
    {
        return jmrRyCompanyMapper.selectJmrRyCompanyById(cId);
    }

    /**
     * 查询企业信息查询列表
     * 
     * @param jmrRyCompany 企业信息查询
     * @return 企业信息查询
     */
    @Override
    public List<JmrRyCompany> selectJmrRyCompanyList(JmrRyCompany jmrRyCompany)
    {
        return jmrRyCompanyMapper.selectJmrRyCompanyList(jmrRyCompany);
    }

    /**
     * 新增企业信息查询
     * 
     * @param jmrRyCompany 企业信息查询
     * @return 结果
     */
    @Override
    public int insertJmrRyCompany(JmrRyCompany jmrRyCompany)
    {
        return jmrRyCompanyMapper.insertJmrRyCompany(jmrRyCompany);
    }

    /**
     * 修改企业信息查询
     * 
     * @param jmrRyCompany 企业信息查询
     * @return 结果
     */
    @Override
    public int updateJmrRyCompany(JmrRyCompany jmrRyCompany)
    {
        return jmrRyCompanyMapper.updateJmrRyCompany(jmrRyCompany);
    }

    /**
     * 删除企业信息查询对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrRyCompanyByIds(String ids)
    {
        return jmrRyCompanyMapper.deleteJmrRyCompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除企业信息查询信息
     * 
     * @param cId 企业信息查询ID
     * @return 结果
     */
    @Override
    public int deleteJmrRyCompanyById(Long cId)
    {
        return jmrRyCompanyMapper.deleteJmrRyCompanyById(cId);
    }
}
