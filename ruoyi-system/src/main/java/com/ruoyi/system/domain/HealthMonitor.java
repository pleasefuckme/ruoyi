package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 健康监测对象 health_monitor
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
public class HealthMonitor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long healthMonitorId;

    /** 点位树id */
    @Excel(name = "点位树id")
    private Long pointTreeId;

    /** 管段直径 */
    @Excel(name = "管段直径")
    private String tubeDiameter;

    /** 管段长度 */
    @Excel(name = "管段长度")
    private Long tubeLength;

    /** 管段类型 */
    @Excel(name = "管段类型")
    private String tubeType;

    /** 检视 */
    @Excel(name = "检视")
    private String inspect;

    /** 爬行长度 */
    @Excel(name = "爬行长度")
    private Long crawlingLength;

    /** 管段材质 */
    @Excel(name = "管段材质")
    private String tubeMaterial;

    /** 附属设施 */
    @Excel(name = "附属设施")
    private String ancillaryFacilities;

    /** 录像文件 */
    @Excel(name = "录像文件")
    private String videoFile;

    /** 检测地点 */
    @Excel(name = "检测地点")
    private String monitoringSite;

    /** 检测人员 */
    @Excel(name = "检测人员")
    private String monitoringPersonnel;

    /** 检测日期 */
    @Excel(name = "检测日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date monitoringDate;

    /** 检测设备 */
    @Excel(name = "检测设备")
    private String monitoringEquipment;

    /** 修复指数 */
    @Excel(name = "修复指数")
    private String repairIndex;

    /** 权属单位 */
    @Excel(name = "权属单位")
    private String ownershipUnit;

    /** 养护指数 */
    @Excel(name = "养护指数")
    private String maintenanceIndex;

    /** 分值 */
    @Excel(name = "分值")
    private String pointValue;

    /** 距离 */
    @Excel(name = "距离")
    private Long distance;

    /** 缺陷名称代码 */
    @Excel(name = "缺陷名称代码")
    private String defectNameCode;

    /** 等级 */
    @Excel(name = "等级")
    private String grade;

    /** 缺陷描述 */
    @Excel(name = "缺陷描述")
    private String defectDescribe;

    /** 照片 */
    @Excel(name = "照片")
    private String img;

        public void setHealthMonitorId(Long healthMonitorId)
    {
        this.healthMonitorId = healthMonitorId;
    }

    public Long getHealthMonitorId() 
    {
        return healthMonitorId;
    }
        public void setPointTreeId(Long pointTreeId)
    {
        this.pointTreeId = pointTreeId;
    }

    public Long getPointTreeId() 
    {
        return pointTreeId;
    }
        public void setTubeDiameter(String tubeDiameter)
    {
        this.tubeDiameter = tubeDiameter;
    }

    public String getTubeDiameter() 
    {
        return tubeDiameter;
    }
        public void setTubeLength(Long tubeLength)
    {
        this.tubeLength = tubeLength;
    }

    public Long getTubeLength() 
    {
        return tubeLength;
    }
        public void setTubeType(String tubeType)
    {
        this.tubeType = tubeType;
    }

    public String getTubeType() 
    {
        return tubeType;
    }
        public void setInspect(String inspect)
    {
        this.inspect = inspect;
    }

    public String getInspect() 
    {
        return inspect;
    }
        public void setCrawlingLength(Long crawlingLength)
    {
        this.crawlingLength = crawlingLength;
    }

    public Long getCrawlingLength() 
    {
        return crawlingLength;
    }
        public void setTubeMaterial(String tubeMaterial)
    {
        this.tubeMaterial = tubeMaterial;
    }

    public String getTubeMaterial() 
    {
        return tubeMaterial;
    }
        public void setAncillaryFacilities(String ancillaryFacilities)
    {
        this.ancillaryFacilities = ancillaryFacilities;
    }

    public String getAncillaryFacilities() 
    {
        return ancillaryFacilities;
    }
        public void setVideoFile(String videoFile)
    {
        this.videoFile = videoFile;
    }

    public String getVideoFile() 
    {
        return videoFile;
    }
        public void setMonitoringSite(String monitoringSite)
    {
        this.monitoringSite = monitoringSite;
    }

    public String getMonitoringSite() 
    {
        return monitoringSite;
    }
        public void setMonitoringPersonnel(String monitoringPersonnel)
    {
        this.monitoringPersonnel = monitoringPersonnel;
    }

    public String getMonitoringPersonnel() 
    {
        return monitoringPersonnel;
    }
        public void setMonitoringDate(Date monitoringDate)
    {
        this.monitoringDate = monitoringDate;
    }

    public Date getMonitoringDate() 
    {
        return monitoringDate;
    }
        public void setMonitoringEquipment(String monitoringEquipment)
    {
        this.monitoringEquipment = monitoringEquipment;
    }

    public String getMonitoringEquipment() 
    {
        return monitoringEquipment;
    }
        public void setRepairIndex(String repairIndex)
    {
        this.repairIndex = repairIndex;
    }

    public String getRepairIndex() 
    {
        return repairIndex;
    }
        public void setOwnershipUnit(String ownershipUnit)
    {
        this.ownershipUnit = ownershipUnit;
    }

    public String getOwnershipUnit() 
    {
        return ownershipUnit;
    }
        public void setMaintenanceIndex(String maintenanceIndex)
    {
        this.maintenanceIndex = maintenanceIndex;
    }

    public String getMaintenanceIndex() 
    {
        return maintenanceIndex;
    }
        public void setPointValue(String pointValue)
    {
        this.pointValue = pointValue;
    }

    public String getPointValue() 
    {
        return pointValue;
    }
        public void setDistance(Long distance)
    {
        this.distance = distance;
    }

    public Long getDistance() 
    {
        return distance;
    }
        public void setDefectNameCode(String defectNameCode)
    {
        this.defectNameCode = defectNameCode;
    }

    public String getDefectNameCode() 
    {
        return defectNameCode;
    }
        public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }
        public void setDefectDescribe(String defectDescribe)
    {
        this.defectDescribe = defectDescribe;
    }

    public String getDefectDescribe() 
    {
        return defectDescribe;
    }
        public void setImg(String img)
    {
        this.img = img;
    }

    public String getImg() 
    {
        return img;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
        
        .append("healthMonitorId", getHealthMonitorId())
        
        .append("pointTreeId", getPointTreeId())
        
        .append("tubeDiameter", getTubeDiameter())
        
        .append("tubeLength", getTubeLength())
        
        .append("tubeType", getTubeType())
        
        .append("inspect", getInspect())
        
        .append("crawlingLength", getCrawlingLength())
        
        .append("tubeMaterial", getTubeMaterial())
        
        .append("ancillaryFacilities", getAncillaryFacilities())
        
        .append("videoFile", getVideoFile())
        
        .append("monitoringSite", getMonitoringSite())
        
        .append("monitoringPersonnel", getMonitoringPersonnel())
        
        .append("monitoringDate", getMonitoringDate())
        
        .append("monitoringEquipment", getMonitoringEquipment())
        
        .append("repairIndex", getRepairIndex())
        
        .append("ownershipUnit", getOwnershipUnit())
        
        .append("maintenanceIndex", getMaintenanceIndex())
        
        .append("pointValue", getPointValue())
        
        .append("distance", getDistance())
        
        .append("defectNameCode", getDefectNameCode())
        
        .append("grade", getGrade())
        
        .append("defectDescribe", getDefectDescribe())
        
        .append("img", getImg())
            .toString();
    }
}
