package com.ruoyi.job.service;

import java.util.List;
import com.ruoyi.job.domain.JmrRyCompany;

/**
 * 企业信息查询Service接口
 * 
 * @author liangliang
 * @date 2020-10-02
 */
public interface IJmrRyCompanyService 
{
    /**
     * 查询企业信息查询
     * 
     * @param cId 企业信息查询ID
     * @return 企业信息查询
     */
    public JmrRyCompany selectJmrRyCompanyById(Long cId);

    /**
     * 查询企业信息查询列表
     * 
     * @param jmrRyCompany 企业信息查询
     * @return 企业信息查询集合
     */
    public List<JmrRyCompany> selectJmrRyCompanyList(JmrRyCompany jmrRyCompany);

    /**
     * 新增企业信息查询
     * 
     * @param jmrRyCompany 企业信息查询
     * @return 结果
     */
    public int insertJmrRyCompany(JmrRyCompany jmrRyCompany);

    /**
     * 修改企业信息查询
     * 
     * @param jmrRyCompany 企业信息查询
     * @return 结果
     */
    public int updateJmrRyCompany(JmrRyCompany jmrRyCompany);

    /**
     * 批量删除企业信息查询
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrRyCompanyByIds(String ids);

    /**
     * 删除企业信息查询信息
     * 
     * @param cId 企业信息查询ID
     * @return 结果
     */
    public int deleteJmrRyCompanyById(Long cId);
}
