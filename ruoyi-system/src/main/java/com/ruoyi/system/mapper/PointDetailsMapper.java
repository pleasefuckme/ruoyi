package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.PointDetails;
import com.ruoyi.system.domain.PointTreeDetailVo;
import com.ruoyi.system.domain.QueryVo;

import java.util.List;

/**
 * 点位详情Mapper接口
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
public interface PointDetailsMapper 
{
    /**
     * 信息浏览之树表信息(手写)
     *
     * @return
     */
    public List<PointTreeDetailVo> selectPointTreeDetail();

    /**
     * 查询点位详情
     * 
     * @param pointDetailsId 点位详情ID
     * @return 点位详情
     */
    public PointDetails selectPointDetailsById(Long pointDetailsId);

    /**
     * 查询点位详情列表
     * 
     * @param pointDetails 点位详情
     * @return 点位详情集合
     */
    public List<QueryVo> selectPointDetailsList(PointDetails pointDetails);

    /**
     * 新增点位详情
     * 
     * @param pointDetails 点位详情
     * @return 结果
     */
    public int insertPointDetails(PointDetails pointDetails);

    /**
     * 修改点位详情
     * 
     * @param pointDetails 点位详情
     * @return 结果
     */
    public int updatePointDetails(PointDetails pointDetails);

    /**
     * 删除点位详情
     * 
     * @param pointDetailsId 点位详情ID
     * @return 结果
     */
    public int deletePointDetailsById(Long pointDetailsId);

    /**
     * 批量删除点位详情
     * 
     * @param pointDetailsIds 需要删除的数据ID
     * @return 结果
     */
    public int deletePointDetailsByIds(String[] pointDetailsIds);
}
