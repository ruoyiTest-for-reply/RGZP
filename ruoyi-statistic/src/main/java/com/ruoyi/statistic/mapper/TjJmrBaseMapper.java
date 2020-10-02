package com.ruoyi.statistic.mapper;

import java.util.List;
import com.ruoyi.statistic.domain.TjJmrBase;

/**
 * 存储匹配好的岗位信息（面向学生端）的依赖数据Mapper接口
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
public interface TjJmrBaseMapper 
{
    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param jmrBId 存储匹配好的岗位信息（面向学生端）的依赖数据ID
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    public TjJmrBase selectTjJmrBaseById(Integer jmrBId);

    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据列表
     * 
     * @param tjJmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据集合
     */
    public List<TjJmrBase> selectTjJmrBaseList(TjJmrBase tjJmrBase);

    /**
     * 新增存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param tjJmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 结果
     */
    public int insertTjJmrBase(TjJmrBase tjJmrBase);

    /**
     * 修改存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param tjJmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 结果
     */
    public int updateTjJmrBase(TjJmrBase tjJmrBase);

    /**
     * 删除存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param jmrBId 存储匹配好的岗位信息（面向学生端）的依赖数据ID
     * @return 结果
     */
    public int deleteTjJmrBaseById(Integer jmrBId);

    /**
     * 批量删除存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param jmrBIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTjJmrBaseByIds(String[] jmrBIds);
}
