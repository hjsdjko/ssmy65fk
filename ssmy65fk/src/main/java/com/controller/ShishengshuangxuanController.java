package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShishengshuangxuanEntity;
import com.entity.view.ShishengshuangxuanView;

import com.service.ShishengshuangxuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 师生双选
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
@RestController
@RequestMapping("/shishengshuangxuan")
public class ShishengshuangxuanController {
    @Autowired
    private ShishengshuangxuanService shishengshuangxuanService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShishengshuangxuanEntity shishengshuangxuan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			shishengshuangxuan.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			shishengshuangxuan.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShishengshuangxuanEntity> ew = new EntityWrapper<ShishengshuangxuanEntity>();


		PageUtils page = shishengshuangxuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shishengshuangxuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShishengshuangxuanEntity shishengshuangxuan, 
		HttpServletRequest request){
        EntityWrapper<ShishengshuangxuanEntity> ew = new EntityWrapper<ShishengshuangxuanEntity>();

		PageUtils page = shishengshuangxuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shishengshuangxuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShishengshuangxuanEntity shishengshuangxuan){
       	EntityWrapper<ShishengshuangxuanEntity> ew = new EntityWrapper<ShishengshuangxuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shishengshuangxuan, "shishengshuangxuan")); 
        return R.ok().put("data", shishengshuangxuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShishengshuangxuanEntity shishengshuangxuan){
        EntityWrapper< ShishengshuangxuanEntity> ew = new EntityWrapper< ShishengshuangxuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shishengshuangxuan, "shishengshuangxuan")); 
		ShishengshuangxuanView shishengshuangxuanView =  shishengshuangxuanService.selectView(ew);
		return R.ok("查询师生双选成功").put("data", shishengshuangxuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShishengshuangxuanEntity shishengshuangxuan = shishengshuangxuanService.selectById(id);
        return R.ok().put("data", shishengshuangxuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShishengshuangxuanEntity shishengshuangxuan = shishengshuangxuanService.selectById(id);
        return R.ok().put("data", shishengshuangxuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShishengshuangxuanEntity shishengshuangxuan, HttpServletRequest request){
    	shishengshuangxuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shishengshuangxuan);

        shishengshuangxuanService.insert(shishengshuangxuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShishengshuangxuanEntity shishengshuangxuan, HttpServletRequest request){
    	shishengshuangxuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shishengshuangxuan);

        shishengshuangxuanService.insert(shishengshuangxuan);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShishengshuangxuanEntity shishengshuangxuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shishengshuangxuan);
        shishengshuangxuanService.updateById(shishengshuangxuan);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shishengshuangxuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
