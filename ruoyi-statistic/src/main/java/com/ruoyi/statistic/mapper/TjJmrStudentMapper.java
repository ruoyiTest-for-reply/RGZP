package com.ruoyi.statistic.mapper;

import java.util.List;
import com.ruoyi.statistic.domain.TjJmrStudent;

/**
 * 学生统计Mapper接口
 * 
 * @author LiangLiang
 * @date 2020-09-30
 */
public interface TjJmrStudentMapper 
{
    /**
     * 查询学生统计
     * 
     * @param sId 学生统计ID
     * @return 学生统计
     */
    public TjJmrStudent selectTjJmrStudentById(Long sId);

    /**
     * 查询学生统计列表
     * 
     * @param tjJmrStudent 学生统计
     * @return 学生统计集合
     */
    public List<TjJmrStudent> selectTjJmrStudentList(TjJmrStudent tjJmrStudent);

    /**
     * 新增学生统计
     * 
     * @param tjJmrStudent 学生统计
     * @return 结果
     */
    public int insertTjJmrStudent(TjJmrStudent tjJmrStudent);

    /**
     * 修改学生统计
     * 
     * @param tjJmrStudent 学生统计
     * @return 结果
     */
    public int updateTjJmrStudent(TjJmrStudent tjJmrStudent);

    /**
     * 删除学生统计
     * 
     * @param sId 学生统计ID
     * @return 结果
     */
    public int deleteTjJmrStudentById(Long sId);

    /**
     * 批量删除学生统计
     * 
     * @param sIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTjJmrStudentByIds(String[] sIds);
}
