package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 视频文档对象 video_doc
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
public class VideoDoc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long videoDocId;

    /** 点位树id */
    @Excel(name = "点位树id")
    private Long pointTreeId;

    /** 文件类型 */
    @Excel(name = "文件类型")
    private String fileType;

    /** 文件上传 */
    @Excel(name = "文件上传")
    private String fileUpload;

        public void setVideoDocId(Long videoDocId)
    {
        this.videoDocId = videoDocId;
    }

    public Long getVideoDocId() 
    {
        return videoDocId;
    }
        public void setPointTreeId(Long pointTreeId)
    {
        this.pointTreeId = pointTreeId;
    }

    public Long getPointTreeId() 
    {
        return pointTreeId;
    }
        public void setFileType(String fileType)
    {
        this.fileType = fileType;
    }

    public String getFileType() 
    {
        return fileType;
    }
        public void setFileUpload(String fileUpload)
    {
        this.fileUpload = fileUpload;
    }

    public String getFileUpload() 
    {
        return fileUpload;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
        
        .append("videoDocId", getVideoDocId())
        
        .append("pointTreeId", getPointTreeId())
        
        .append("fileType", getFileType())
        
        .append("fileUpload", getFileUpload())
        
        .append("remark", getRemark())
            .toString();
    }
}
