package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.PointDetails;
import com.ruoyi.system.domain.PointTree2;
import com.ruoyi.system.domain.PointTreeDetailVo;
import com.ruoyi.system.domain.QueryVo;
import com.ruoyi.system.service.IPointDetailsService;
import com.ruoyi.system.service.IPointTree2Service;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 点位详情Controller
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
@Controller
@RequestMapping("/system/details")
public class PointDetailsController extends BaseController
{
    private String prefix = "system/details";
    @Autowired
    private IPointTree2Service pointTree2Service;
    @Autowired
    private IPointDetailsService pointDetailsService;

    @RequiresPermissions("system:details:view")
    @GetMapping()
    public String details(ModelMap mmp)
    {
        List<PointTree2> pointTree2List = pointTree2Service.selectLeaf();
        mmp.put("pointTree2List", pointTree2List);
        return prefix + "/details";
    }

        /**
     * 信息浏览之树表信息
     */
    @RequiresPermissions("system:details:list")
    @PostMapping("/list2")
    @ResponseBody
    public List<PointTreeDetailVo> list()
    {
//        startPage();
        List<PointTreeDetailVo> list = pointDetailsService.selectPointTreeDetail();
//        System.err.println(pointDetails);
//        return getDataTable(list);
        return list;
    }
        /**
     * 查询点位详情列表
     */
    @RequiresPermissions("system:details:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PointDetails pointDetails)
    {
        startPage();
        List<QueryVo> list = pointDetailsService.selectPointDetailsList(pointDetails);
        System.err.println(pointDetails);
        return getDataTable(list);
    }

    /**
     * 导出点位详情列表
     */
    @RequiresPermissions("system:details:export")
    @Log(title = "点位详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PointDetails pointDetails)
    {
        List<QueryVo> list = pointDetailsService.selectPointDetailsList(pointDetails);
        ExcelUtil<QueryVo> util = new ExcelUtil<QueryVo>(QueryVo.class);
        return util.exportExcel(list, "details");
    }

    /**
     * 新增点位详情
     */
    @GetMapping("/add")
    public String add(ModelMap mmp)
    {
        List<PointTree2> pointTree2List = pointTree2Service.selectLeaf();
        mmp.put("pointTree2List", pointTree2List);
        return prefix + "/add";
    }

    /**
     * 新增保存点位详情
     */
    @RequiresPermissions("system:details:add")
    @Log(title = "点位详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PointDetails pointDetails)
    {
        return toAjax(pointDetailsService.insertPointDetails(pointDetails));
    }

    /**
     * 修改点位详情
     */
    @GetMapping("/edit/{pointDetailsId}")
    public String edit(@PathVariable("pointDetailsId") Long pointDetailsId, ModelMap mmap)
    {
        PointDetails pointDetails = pointDetailsService.selectPointDetailsById(pointDetailsId);
        mmap.put("pointDetails", pointDetails);
        List<PointTree2> pointTree2List = pointTree2Service.selectLeaf();
        mmap.put("pointTree2List", pointTree2List);
        return prefix + "/edit";
    }

    /**
     * 修改保存点位详情
     */
    @RequiresPermissions("system:details:edit")
    @Log(title = "点位详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PointDetails pointDetails)
    {
        return toAjax(pointDetailsService.updatePointDetails(pointDetails));
    }

    /**
     * 删除点位详情
     */
    @RequiresPermissions("system:details:remove")
    @Log(title = "点位详情", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(pointDetailsService.deletePointDetailsByIds(ids));
    }
}
