package com.entity.model;

import com.entity.JiaoshiguochengwendangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教师过程文档
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public class JiaoshiguochengwendangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 职称
	 */
	
	private String zhicheng;
		
	/**
	 * 过程标题
	 */
	
	private String guochengbiaoti;
		
	/**
	 * 添加时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiashijian;
		
	/**
	 * 过程图片
	 */
	
	private String guochengtupian;
		
	/**
	 * 过程内容
	 */
	
	private String guochengneirong;
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：职称
	 */
	 
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
	}
				
	
	/**
	 * 设置：过程标题
	 */
	 
	public void setGuochengbiaoti(String guochengbiaoti) {
		this.guochengbiaoti = guochengbiaoti;
	}
	
	/**
	 * 获取：过程标题
	 */
	public String getGuochengbiaoti() {
		return guochengbiaoti;
	}
				
	
	/**
	 * 设置：添加时间
	 */
	 
	public void setTianjiashijian(Date tianjiashijian) {
		this.tianjiashijian = tianjiashijian;
	}
	
	/**
	 * 获取：添加时间
	 */
	public Date getTianjiashijian() {
		return tianjiashijian;
	}
				
	
	/**
	 * 设置：过程图片
	 */
	 
	public void setGuochengtupian(String guochengtupian) {
		this.guochengtupian = guochengtupian;
	}
	
	/**
	 * 获取：过程图片
	 */
	public String getGuochengtupian() {
		return guochengtupian;
	}
				
	
	/**
	 * 设置：过程内容
	 */
	 
	public void setGuochengneirong(String guochengneirong) {
		this.guochengneirong = guochengneirong;
	}
	
	/**
	 * 获取：过程内容
	 */
	public String getGuochengneirong() {
		return guochengneirong;
	}
			
}
