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

import com.entity.XueshengguochengwendangEntity;
import com.entity.view.XueshengguochengwendangView;

import com.service.XueshengguochengwendangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 学生过程文档
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
@RestController
@RequestMapping("/xueshengguochengwendang")
public class XueshengguochengwendangController {
    @Autowired
    private XueshengguochengwendangService xueshengguochengwendangService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengguochengwendangEntity xueshengguochengwendang, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshengguochengwendang.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengguochengwendangEntity> ew = new EntityWrapper<XueshengguochengwendangEntity>();


		PageUtils page = xueshengguochengwendangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengguochengwendang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengguochengwendangEntity xueshengguochengwendang, 
		HttpServletRequest request){
        EntityWrapper<XueshengguochengwendangEntity> ew = new EntityWrapper<XueshengguochengwendangEntity>();

		PageUtils page = xueshengguochengwendangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengguochengwendang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengguochengwendangEntity xueshengguochengwendang){
       	EntityWrapper<XueshengguochengwendangEntity> ew = new EntityWrapper<XueshengguochengwendangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengguochengwendang, "xueshengguochengwendang")); 
        return R.ok().put("data", xueshengguochengwendangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengguochengwendangEntity xueshengguochengwendang){
        EntityWrapper< XueshengguochengwendangEntity> ew = new EntityWrapper< XueshengguochengwendangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengguochengwendang, "xueshengguochengwendang")); 
		XueshengguochengwendangView xueshengguochengwendangView =  xueshengguochengwendangService.selectView(ew);
		return R.ok("查询学生过程文档成功").put("data", xueshengguochengwendangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengguochengwendangEntity xueshengguochengwendang = xueshengguochengwendangService.selectById(id);
        return R.ok().put("data", xueshengguochengwendang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengguochengwendangEntity xueshengguochengwendang = xueshengguochengwendangService.selectById(id);
        return R.ok().put("data", xueshengguochengwendang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengguochengwendangEntity xueshengguochengwendang, HttpServletRequest request){
    	xueshengguochengwendang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengguochengwendang);

        xueshengguochengwendangService.insert(xueshengguochengwendang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengguochengwendangEntity xueshengguochengwendang, HttpServletRequest request){
    	xueshengguochengwendang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengguochengwendang);

        xueshengguochengwendangService.insert(xueshengguochengwendang);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshengguochengwendangEntity xueshengguochengwendang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengguochengwendang);
        xueshengguochengwendangService.updateById(xueshengguochengwendang);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengguochengwendangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
