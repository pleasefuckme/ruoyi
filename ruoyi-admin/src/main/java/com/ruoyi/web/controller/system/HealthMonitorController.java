package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.system.domain.PointTree2;
import com.ruoyi.system.service.IPointTree2Service;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.HealthMonitor;
import com.ruoyi.system.service.IHealthMonitorService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 健康监测Controller
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
@Controller
@RequestMapping("/system/monitor")
public class HealthMonitorController extends BaseController
{
    private String prefix = "system/monitor";

    @Autowired
    private IHealthMonitorService healthMonitorService;
    @Autowired
    private IPointTree2Service pointTree2Service;

    @RequiresPermissions("system:monitor:view")
    @GetMapping()
    public String monitor(ModelMap mmp)
    {
        List<PointTree2> pointTree2List = pointTree2Service.selectLeaf();
        mmp.put("pointTree2List", pointTree2List);
        return prefix + "/monitor";
    }

        /**
     * 查询健康监测列表
     */
    @RequiresPermissions("system:monitor:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(HealthMonitor healthMonitor)
    {
        startPage();
        List<HealthMonitor> list = healthMonitorService.selectHealthMonitorList(healthMonitor);
        return getDataTable(list);
    }
    
    /**
     * 导出健康监测列表
     */
    @RequiresPermissions("system:monitor:export")
    @Log(title = "健康监测", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HealthMonitor healthMonitor)
    {
        List<HealthMonitor> list = healthMonitorService.selectHealthMonitorList(healthMonitor);
        ExcelUtil<HealthMonitor> util = new ExcelUtil<HealthMonitor>(HealthMonitor.class);
        return util.exportExcel(list, "monitor");
    }

    /**
     * 新增健康监测
     */
    @GetMapping("/add")
    public String add(ModelMap mmp)
    {
        List<PointTree2> pointTree2List = pointTree2Service.selectLeaf();
        mmp.put("pointTree2List", pointTree2List);
        return prefix + "/add";
    }

    /**
     * 新增保存健康监测
     */
    @RequiresPermissions("system:monitor:add")
    @Log(title = "健康监测", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(HealthMonitor healthMonitor)
    {

        return toAjax(healthMonitorService.insertHealthMonitor(healthMonitor));
    }

    /**
     * 修改健康监测
     */
    @GetMapping("/edit/{healthMonitorId}")
    public String edit(@PathVariable("healthMonitorId") Long healthMonitorId, ModelMap mmap)
    {
        HealthMonitor healthMonitor = healthMonitorService.selectHealthMonitorById(healthMonitorId);
        mmap.put("healthMonitor", healthMonitor);
        List<PointTree2> pointTree2List = pointTree2Service.selectLeaf();
        mmap.put("pointTree2List", pointTree2List);
        return prefix + "/edit";
    }

    /**
     * 修改保存健康监测
     */
    @RequiresPermissions("system:monitor:edit")
    @Log(title = "健康监测", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(HealthMonitor healthMonitor)
    {
        return toAjax(healthMonitorService.updateHealthMonitor(healthMonitor));
    }

    /**
     * 删除健康监测
     */
    @RequiresPermissions("system:monitor:remove")
    @Log(title = "健康监测", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(healthMonitorService.deleteHealthMonitorByIds(ids));
    }
}
