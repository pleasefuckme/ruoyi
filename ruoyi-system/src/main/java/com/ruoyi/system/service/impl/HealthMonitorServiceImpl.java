package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.HealthMonitorMapper;
import com.ruoyi.system.domain.HealthMonitor;
import com.ruoyi.system.service.IHealthMonitorService;
import com.ruoyi.common.core.text.Convert;

/**
 * 健康监测Service业务层处理
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
@Service
public class HealthMonitorServiceImpl implements IHealthMonitorService 
{
    @Autowired
    private HealthMonitorMapper healthMonitorMapper;

    /**
     * 查询健康监测
     * 
     * @param healthMonitorId 健康监测ID
     * @return 健康监测
     */
    @Override
    public HealthMonitor selectHealthMonitorById(Long healthMonitorId)
    {
        return healthMonitorMapper.selectHealthMonitorById(healthMonitorId);
    }

    /**
     * 查询健康监测列表
     * 
     * @param healthMonitor 健康监测
     * @return 健康监测
     */
    @Override
    public List<HealthMonitor> selectHealthMonitorList(HealthMonitor healthMonitor)
    {
        return healthMonitorMapper.selectHealthMonitorList(healthMonitor);
    }

    /**
     * 新增健康监测
     * 
     * @param healthMonitor 健康监测
     * @return 结果
     */
    @Override
    public int insertHealthMonitor(HealthMonitor healthMonitor)
    {
        return healthMonitorMapper.insertHealthMonitor(healthMonitor);
    }

    /**
     * 修改健康监测
     * 
     * @param healthMonitor 健康监测
     * @return 结果
     */
    @Override
    public int updateHealthMonitor(HealthMonitor healthMonitor)
    {
        return healthMonitorMapper.updateHealthMonitor(healthMonitor);
    }

    /**
     * 删除健康监测对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteHealthMonitorByIds(String ids)
    {
        return healthMonitorMapper.deleteHealthMonitorByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除健康监测信息
     * 
     * @param healthMonitorId 健康监测ID
     * @return 结果
     */
    public int deleteHealthMonitorById(Long healthMonitorId)
    {
        return healthMonitorMapper.deleteHealthMonitorById(healthMonitorId);
    }
}
