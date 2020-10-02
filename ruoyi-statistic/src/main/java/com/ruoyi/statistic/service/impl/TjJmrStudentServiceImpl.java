package com.ruoyi.statistic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.statistic.mapper.TjJmrStudentMapper;
import com.ruoyi.statistic.domain.TjJmrStudent;
import com.ruoyi.statistic.service.ITjJmrStudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生统计Service业务层处理
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
@Service
public class TjJmrStudentServiceImpl implements ITjJmrStudentService 
{
    @Autowired
    private TjJmrStudentMapper tjJmrStudentMapper;

    /**
     * 查询学生统计
     * 
     * @param sId 学生统计ID
     * @return 学生统计
     */
    @Override
    public TjJmrStudent selectTjJmrStudentById(Long sId)
    {
        return tjJmrStudentMapper.selectTjJmrStudentById(sId);
    }

    /**
     * 查询学生统计列表
     * 
     * @param tjJmrStudent 学生统计
     * @return 学生统计
     */
    @Override
    public List<TjJmrStudent> selectTjJmrStudentList(TjJmrStudent tjJmrStudent)
    {
        return tjJmrStudentMapper.selectTjJmrStudentList(tjJmrStudent);
    }

    /**
     * 新增学生统计
     * 
     * @param tjJmrStudent 学生统计
     * @return 结果
     */
    @Override
    public int insertTjJmrStudent(TjJmrStudent tjJmrStudent)
    {
        return tjJmrStudentMapper.insertTjJmrStudent(tjJmrStudent);
    }

    /**
     * 修改学生统计
     * 
     * @param tjJmrStudent 学生统计
     * @return 结果
     */
    @Override
    public int updateTjJmrStudent(TjJmrStudent tjJmrStudent)
    {
        return tjJmrStudentMapper.updateTjJmrStudent(tjJmrStudent);
    }

    /**
     * 删除学生统计对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrStudentByIds(String ids)
    {
        return tjJmrStudentMapper.deleteTjJmrStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生统计信息
     * 
     * @param sId 学生统计ID
     * @return 结果
     */
    @Override
    public int deleteTjJmrStudentById(Long sId)
    {
        return tjJmrStudentMapper.deleteTjJmrStudentById(sId);
    }
}
