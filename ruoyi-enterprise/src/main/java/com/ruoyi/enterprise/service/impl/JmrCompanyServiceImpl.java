package com.ruoyi.enterprise.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.enterprise.domain.JmrCompany;
import com.ruoyi.enterprise.mapper.JmrCompanyMapper;
import com.ruoyi.enterprise.service.IJmrCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 企业列表Service业务层处理
 * 
 * @author liangliang
 * @date 2020-09-27
 */
@Service
public class JmrCompanyServiceImpl implements IJmrCompanyService 
{
    @Autowired
    private JmrCompanyMapper jmrCompanyMapper;

    /**
     * 查询企业列表
     * 
     * @param cId 企业列表ID
     * @return 企业列表
     */
    @Override
    public JmrCompany selectJmrCompanyById(Long cId)
    {
        return jmrCompanyMapper.selectJmrCompanyById(cId);
    }

    /**
     * 查询企业列表列表
     * 
     * @param jmrCompany 企业列表
     * @return 企业列表
     */
    @Override
    public List<JmrCompany> selectJmrCompanyList(JmrCompany jmrCompany)
    {
        return jmrCompanyMapper.selectJmrCompanyList(jmrCompany);
    }

    /**
     * 新增企业列表
     * 
     * @param jmrCompany 企业列表
     * @return 结果
     */
    @Override
    public int insertJmrCompany(JmrCompany jmrCompany)
    {
        return jmrCompanyMapper.insertJmrCompany(jmrCompany);
    }

    /**
     * 修改企业列表
     * 
     * @param jmrCompany 企业列表
     * @return 结果
     */
    @Override
    public int updateJmrCompany(JmrCompany jmrCompany)
    {
        return jmrCompanyMapper.updateJmrCompany(jmrCompany);
    }

    /**
     * 删除企业列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJmrCompanyByIds(String ids)
    {
        return jmrCompanyMapper.deleteJmrCompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除企业列表信息
     * 
     * @param cId 企业列表ID
     * @return 结果
     */
    @Override
    public int deleteJmrCompanyById(Long cId)
    {
        return jmrCompanyMapper.deleteJmrCompanyById(cId);
    }
}
