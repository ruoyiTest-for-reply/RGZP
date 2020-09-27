package com.ruoyi.enterprise.service;

import java.util.List;
import com.ruoyi.enterprise.domain.JmrCompany;

/**
 * 企业列表Service接口
 * 
 * @author liangliang
 * @date 2020-09-27
 */
public interface IJmrCompanyService 
{
    /**
     * 查询企业列表
     * 
     * @param cId 企业列表ID
     * @return 企业列表
     */
    public JmrCompany selectJmrCompanyById(Long cId);

    /**
     * 查询企业列表列表
     * 
     * @param jmrCompany 企业列表
     * @return 企业列表集合
     */
    public List<JmrCompany> selectJmrCompanyList(JmrCompany jmrCompany);

    /**
     * 新增企业列表
     * 
     * @param jmrCompany 企业列表
     * @return 结果
     */
    public int insertJmrCompany(JmrCompany jmrCompany);

    /**
     * 修改企业列表
     * 
     * @param jmrCompany 企业列表
     * @return 结果
     */
    public int updateJmrCompany(JmrCompany jmrCompany);

    /**
     * 批量删除企业列表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJmrCompanyByIds(String ids);

    /**
     * 删除企业列表信息
     * 
     * @param cId 企业列表ID
     * @return 结果
     */
    public int deleteJmrCompanyById(Long cId);
}
