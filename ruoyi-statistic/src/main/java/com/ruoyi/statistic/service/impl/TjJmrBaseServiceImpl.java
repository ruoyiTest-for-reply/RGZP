package com.ruoyi.statistic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.statistic.mapper.TjJmrBaseMapper;
import com.ruoyi.statistic.domain.TjJmrBase;
import com.ruoyi.statistic.service.ITjJmrBaseService;
import com.ruoyi.common.core.text.Convert;

/**
 * 存储匹配好的岗位信息（面向学生端）的依赖数据Service业务层处理
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
@Service
public class TjJmrBaseServiceImpl implements ITjJmrBaseService 
{
    @Autowired
    private TjJmrBaseMapper tjJmrBaseMapper;

    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param jmrBId 存储匹配好的岗位信息（面向学生端）的依赖数据ID
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    @Override
    public TjJmrBase selectTjJmrBaseById(Integer jmrBId)
    {
        return tjJmrBaseMapper.selectTjJmrBaseById(jmrBId);
    }

    /**
     * 查询存储匹配好的岗位信息（面向学生端）的依赖数据列表
     * 
     * @param tjJmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 存储匹配好的岗位信息（面向学生端）的依赖数据
     */
    @Override
    public List<TjJmrBase> selectTjJmrBaseList(TjJmrBase tjJmrBase)
    {
        return tjJmrBaseMapper.selectTjJmrBaseList(tjJmrBase);
    }

    /**
     * 新增存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param tjJmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 结果
     */
    @Override
    public int insertTjJmrBase(TjJmrBase tjJmrBase)
    {
        return tjJmrBaseMapper.insertTjJmrBase(tjJmrBase);
    }

    /**
     * 修改存储匹配好的岗位信息（面向学生端）的依赖数据
     * 
     * @param tjJmrBase 存储匹配好的岗位信息（面向学生端）的依赖数据
     * @return 结果
     */
    @Override
    public int updateTjJmrBase(TjJmrBase tjJmrBase)
    {
        return tjJmrBaseMapper.updateTjJmrBase(tjJmrBase);
    }

    /**
     * 删除存储匹配好的岗位信息（面向学生端）的依赖数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrBaseByIds(String ids)
    {
        return tjJmrBaseMapper.deleteTjJmrBaseByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除存储匹配好的岗位信息（面向学生端）的依赖数据信息
     * 
     * @param jmrBId 存储匹配好的岗位信息（面向学生端）的依赖数据ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrBaseById(Integer jmrBId)
    {
        return tjJmrBaseMapper.deleteTjJmrBaseById(jmrBId);
    }
}
