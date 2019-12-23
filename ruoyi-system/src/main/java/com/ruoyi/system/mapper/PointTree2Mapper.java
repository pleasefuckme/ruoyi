package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.PointTree2;
import java.util.List;

/**
 * 点位树Mapper接口
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
public interface PointTree2Mapper 
{
    /**
     * 查询点位树
     * 
     * @param pointTreeId 点位树ID
     * @return 点位树
     */
    public PointTree2 selectPointTree2ById(Long pointTreeId);

    /**
     * 查询叶子节点
     *
     * @return 点位树
     */
    public List<PointTree2> selectLeaf();

    /**
     * 查询点位树列表
     * 
     * @param pointTree2 点位树
     * @return 点位树集合
     */
    public List<PointTree2> selectPointTree2List(PointTree2 pointTree2);

    /**
     * 新增点位树
     * 
     * @param pointTree2 点位树
     * @return 结果
     */
    public int insertPointTree2(PointTree2 pointTree2);

    /**
     * 修改点位树
     * 
     * @param pointTree2 点位树
     * @return 结果
     */
    public int updatePointTree2(PointTree2 pointTree2);

    /**
     * 删除点位树
     * 
     * @param pointTreeId 点位树ID
     * @return 结果
     */
    public int deletePointTree2ById(Long pointTreeId);

    /**
     * 批量删除点位树
     * 
     * @param pointTreeIds 需要删除的数据ID
     * @return 结果
     */
    public int deletePointTree2ByIds(String[] pointTreeIds);
}
