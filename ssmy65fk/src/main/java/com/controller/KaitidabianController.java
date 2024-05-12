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

import com.entity.KaitidabianEntity;
import com.entity.view.KaitidabianView;

import com.service.KaitidabianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 开题答辩
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
@RestController
@RequestMapping("/kaitidabian")
public class KaitidabianController {
    @Autowired
    private KaitidabianService kaitidabianService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaitidabianEntity kaitidabian, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			kaitidabian.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			kaitidabian.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KaitidabianEntity> ew = new EntityWrapper<KaitidabianEntity>();


		PageUtils page = kaitidabianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaitidabian), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaitidabianEntity kaitidabian, 
		HttpServletRequest request){
        EntityWrapper<KaitidabianEntity> ew = new EntityWrapper<KaitidabianEntity>();

		PageUtils page = kaitidabianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaitidabian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaitidabianEntity kaitidabian){
       	EntityWrapper<KaitidabianEntity> ew = new EntityWrapper<KaitidabianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaitidabian, "kaitidabian")); 
        return R.ok().put("data", kaitidabianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaitidabianEntity kaitidabian){
        EntityWrapper< KaitidabianEntity> ew = new EntityWrapper< KaitidabianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaitidabian, "kaitidabian")); 
		KaitidabianView kaitidabianView =  kaitidabianService.selectView(ew);
		return R.ok("查询开题答辩成功").put("data", kaitidabianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaitidabianEntity kaitidabian = kaitidabianService.selectById(id);
        return R.ok().put("data", kaitidabian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaitidabianEntity kaitidabian = kaitidabianService.selectById(id);
        return R.ok().put("data", kaitidabian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaitidabianEntity kaitidabian, HttpServletRequest request){
    	kaitidabian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaitidabian);

        kaitidabianService.insert(kaitidabian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaitidabianEntity kaitidabian, HttpServletRequest request){
    	kaitidabian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaitidabian);

        kaitidabianService.insert(kaitidabian);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KaitidabianEntity kaitidabian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaitidabian);
        kaitidabianService.updateById(kaitidabian);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaitidabianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
