package com.ruoyi.statistic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.statistic.mapper.JmrStudentMapper;
import com.ruoyi.statistic.domain.JmrStudent;
import com.ruoyi.statistic.service.IJmrStudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生t统计Service业务层处理
 * 
 * @author LiangLiang
 * @date 2020-09-27
 */
@Service
public class JmrStudentServiceImpl implements IJmrStudentService 
{
    @Autowired
    private JmrStudentMapper jmrStudentMapper;

    /**
     * 查询学生t统计
     * 
     * @param sId 学生t统计ID
     * @return 学生t统计
     */
    @Override
    public List<List> findAll() {
        return jmrStudentMapper.findAll();
    }

}
