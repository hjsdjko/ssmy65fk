package com.entity.vo;

import com.entity.XueshengtuiyouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学生推优
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public class XueshengtuiyouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 任职学校
	 */
	
	private String renzhixuexiao;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 就读学校
	 */
	
	private String jiuduxuexiao;
		
	/**
	 * 院系
	 */
	
	private String yuanxi;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 开题名称
	 */
	
	private String kaitimingcheng;
		
	/**
	 * 推优图片
	 */
	
	private String tuiyoutupian;
		
	/**
	 * 推优时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuiyoushijian;
		
	/**
	 * 推优理由
	 */
	
	private String tuiyouliyou;
				
	
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
	 * 设置：任职学校
	 */
	 
	public void setRenzhixuexiao(String renzhixuexiao) {
		this.renzhixuexiao = renzhixuexiao;
	}
	
	/**
	 * 获取：任职学校
	 */
	public String getRenzhixuexiao() {
		return renzhixuexiao;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
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
	 * 设置：就读学校
	 */
	 
	public void setJiuduxuexiao(String jiuduxuexiao) {
		this.jiuduxuexiao = jiuduxuexiao;
	}
	
	/**
	 * 获取：就读学校
	 */
	public String getJiuduxuexiao() {
		return jiuduxuexiao;
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
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：开题名称
	 */
	 
	public void setKaitimingcheng(String kaitimingcheng) {
		this.kaitimingcheng = kaitimingcheng;
	}
	
	/**
	 * 获取：开题名称
	 */
	public String getKaitimingcheng() {
		return kaitimingcheng;
	}
				
	
	/**
	 * 设置：推优图片
	 */
	 
	public void setTuiyoutupian(String tuiyoutupian) {
		this.tuiyoutupian = tuiyoutupian;
	}
	
	/**
	 * 获取：推优图片
	 */
	public String getTuiyoutupian() {
		return tuiyoutupian;
	}
				
	
	/**
	 * 设置：推优时间
	 */
	 
	public void setTuiyoushijian(Date tuiyoushijian) {
		this.tuiyoushijian = tuiyoushijian;
	}
	
	/**
	 * 获取：推优时间
	 */
	public Date getTuiyoushijian() {
		return tuiyoushijian;
	}
				
	
	/**
	 * 设置：推优理由
	 */
	 
	public void setTuiyouliyou(String tuiyouliyou) {
		this.tuiyouliyou = tuiyouliyou;
	}
	
	/**
	 * 获取：推优理由
	 */
	public String getTuiyouliyou() {
		return tuiyouliyou;
	}
			
}
