package com.ruoyi.job.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 匹配信息查询对象 jmr_student_match_result
 * 
 * @author liangliang
 * @date 2020-10-02
 */
public class JmrRyStudentMatchResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 简历匹配结果id */
    private Long smrId;

    /** 企业id */
    @Excel(name = "企业id")
    private Long smrCId;

    /** 岗位id */
    @Excel(name = "岗位id")
    private Long smrJId;

    /** 学生id */
    @Excel(name = "学生id")
    private Long smrSId;

    /** 简历id */
    @Excel(name = "简历id")
    private Long smrRId;

    /** 匹配数据表id */
    @Excel(name = "匹配数据表id")
    private Long smrBId;

    /** 匹配数值 */
    @Excel(name = "匹配数值")
    private Long smrValue;

    public void setSmrId(Long smrId) 
    {
        this.smrId = smrId;
    }

    public Long getSmrId() 
    {
        return smrId;
    }
    public void setSmrCId(Long smrCId) 
    {
        this.smrCId = smrCId;
    }

    public Long getSmrCId() 
    {
        return smrCId;
    }
    public void setSmrJId(Long smrJId) 
    {
        this.smrJId = smrJId;
    }

    public Long getSmrJId() 
    {
        return smrJId;
    }
    public void setSmrSId(Long smrSId) 
    {
        this.smrSId = smrSId;
    }

    public Long getSmrSId() 
    {
        return smrSId;
    }
    public void setSmrRId(Long smrRId) 
    {
        this.smrRId = smrRId;
    }

    public Long getSmrRId() 
    {
        return smrRId;
    }
    public void setSmrBId(Long smrBId) 
    {
        this.smrBId = smrBId;
    }

    public Long getSmrBId() 
    {
        return smrBId;
    }
    public void setSmrValue(Long smrValue) 
    {
        this.smrValue = smrValue;
    }

    public Long getSmrValue() 
    {
        return smrValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("smrId", getSmrId())
            .append("smrCId", getSmrCId())
            .append("smrJId", getSmrJId())
            .append("smrSId", getSmrSId())
            .append("smrRId", getSmrRId())
            .append("smrBId", getSmrBId())
            .append("smrValue", getSmrValue())
            .toString();
    }
}
