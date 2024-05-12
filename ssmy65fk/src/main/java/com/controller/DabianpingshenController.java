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

import com.entity.DabianpingshenEntity;
import com.entity.view.DabianpingshenView;

import com.service.DabianpingshenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 答辩评审
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
@RestController
@RequestMapping("/dabianpingshen")
public class DabianpingshenController {
    @Autowired
    private DabianpingshenService dabianpingshenService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DabianpingshenEntity dabianpingshen, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			dabianpingshen.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			dabianpingshen.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DabianpingshenEntity> ew = new EntityWrapper<DabianpingshenEntity>();


		PageUtils page = dabianpingshenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dabianpingshen), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DabianpingshenEntity dabianpingshen, 
		HttpServletRequest request){
        EntityWrapper<DabianpingshenEntity> ew = new EntityWrapper<DabianpingshenEntity>();

		PageUtils page = dabianpingshenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dabianpingshen), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DabianpingshenEntity dabianpingshen){
       	EntityWrapper<DabianpingshenEntity> ew = new EntityWrapper<DabianpingshenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dabianpingshen, "dabianpingshen")); 
        return R.ok().put("data", dabianpingshenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DabianpingshenEntity dabianpingshen){
        EntityWrapper< DabianpingshenEntity> ew = new EntityWrapper< DabianpingshenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dabianpingshen, "dabianpingshen")); 
		DabianpingshenView dabianpingshenView =  dabianpingshenService.selectView(ew);
		return R.ok("查询答辩评审成功").put("data", dabianpingshenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DabianpingshenEntity dabianpingshen = dabianpingshenService.selectById(id);
        return R.ok().put("data", dabianpingshen);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DabianpingshenEntity dabianpingshen = dabianpingshenService.selectById(id);
        return R.ok().put("data", dabianpingshen);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DabianpingshenEntity dabianpingshen, HttpServletRequest request){
    	dabianpingshen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dabianpingshen);

        dabianpingshenService.insert(dabianpingshen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DabianpingshenEntity dabianpingshen, HttpServletRequest request){
    	dabianpingshen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dabianpingshen);

        dabianpingshenService.insert(dabianpingshen);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DabianpingshenEntity dabianpingshen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dabianpingshen);
        dabianpingshenService.updateById(dabianpingshen);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dabianpingshenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
