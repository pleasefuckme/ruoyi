package com.ruoyi.system.service;

import com.ruoyi.system.domain.PointTree2;
import java.util.List;
import com.ruoyi.common.core.domain.Ztree;

/**
 * 点位树Service接口
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
public interface IPointTree2Service 
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
     * 批量删除点位树
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePointTree2ByIds(String ids);

    /**
     * 删除点位树信息
     * 
     * @param pointTreeId 点位树ID
     * @return 结果
     */
    public int deletePointTree2ById(Long pointTreeId);

    /**
     * 查询点位树树列表
     * 
     * @return 所有点位树信息
     */
    public List<Ztree> selectPointTree2Tree();
}
