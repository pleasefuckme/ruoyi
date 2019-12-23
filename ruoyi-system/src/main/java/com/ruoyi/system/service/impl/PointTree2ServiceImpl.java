package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.ArrayList;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.system.domain.SysDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PointTree2Mapper;
import com.ruoyi.system.domain.PointTree2;
import com.ruoyi.system.service.IPointTree2Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 点位树Service业务层处理
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
@Service
public class PointTree2ServiceImpl implements IPointTree2Service 
{
    @Autowired
    private PointTree2Mapper pointTree2Mapper;

    /**
     * 查询点位树
     * 
     * @param pointTreeId 点位树ID
     * @return 点位树
     */
    @Override
    public PointTree2 selectPointTree2ById(Long pointTreeId)
    {
        return pointTree2Mapper.selectPointTree2ById(pointTreeId);
    }
    /**
     * 查询叶子节点
     *
     * @return 点位树
     */
    @Override
    public List<PointTree2> selectLeaf()
    {
        return pointTree2Mapper.selectLeaf();
    }

    /**
     * 查询点位树列表
     * 
     * @param pointTree2 点位树
     * @return 点位树
     */
    @Override
    public List<PointTree2> selectPointTree2List(PointTree2 pointTree2)
    {
        return pointTree2Mapper.selectPointTree2List(pointTree2);
    }

    /**
     * 新增点位树
     * 
     * @param pointTree2 点位树
     * @return 结果
     */
    @Override
    public int insertPointTree2(PointTree2 pointTree2)
    {
        PointTree2 info = pointTree2Mapper.selectPointTree2ById(pointTree2.getParentId());

        pointTree2.setAncestors(info.getAncestors() + "," + pointTree2.getParentId());
        return pointTree2Mapper.insertPointTree2(pointTree2);
    }

    /**
     * 修改点位树
     * 
     * @param pointTree2 点位树
     * @return 结果
     */
    @Override
    public int updatePointTree2(PointTree2 pointTree2)
    {
        return pointTree2Mapper.updatePointTree2(pointTree2);
    }

    /**
     * 删除点位树对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePointTree2ByIds(String ids)
    {
        return pointTree2Mapper.deletePointTree2ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除点位树信息
     * 
     * @param pointTreeId 点位树ID
     * @return 结果
     */
    public int deletePointTree2ById(Long pointTreeId)
    {
        return pointTree2Mapper.deletePointTree2ById(pointTreeId);
    }

    /**
     * 查询点位树树列表
     * 
     * @return 所有点位树信息
     */
    @Override
    public List<Ztree> selectPointTree2Tree()
    {
        List<PointTree2> pointTree2List = pointTree2Mapper.selectPointTree2List(new PointTree2());
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for (PointTree2 pointTree2 : pointTree2List)
        {
            Ztree ztree = new Ztree();
            ztree.setId(pointTree2.getPointTreeId());
            ztree.setpId(pointTree2.getParentId());
            ztree.setName(pointTree2.getPointName());
            ztree.setTitle(pointTree2.getPointName());
            ztrees.add(ztree);
        }
        return ztrees;
    }
}
