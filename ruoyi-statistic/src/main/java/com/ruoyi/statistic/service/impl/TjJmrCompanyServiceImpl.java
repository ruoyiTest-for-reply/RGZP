package com.ruoyi.statistic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.statistic.mapper.TjJmrCompanyMapper;
import com.ruoyi.statistic.domain.TjJmrCompany;
import com.ruoyi.statistic.service.ITjJmrCompanyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 存储企业信息Service业务层处理
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
@Service
public class TjJmrCompanyServiceImpl implements ITjJmrCompanyService 
{
    @Autowired
    private TjJmrCompanyMapper tjJmrCompanyMapper;

    /**
     * 查询存储企业信息
     * 
     * @param cId 存储企业信息ID
     * @return 存储企业信息
     */
    @Override
    public TjJmrCompany selectTjJmrCompanyById(Long cId)
    {
        return tjJmrCompanyMapper.selectTjJmrCompanyById(cId);
    }

    /**
     * 查询存储企业信息列表
     * 
     * @param tjJmrCompany 存储企业信息
     * @return 存储企业信息
     */
    @Override
    public List<TjJmrCompany> selectTjJmrCompanyList(TjJmrCompany tjJmrCompany)
    {
        return tjJmrCompanyMapper.selectTjJmrCompanyList(tjJmrCompany);
    }

    /**
     * 新增存储企业信息
     * 
     * @param tjJmrCompany 存储企业信息
     * @return 结果
     */
    @Override
    public int insertTjJmrCompany(TjJmrCompany tjJmrCompany)
    {
        return tjJmrCompanyMapper.insertTjJmrCompany(tjJmrCompany);
    }

    /**
     * 修改存储企业信息
     * 
     * @param tjJmrCompany 存储企业信息
     * @return 结果
     */
    @Override
    public int updateTjJmrCompany(TjJmrCompany tjJmrCompany)
    {
        return tjJmrCompanyMapper.updateTjJmrCompany(tjJmrCompany);
    }

    /**
     * 删除存储企业信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrCompanyByIds(String ids)
    {
        return tjJmrCompanyMapper.deleteTjJmrCompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除存储企业信息信息
     * 
     * @param cId 存储企业信息ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrCompanyById(Long cId)
    {
        return tjJmrCompanyMapper.deleteTjJmrCompanyById(cId);
    }
}
