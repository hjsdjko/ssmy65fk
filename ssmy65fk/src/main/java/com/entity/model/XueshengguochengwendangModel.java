package com.entity.model;

import com.entity.XueshengguochengwendangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生过程文档
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public class XueshengguochengwendangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 院系
	 */
	
	private String yuanxi;
		
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
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：院系
	 */
	 
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
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
