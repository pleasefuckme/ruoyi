package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.PointTreeDetailVo;
import com.ruoyi.system.domain.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PointDetailsMapper;
import com.ruoyi.system.domain.PointDetails;
import com.ruoyi.system.service.IPointDetailsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 点位详情Service业务层处理
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
@Service
public class PointDetailsServiceImpl implements IPointDetailsService 
{
    @Autowired
    private PointDetailsMapper pointDetailsMapper;

    /**
     * 信息浏览之树表信息
     * 
     * @return 点位详情
     */
    @Override
    public List<PointTreeDetailVo> selectPointTreeDetail()
    {
        return pointDetailsMapper.selectPointTreeDetail();
    }
    /**
     * 查询点位详情
     *
     * @param pointDetailsId 点位详情ID
     * @return 点位详情
     */
    @Override
    public PointDetails selectPointDetailsById(Long pointDetailsId)
    {
        return pointDetailsMapper.selectPointDetailsById(pointDetailsId);
    }

    /**
     * 查询点位详情列表
     * 
     * @param pointDetails 点位详情
     * @return 点位详情
     */
    @Override
    public List<QueryVo> selectPointDetailsList(PointDetails pointDetails)
    {
        return pointDetailsMapper.selectPointDetailsList(pointDetails);
    }

    /**
     * 新增点位详情
     * 
     * @param pointDetails 点位详情
     * @return 结果
     */
    @Override
    public int insertPointDetails(PointDetails pointDetails)
    {
        return pointDetailsMapper.insertPointDetails(pointDetails);
    }

    /**
     * 修改点位详情
     * 
     * @param pointDetails 点位详情
     * @return 结果
     */
    @Override
    public int updatePointDetails(PointDetails pointDetails)
    {
        return pointDetailsMapper.updatePointDetails(pointDetails);
    }

    /**
     * 删除点位详情对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePointDetailsByIds(String ids)
    {
        return pointDetailsMapper.deletePointDetailsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除点位详情信息
     * 
     * @param pointDetailsId 点位详情ID
     * @return 结果
     */
    public int deletePointDetailsById(Long pointDetailsId)
    {
        return pointDetailsMapper.deletePointDetailsById(pointDetailsId);
    }
}
