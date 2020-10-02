package com.ruoyi.statistic.mapper;

import java.util.List;
import com.ruoyi.statistic.domain.TjJmrCompany;

/**
 * 存储企业信息Mapper接口
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
public interface TjJmrCompanyMapper 
{
    /**
     * 查询存储企业信息
     * 
     * @param cId 存储企业信息ID
     * @return 存储企业信息
     */
    public TjJmrCompany selectTjJmrCompanyById(Long cId);

    /**
     * 查询存储企业信息列表
     * 
     * @param tjJmrCompany 存储企业信息
     * @return 存储企业信息集合
     */
    public List<TjJmrCompany> selectTjJmrCompanyList(TjJmrCompany tjJmrCompany);

    /**
     * 新增存储企业信息
     * 
     * @param tjJmrCompany 存储企业信息
     * @return 结果
     */
    public int insertTjJmrCompany(TjJmrCompany tjJmrCompany);

    /**
     * 修改存储企业信息
     * 
     * @param tjJmrCompany 存储企业信息
     * @return 结果
     */
    public int updateTjJmrCompany(TjJmrCompany tjJmrCompany);

    /**
     * 删除存储企业信息
     * 
     * @param cId 存储企业信息ID
     * @return 结果
     */
    public int deleteTjJmrCompanyById(Long cId);

    /**
     * 批量删除存储企业信息
     * 
     * @param cIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTjJmrCompanyByIds(String[] cIds);
}
