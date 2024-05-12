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

import com.entity.XueshengtuiyouEntity;
import com.entity.view.XueshengtuiyouView;

import com.service.XueshengtuiyouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 学生推优
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
@RestController
@RequestMapping("/xueshengtuiyou")
public class XueshengtuiyouController {
    @Autowired
    private XueshengtuiyouService xueshengtuiyouService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengtuiyouEntity xueshengtuiyou, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			xueshengtuiyou.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			xueshengtuiyou.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengtuiyouEntity> ew = new EntityWrapper<XueshengtuiyouEntity>();


		PageUtils page = xueshengtuiyouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengtuiyou), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengtuiyouEntity xueshengtuiyou, 
		HttpServletRequest request){
        EntityWrapper<XueshengtuiyouEntity> ew = new EntityWrapper<XueshengtuiyouEntity>();

		PageUtils page = xueshengtuiyouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengtuiyou), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengtuiyouEntity xueshengtuiyou){
       	EntityWrapper<XueshengtuiyouEntity> ew = new EntityWrapper<XueshengtuiyouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengtuiyou, "xueshengtuiyou")); 
        return R.ok().put("data", xueshengtuiyouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengtuiyouEntity xueshengtuiyou){
        EntityWrapper< XueshengtuiyouEntity> ew = new EntityWrapper< XueshengtuiyouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengtuiyou, "xueshengtuiyou")); 
		XueshengtuiyouView xueshengtuiyouView =  xueshengtuiyouService.selectView(ew);
		return R.ok("查询学生推优成功").put("data", xueshengtuiyouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengtuiyouEntity xueshengtuiyou = xueshengtuiyouService.selectById(id);
        return R.ok().put("data", xueshengtuiyou);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengtuiyouEntity xueshengtuiyou = xueshengtuiyouService.selectById(id);
        return R.ok().put("data", xueshengtuiyou);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengtuiyouEntity xueshengtuiyou, HttpServletRequest request){
    	xueshengtuiyou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengtuiyou);

        xueshengtuiyouService.insert(xueshengtuiyou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengtuiyouEntity xueshengtuiyou, HttpServletRequest request){
    	xueshengtuiyou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengtuiyou);

        xueshengtuiyouService.insert(xueshengtuiyou);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshengtuiyouEntity xueshengtuiyou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengtuiyou);
        xueshengtuiyouService.updateById(xueshengtuiyou);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengtuiyouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
