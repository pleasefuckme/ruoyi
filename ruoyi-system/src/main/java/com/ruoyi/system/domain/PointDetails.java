package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 点位详情对象 point_details
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
public class PointDetails extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long pointDetailsId;

    /** 点位树id */
    @Excel(name = "点位树")
    private Long pointTreeId;

    /** 点位树id */
    @Excel(name = "点位")
    private String point;

    /** 井盖尺寸 */
    @Excel(name = "井盖尺寸")
    private Long capSize;

    /** 图上点号 */
    @Excel(name = "图上点号")
    private String imgNum;

    /** 井盖材质 */
    @Excel(name = "井盖材质")
    private String capMaterial;

    /** 图幅号 */
    @Excel(name = "图幅号")
    private String sheetNum;

    /** 井材质 */
    @Excel(name = "井材质")
    private String wellMaterial;

    /** 特征 */
    @Excel(name = "特征")
    private String feature;

    /** 井深 */
    @Excel(name = "井深")
    private String wellDepth;

    /** 附属物 */
    @Excel(name = "附属物")
    private String appendages;

    /** 井尺寸 */
    @Excel(name = "井尺寸")
    private String wellSize;

    /** 地面高度 */
    @Excel(name = "地面高度")
    private Long groundHeight;

    /** 所在街道 */
    @Excel(name = "所在街道")
    private String street;

    /** 要素编码 */
    @Excel(name = "要素编码")
    private String elementCode;

    /** 埋没年代 */
    @Excel(name = "埋没年代")
    private String lostYear;

    /** x坐标 */
    @Excel(name = "x坐标")
    private String xIntercept;

    /** y坐标 */
    @Excel(name = "y坐标")
    private String yIntercept;

    /** 探测日期 */
    @Excel(name = "探测日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date probeDate;

    /** 符号角度 */
    @Excel(name = "符号角度")
    private String symbolicAngle;

    /** 探测单位 */
    @Excel(name = "探测单位")
    private String probeUnit;

    /** 井底深 */
    @Excel(name = "井底深")
    private String wellBottomDepth;

    /** 监测单位 */
    @Excel(name = "监测单位")
    private String monitoringUnit;

    /** 偏心井位 */
    @Excel(name = "偏心井位")
    private String deviateCenterWellLocation;

    /** 状态 */
    @Excel(name = "状态")
    private String state;

    /** 井盖形状 */
    @Excel(name = "井盖形状")
    private String capShape;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    /** 设计图 */
    @Excel(name = "设计图")
    private String designImg;

        public void setPointDetailsId(Long pointDetailsId)
    {
        this.pointDetailsId = pointDetailsId;
    }

    public Long getPointDetailsId() 
    {
        return pointDetailsId;
    }
        public void setPointTreeId(Long pointTreeId)
    {
        this.pointTreeId = pointTreeId;
    }

    public String getPoint()
    {
        return point;
    }
        public void setPoint(String point)
    {
        this.point = point;
    }

    public Long getPointTreeId()
    {
        return pointTreeId;
    }
        public void setCapSize(Long capSize)
    {
        this.capSize = capSize;
    }

    public Long getCapSize() 
    {
        return capSize;
    }
        public void setImgNum(String imgNum)
    {
        this.imgNum = imgNum;
    }

    public String getImgNum() 
    {
        return imgNum;
    }
        public void setCapMaterial(String capMaterial)
    {
        this.capMaterial = capMaterial;
    }

    public String getCapMaterial() 
    {
        return capMaterial;
    }
        public void setSheetNum(String sheetNum)
    {
        this.sheetNum = sheetNum;
    }

    public String getSheetNum() 
    {
        return sheetNum;
    }
        public void setWellMaterial(String wellMaterial)
    {
        this.wellMaterial = wellMaterial;
    }

    public String getWellMaterial() 
    {
        return wellMaterial;
    }
        public void setFeature(String feature)
    {
        this.feature = feature;
    }

    public String getFeature() 
    {
        return feature;
    }
        public void setWellDepth(String wellDepth)
    {
        this.wellDepth = wellDepth;
    }

    public String getWellDepth() 
    {
        return wellDepth;
    }
        public void setAppendages(String appendages)
    {
        this.appendages = appendages;
    }

    public String getAppendages() 
    {
        return appendages;
    }
        public void setWellSize(String wellSize)
    {
        this.wellSize = wellSize;
    }

    public String getWellSize() 
    {
        return wellSize;
    }
        public void setGroundHeight(Long groundHeight)
    {
        this.groundHeight = groundHeight;
    }

    public Long getGroundHeight() 
    {
        return groundHeight;
    }
        public void setStreet(String street)
    {
        this.street = street;
    }

    public String getStreet() 
    {
        return street;
    }
        public void setElementCode(String elementCode)
    {
        this.elementCode = elementCode;
    }

    public String getElementCode() 
    {
        return elementCode;
    }
        public void setLostYear(String lostYear)
    {
        this.lostYear = lostYear;
    }

    public String getLostYear() 
    {
        return lostYear;
    }
        public void setxIntercept(String xIntercept)
    {
        this.xIntercept = xIntercept;
    }

    public String getxIntercept() 
    {
        return xIntercept;
    }
        public void setyIntercept(String yIntercept)
    {
        this.yIntercept = yIntercept;
    }

    public String getyIntercept() 
    {
        return yIntercept;
    }
        public void setProbeDate(Date probeDate)
    {
        this.probeDate = probeDate;
    }

    public Date getProbeDate() 
    {
        return probeDate;
    }
        public void setSymbolicAngle(String symbolicAngle)
    {
        this.symbolicAngle = symbolicAngle;
    }

    public String getSymbolicAngle() 
    {
        return symbolicAngle;
    }
        public void setProbeUnit(String probeUnit)
    {
        this.probeUnit = probeUnit;
    }

    public String getProbeUnit() 
    {
        return probeUnit;
    }
        public void setWellBottomDepth(String wellBottomDepth)
    {
        this.wellBottomDepth = wellBottomDepth;
    }

    public String getWellBottomDepth() 
    {
        return wellBottomDepth;
    }
        public void setMonitoringUnit(String monitoringUnit)
    {
        this.monitoringUnit = monitoringUnit;
    }

    public String getMonitoringUnit() 
    {
        return monitoringUnit;
    }
        public void setDeviateCenterWellLocation(String deviateCenterWellLocation)
    {
        this.deviateCenterWellLocation = deviateCenterWellLocation;
    }

    public String getDeviateCenterWellLocation() 
    {
        return deviateCenterWellLocation;
    }
        public void setState(String state)
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
        public void setCapShape(String capShape)
    {
        this.capShape = capShape;
    }

    public String getCapShape() 
    {
        return capShape;
    }
        public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }
        public void setDesignImg(String designImg)
    {
        this.designImg = designImg;
    }

    public String getDesignImg() 
    {
        return designImg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
        
        .append("pointDetailsId", getPointDetailsId())
        
        .append("pointTreeId", getPointTreeId())

        .append("point", getPoint())

        .append("capSize", getCapSize())
        
        .append("imgNum", getImgNum())
        
        .append("capMaterial", getCapMaterial())
        
        .append("sheetNum", getSheetNum())
        
        .append("wellMaterial", getWellMaterial())
        
        .append("feature", getFeature())
        
        .append("wellDepth", getWellDepth())
        
        .append("appendages", getAppendages())
        
        .append("wellSize", getWellSize())
        
        .append("groundHeight", getGroundHeight())
        
        .append("street", getStreet())
        
        .append("elementCode", getElementCode())
        
        .append("lostYear", getLostYear())
        
        .append("xIntercept", getxIntercept())
        
        .append("yIntercept", getyIntercept())
        
        .append("probeDate", getProbeDate())
        
        .append("symbolicAngle", getSymbolicAngle())
        
        .append("probeUnit", getProbeUnit())
        
        .append("wellBottomDepth", getWellBottomDepth())
        
        .append("monitoringUnit", getMonitoringUnit())
        
        .append("deviateCenterWellLocation", getDeviateCenterWellLocation())
        
        .append("state", getState())
        
        .append("capShape", getCapShape())
        
        .append("remarks", getRemarks())
        
        .append("designImg", getDesignImg())
            .toString();
    }
}
