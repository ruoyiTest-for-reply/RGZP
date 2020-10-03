package com.ruoyi.enterprise.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.enterprise.mapper.PpJmrStudentMapper;
import com.ruoyi.enterprise.domain.PpJmrStudent;
import com.ruoyi.enterprise.service.IPpJmrStudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 手动匹配Service业务层处理
 * 
 * @author liangliang
 * @date 2020-10-03
 */
@Service
public class PpJmrStudentServiceImpl implements IPpJmrStudentService 
{
    @Autowired
    private PpJmrStudentMapper ppJmrStudentMapper;

    /**
     * 查询手动匹配
     * 
     * @param sId 手动匹配ID
     * @return 手动匹配
     */
    @Override
    public PpJmrStudent selectPpJmrStudentById(Long sId)
    {
        return ppJmrStudentMapper.selectPpJmrStudentById(sId);
    }

    /**
     * 查询手动匹配列表
     * 
     * @param ppJmrStudent 手动匹配
     * @return 手动匹配
     */
    @Override
    public List<PpJmrStudent> selectPpJmrStudentList(PpJmrStudent ppJmrStudent)
    {
        return ppJmrStudentMapper.selectPpJmrStudentList(ppJmrStudent);
    }

    /**
     * 新增手动匹配
     * 
     * @param ppJmrStudent 手动匹配
     * @return 结果
     */
    @Override
    public int insertPpJmrStudent(PpJmrStudent ppJmrStudent)
    {
        return ppJmrStudentMapper.insertPpJmrStudent(ppJmrStudent);
    }

    /**
     * 修改手动匹配
     * 
     * @param ppJmrStudent 手动匹配
     * @return 结果
     */
    @Override
    public int updatePpJmrStudent(PpJmrStudent ppJmrStudent)
    {
        return ppJmrStudentMapper.updatePpJmrStudent(ppJmrStudent);
    }

    /**
     * 删除手动匹配对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePpJmrStudentByIds(String ids)
    {
        return ppJmrStudentMapper.deletePpJmrStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除手动匹配信息
     * 
     * @param sId 手动匹配ID
     * @return 结果
     */
    @Override
    public int deletePpJmrStudentById(Long sId)
    {
        return ppJmrStudentMapper.deletePpJmrStudentById(sId);
    }
}
