package com.ruoyi.statistic.mapper;

import java.util.List;
import com.ruoyi.statistic.domain.TjJmrJob;

/**
 * 存储企业保存的岗位信息Mapper接口
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
public interface TjJmrJobMapper 
{
    /**
     * 查询存储企业保存的岗位信息
     * 
     * @param jId 存储企业保存的岗位信息ID
     * @return 存储企业保存的岗位信息
     */
    public TjJmrJob selectTjJmrJobById(Integer jId);

    /**
     * 查询存储企业保存的岗位信息列表
     * 
     * @param tjJmrJob 存储企业保存的岗位信息
     * @return 存储企业保存的岗位信息集合
     */
    public List<TjJmrJob> selectTjJmrJobList(TjJmrJob tjJmrJob);

    /**
     * 新增存储企业保存的岗位信息
     * 
     * @param tjJmrJob 存储企业保存的岗位信息
     * @return 结果
     */
    public int insertTjJmrJob(TjJmrJob tjJmrJob);

    /**
     * 修改存储企业保存的岗位信息
     * 
     * @param tjJmrJob 存储企业保存的岗位信息
     * @return 结果
     */
    public int updateTjJmrJob(TjJmrJob tjJmrJob);

    /**
     * 删除存储企业保存的岗位信息
     * 
     * @param jId 存储企业保存的岗位信息ID
     * @return 结果
     */
    public int deleteTjJmrJobById(Integer jId);

    /**
     * 批量删除存储企业保存的岗位信息
     * 
     * @param jIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTjJmrJobByIds(String[] jIds);
}
