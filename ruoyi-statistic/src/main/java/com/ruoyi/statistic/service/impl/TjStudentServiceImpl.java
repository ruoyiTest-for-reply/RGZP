package com.ruoyi.statistic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.statistic.mapper.TjStudentMapper;
import com.ruoyi.statistic.service.ITjStudentService;

/**
 * 学生t统计Service业务层处理
 * 
 * @author LiangLiang
 * @date 2020-09-27
 */
@Service
public class TjStudentServiceImpl implements ITjStudentService
{
    @Autowired
    private TjStudentMapper tjStudentMapper;

    /**
     * 查询学生t统计
     * 
     * @param sId 学生t统计ID
     * @return 学生t统计
     */
    @Override
    public List<List> findAll() {
        return tjStudentMapper.findAll();
    }

}
