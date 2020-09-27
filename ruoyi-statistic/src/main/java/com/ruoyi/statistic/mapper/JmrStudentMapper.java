package com.ruoyi.statistic.mapper;

import java.util.List;
import com.ruoyi.statistic.domain.JmrStudent;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学生t统计Mapper接口
 * 
 * @author LiangLiang
 * @date 2020-09-27
 */
@Mapper
public interface JmrStudentMapper {

    List<List> findAll();
}

