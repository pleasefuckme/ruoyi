package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.PointTree2;
import com.ruoyi.system.service.IPointTree2Service;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 点位树Controller
 *
 * @author SuperStarF
 * @date 2019-12-18
 */
@Controller
@RequestMapping("/system/tree2")
public class PointTree2Controller extends BaseController {
    private String prefix = "system/tree2";

    @Autowired
    private IPointTree2Service pointTree2Service;

    @RequiresPermissions("system:tree2:view")
    @GetMapping()
    public String tree2() {
        return prefix + "/tree2";
    }

    /**
     * 查询点位树树列表
     */
    @RequiresPermissions("system:tree2:list")
    @PostMapping("/list2")
    @ResponseBody
    public List<PointTree2> list() {
        List<PointTree2> list = pointTree2Service.selectPointTree2List(null);
        ArrayList<PointTree2> list2 = new ArrayList<>();
        String ancestors=null;
        for (PointTree2 pointTree2 : list) {
            ancestors = pointTree2.getAncestors();
            int n = ancestors.length() - ancestors.replaceAll(",", "").length();
            if (n<=2){
                list2.add(pointTree2);
            }
        }

        return list2;
    }

    /**
     * 查询点位树树列表
     */
    @RequiresPermissions("system:tree2:list")
    @PostMapping("/list")
    @ResponseBody
    public List<PointTree2> list(PointTree2 pointTree2) {
        List<PointTree2> list = pointTree2Service.selectPointTree2List(pointTree2);
        return list;
    }

    /**
     * 导出点位树列表
     */
    @RequiresPermissions("system:tree2:export")
    @Log(title = "点位树", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PointTree2 pointTree2) {
        List<PointTree2> list = pointTree2Service.selectPointTree2List(pointTree2);
        ExcelUtil<PointTree2> util = new ExcelUtil<PointTree2>(PointTree2.class);
        return util.exportExcel(list, "tree2");
    }

    /**
     * 新增点位树
     */
    @GetMapping(value = {"/add/{pointTreeId}", "/add/"})
    public String add(@PathVariable(value = "pointTreeId", required = false) Long pointTreeId, ModelMap mmap) {
        if (StringUtils.isNotNull(pointTreeId)) {
            mmap.put("pointTree2", pointTree2Service.selectPointTree2ById(pointTreeId));
        }
        return prefix + "/add";
    }

    /**
     * 新增保存点位树
     */
    @RequiresPermissions("system:tree2:add")
    @Log(title = "点位树", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PointTree2 pointTree2) {
        return toAjax(pointTree2Service.insertPointTree2(pointTree2));
    }

    /**
     * 修改点位树
     */
    @GetMapping("/edit/{pointTreeId}")
    public String edit(@PathVariable("pointTreeId") Long pointTreeId, ModelMap mmap) {
        PointTree2 pointTree2 = pointTree2Service.selectPointTree2ById(pointTreeId);
        mmap.put("pointTree2", pointTree2);
        return prefix + "/edit";
    }

    /**
     * 修改保存点位树
     */
    @RequiresPermissions("system:tree2:edit")
    @Log(title = "点位树", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PointTree2 pointTree2) {
        return toAjax(pointTree2Service.updatePointTree2(pointTree2));
    }

    /**
     * 删除
     */
    @RequiresPermissions("system:tree2:remove")
    @Log(title = "点位树", businessType = BusinessType.DELETE)
    @GetMapping("/remove/{pointTreeId}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("pointTreeId") Long pointTreeId) {
        return toAjax(pointTree2Service.deletePointTree2ById(pointTreeId));
    }

    /**
     * 选择点位树树
     */
    @GetMapping(value = {"/selectTree2Tree/{pointTreeId}", "/selectTree2Tree/"})
    public String selectTree2Tree(@PathVariable(value = "pointTreeId", required = false) Long pointTreeId, ModelMap mmap) {
        if (StringUtils.isNotNull(pointTreeId)) {
            mmap.put("pointTree2", pointTree2Service.selectPointTree2ById(pointTreeId));
        }
        return prefix + "/tree";
    }

    /**
     * 加载点位树树列表
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Ztree> treeData() {
        List<Ztree> ztrees = pointTree2Service.selectPointTree2Tree();
        return ztrees;
    }
}
