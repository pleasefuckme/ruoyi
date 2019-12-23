package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

/**
 * 点位树对象 point_tree2
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
public class PointTree2 extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long pointTreeId;

    /** 父节点 */
    @Excel(name = "父节点")
    private Long parentId;

    /** 祖级列表 */
    @Excel(name = "祖级列表")
    private String ancestors;

    /** 点位名称 */
    @Excel(name = "点位名称")
    private String pointName;

        public void setPointTreeId(Long pointTreeId)
    {
        this.pointTreeId = pointTreeId;
    }

    public Long getPointTreeId() 
    {
        return pointTreeId;
    }
        public void setParentId(Long parentId)
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
        public void setAncestors(String ancestors)
    {
        this.ancestors = ancestors;
    }

    public String getAncestors() 
    {
        return ancestors;
    }
        public void setPointName(String pointName)
    {
        this.pointName = pointName;
    }

    public String getPointName() 
    {
        return pointName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
        
        .append("pointTreeId", getPointTreeId())
        
        .append("parentId", getParentId())
        
        .append("ancestors", getAncestors())
        
        .append("pointName", getPointName())
            .toString();
    }
}
