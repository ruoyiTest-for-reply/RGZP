package com.ruoyi.statistic.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学生匹配信息统计对象 jmr_job_match_result
 *
 * @author LiangLiang
 * @date 2020-09-30
 */
public class TjJmrJobMatchResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 匹配岗位结果id */
    private Long jmrId;

    /** 学生id */
    @Excel(name = "学生id")
    private Long jmrSId;

    /** 企业id */
    @Excel(name = "企业id")
    private Long jmrCId;

    /** 岗位id */
    @Excel(name = "岗位id")
    private Long jmrJId;

    /** 匹配数据表id */
    @Excel(name = "匹配数据表id")
    private Long jmrBId;

    /** 匹配数值 */
    @Excel(name = "匹配数值")
    private Long jmrValue;

    private TjJmrBase tjJmrBase;
    private TjJmrCompany tjJmrCompany;
    private TjJmrJob tjJmrJob;
    private TjJmrStudent tjJmrStudent;
    private TjJmrPosition tjJmrPosition;

    public TjJmrPosition getTjJmrPosition() {
        return tjJmrPosition;
    }

    public void setTjJmrPosition(TjJmrPosition tjJmrPosition) {
        this.tjJmrPosition = tjJmrPosition;
    }

    public TjJmrBase getTjJmrBase() {
        return tjJmrBase;
    }

    public void setTjJmrBase(TjJmrBase tjJmrBase) {
        this.tjJmrBase = tjJmrBase;
    }

    public TjJmrCompany getTjJmrCompany() {
        return tjJmrCompany;
    }

    public void setTjJmrCompany(TjJmrCompany tjJmrCompany) {
        this.tjJmrCompany = tjJmrCompany;
    }

    public TjJmrJob getTjJmrJob() {
        return tjJmrJob;
    }

    public void setTjJmrJob(TjJmrJob tjJmrJob) {
        this.tjJmrJob = tjJmrJob;
    }

    public TjJmrStudent getTjJmrStudent() {
        return tjJmrStudent;
    }

    public void setTjJmrStudent(TjJmrStudent tjJmrStudent) {
        this.tjJmrStudent = tjJmrStudent;
    }

    public void setJmrId(Long jmrId)
    {
        this.jmrId = jmrId;
    }

    public Long getJmrId()
    {
        return jmrId;
    }
    public void setJmrSId(Long jmrSId)
    {
        this.jmrSId = jmrSId;
    }

    public Long getJmrSId()
    {
        return jmrSId;
    }
    public void setJmrCId(Long jmrCId)
    {
        this.jmrCId = jmrCId;
    }

    public Long getJmrCId()
    {
        return jmrCId;
    }
    public void setJmrJId(Long jmrJId)
    {
        this.jmrJId = jmrJId;
    }

    public Long getJmrJId()
    {
        return jmrJId;
    }
    public void setJmrBId(Long jmrBId)
    {
        this.jmrBId = jmrBId;
    }

    public Long getJmrBId()
    {
        return jmrBId;
    }
    public void setJmrValue(Long jmrValue)
    {
        this.jmrValue = jmrValue;
    }

    public Long getJmrValue()
    {
        return jmrValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("jmrId", getJmrId())
                .append("jmrSId", getJmrSId())
                .append("jmrCId", getJmrCId())
                .append("jmrJId", getJmrJId())
                .append("jmrBId", getJmrBId())
                .append("jmrValue", getJmrValue())
                .toString();
    }
}