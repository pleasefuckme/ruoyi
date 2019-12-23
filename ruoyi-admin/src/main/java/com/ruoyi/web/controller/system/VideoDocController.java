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
import com.ruoyi.system.domain.VideoDoc;
import com.ruoyi.system.service.IVideoDocService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 视频文档Controller
 * 
 * @author SuperStarF
 * @date 2019-12-18
 */
@Controller
@RequestMapping("/system/doc")
public class VideoDocController extends BaseController
{
    private String prefix = "system/doc";
    @Autowired
    private IPointTree2Service pointTree2Service;
    @Autowired
    private IVideoDocService videoDocService;

    @RequiresPermissions("system:doc:view")
    @GetMapping()
    public String doc(ModelMap mmp)
    {
        List<PointTree2> pointTree2List = pointTree2Service.selectLeaf();
        mmp.put("pointTree2List", pointTree2List);
        return prefix + "/doc";
    }

        /**
     * 查询视频文档列表
     */
    @RequiresPermissions("system:doc:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(VideoDoc videoDoc)
    {
        startPage();
        List<VideoDoc> list = videoDocService.selectVideoDocList(videoDoc);
        return getDataTable(list);
    }
    
    /**
     * 导出视频文档列表
     */
    @RequiresPermissions("system:doc:export")
    @Log(title = "视频文档", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(VideoDoc videoDoc)
    {
        List<VideoDoc> list = videoDocService.selectVideoDocList(videoDoc);
        ExcelUtil<VideoDoc> util = new ExcelUtil<VideoDoc>(VideoDoc.class);
        return util.exportExcel(list, "doc");
    }

    /**
     * 新增视频文档
     */
    @GetMapping("/add")
    public String add(ModelMap mmp)
    {
        List<PointTree2> pointTree2List = pointTree2Service.selectLeaf();
        mmp.put("pointTree2List", pointTree2List);
        return prefix + "/add";
    }

    /**
     * 新增保存视频文档
     */
    @RequiresPermissions("system:doc:add")
    @Log(title = "视频文档", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(VideoDoc videoDoc)
    {
        return toAjax(videoDocService.insertVideoDoc(videoDoc));
    }

    /**
     * 修改视频文档
     */
    @GetMapping("/edit/{videoDocId}")
    public String edit(@PathVariable("videoDocId") Long videoDocId, ModelMap mmap)
    {
        VideoDoc videoDoc = videoDocService.selectVideoDocById(videoDocId);
        mmap.put("videoDoc", videoDoc);
        List<PointTree2> pointTree2List = pointTree2Service.selectLeaf();
        mmap.put("pointTree2List", pointTree2List);
        return prefix + "/edit";
    }

    /**
     * 修改保存视频文档
     */
    @RequiresPermissions("system:doc:edit")
    @Log(title = "视频文档", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(VideoDoc videoDoc)
    {
        return toAjax(videoDocService.updateVideoDoc(videoDoc));
    }

    /**
     * 删除视频文档
     */
    @RequiresPermissions("system:doc:remove")
    @Log(title = "视频文档", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(videoDocService.deleteVideoDocByIds(ids));
    }
}
