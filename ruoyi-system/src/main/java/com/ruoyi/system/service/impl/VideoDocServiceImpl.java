package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VideoDocMapper;
import com.ruoyi.system.domain.VideoDoc;
import com.ruoyi.system.service.IVideoDocService;
import com.ruoyi.common.core.text.Convert;

/**
 * 视频文档Service业务层处理
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
@Service
public class VideoDocServiceImpl implements IVideoDocService 
{
    @Autowired
    private VideoDocMapper videoDocMapper;

    /**
     * 查询视频文档
     * 
     * @param videoDocId 视频文档ID
     * @return 视频文档
     */
    @Override
    public VideoDoc selectVideoDocById(Long videoDocId)
    {
        return videoDocMapper.selectVideoDocById(videoDocId);
    }

    /**
     * 查询视频文档列表
     * 
     * @param videoDoc 视频文档
     * @return 视频文档
     */
    @Override
    public List<VideoDoc> selectVideoDocList(VideoDoc videoDoc)
    {
        return videoDocMapper.selectVideoDocList(videoDoc);
    }

    /**
     * 新增视频文档
     * 
     * @param videoDoc 视频文档
     * @return 结果
     */
    @Override
    public int insertVideoDoc(VideoDoc videoDoc)
    {
        return videoDocMapper.insertVideoDoc(videoDoc);
    }

    /**
     * 修改视频文档
     * 
     * @param videoDoc 视频文档
     * @return 结果
     */
    @Override
    public int updateVideoDoc(VideoDoc videoDoc)
    {
        return videoDocMapper.updateVideoDoc(videoDoc);
    }

    /**
     * 删除视频文档对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteVideoDocByIds(String ids)
    {
        return videoDocMapper.deleteVideoDocByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除视频文档信息
     * 
     * @param videoDocId 视频文档ID
     * @return 结果
     */
    public int deleteVideoDocById(Long videoDocId)
    {
        return videoDocMapper.deleteVideoDocById(videoDocId);
    }
}
