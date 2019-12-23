package com.ruoyi.system.service;

import com.ruoyi.system.domain.HealthMonitor;
import java.util.List;

/**
 * 健康监测Service接口
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
public interface IHealthMonitorService 
{
    /**
     * 查询健康监测
     * 
     * @param healthMonitorId 健康监测ID
     * @return 健康监测
     */
    public HealthMonitor selectHealthMonitorById(Long healthMonitorId);

    /**
     * 查询健康监测列表
     * 
     * @param healthMonitor 健康监测
     * @return 健康监测集合
     */
    public List<HealthMonitor> selectHealthMonitorList(HealthMonitor healthMonitor);

    /**
     * 新增健康监测
     * 
     * @param healthMonitor 健康监测
     * @return 结果
     */
    public int insertHealthMonitor(HealthMonitor healthMonitor);

    /**
     * 修改健康监测
     * 
     * @param healthMonitor 健康监测
     * @return 结果
     */
    public int updateHealthMonitor(HealthMonitor healthMonitor);

    /**
     * 批量删除健康监测
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteHealthMonitorByIds(String ids);

    /**
     * 删除健康监测信息
     * 
     * @param healthMonitorId 健康监测ID
     * @return 结果
     */
    public int deleteHealthMonitorById(Long healthMonitorId);
}
