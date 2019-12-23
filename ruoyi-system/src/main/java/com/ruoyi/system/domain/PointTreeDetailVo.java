package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PointTreeDetailVo {
    private static final long serialVersionUID = 1L;

    /** id */
    private Long pointTreeId;

    /** 父节点 */
    @Excel(name = "父节点")
    private Long parentId;

    /** 点位名称 */
    @Excel(name = "点位名称")
    private String pointName;

    /** id */
    private Long pointDetailsId;

    /** 点位树id */
    @Excel(name = "点位")
    private String point;

    public Long getPointTreeId() {
        return pointTreeId;
    }

    public void setPointTreeId(Long pointTreeId) {
        this.pointTreeId = pointTreeId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public Long getPointDetailsId() {
        return pointDetailsId;
    }

    public void setPointDetailsId(Long pointDetailsId) {
        this.pointDetailsId = pointDetailsId;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)

                .append("pointTreeId", getPointTreeId())

                .append("parentId", getParentId())

                .append("pointName", getPointName())

                .append("pointDetailsId", getPointDetailsId())

                .append("point", getPoint()).toString();
    }
}
