package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.HealthMonitor;
import java.util.List;

/**
 * 健康监测Mapper接口
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
public interface HealthMonitorMapper 
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
     * 删除健康监测
     * 
     * @param healthMonitorId 健康监测ID
     * @return 结果
     */
    public int deleteHealthMonitorById(Long healthMonitorId);

    /**
     * 批量删除健康监测
     * 
     * @param healthMonitorIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHealthMonitorByIds(String[] healthMonitorIds);
}
