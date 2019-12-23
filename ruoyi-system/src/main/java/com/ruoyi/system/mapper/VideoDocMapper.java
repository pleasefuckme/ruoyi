package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.VideoDoc;
import java.util.List;

/**
 * 视频文档Mapper接口
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
public interface VideoDocMapper 
{
    /**
     * 查询视频文档
     * 
     * @param videoDocId 视频文档ID
     * @return 视频文档
     */
    public VideoDoc selectVideoDocById(Long videoDocId);

    /**
     * 查询视频文档列表
     * 
     * @param videoDoc 视频文档
     * @return 视频文档集合
     */
    public List<VideoDoc> selectVideoDocList(VideoDoc videoDoc);

    /**
     * 新增视频文档
     * 
     * @param videoDoc 视频文档
     * @return 结果
     */
    public int insertVideoDoc(VideoDoc videoDoc);

    /**
     * 修改视频文档
     * 
     * @param videoDoc 视频文档
     * @return 结果
     */
    public int updateVideoDoc(VideoDoc videoDoc);

    /**
     * 删除视频文档
     * 
     * @param videoDocId 视频文档ID
     * @return 结果
     */
    public int deleteVideoDocById(Long videoDocId);

    /**
     * 批量删除视频文档
     * 
     * @param videoDocIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteVideoDocByIds(String[] videoDocIds);
}
