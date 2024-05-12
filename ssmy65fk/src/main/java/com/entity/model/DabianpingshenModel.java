package com.entity.model;

import com.entity.DabianpingshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 答辩评审
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public class DabianpingshenModel  implements Serializable {
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
	 * 报告图片
	 */
	
	private String baogaotupian;
		
	/**
	 * 答辩时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dabianshijian;
		
	/**
	 * 答辩分数
	 */
	
	private Integer dabianfenshu;
		
	/**
	 * 教师评价
	 */
	
	private String jiaoshipingjia;
		
	/**
	 * 是否及格
	 */
	
	private String shifoujige;
				
	
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
	 * 设置：报告图片
	 */
	 
	public void setBaogaotupian(String baogaotupian) {
		this.baogaotupian = baogaotupian;
	}
	
	/**
	 * 获取：报告图片
	 */
	public String getBaogaotupian() {
		return baogaotupian;
	}
				
	
	/**
	 * 设置：答辩时间
	 */
	 
	public void setDabianshijian(Date dabianshijian) {
		this.dabianshijian = dabianshijian;
	}
	
	/**
	 * 获取：答辩时间
	 */
	public Date getDabianshijian() {
		return dabianshijian;
	}
				
	
	/**
	 * 设置：答辩分数
	 */
	 
	public void setDabianfenshu(Integer dabianfenshu) {
		this.dabianfenshu = dabianfenshu;
	}
	
	/**
	 * 获取：答辩分数
	 */
	public Integer getDabianfenshu() {
		return dabianfenshu;
	}
				
	
	/**
	 * 设置：教师评价
	 */
	 
	public void setJiaoshipingjia(String jiaoshipingjia) {
		this.jiaoshipingjia = jiaoshipingjia;
	}
	
	/**
	 * 获取：教师评价
	 */
	public String getJiaoshipingjia() {
		return jiaoshipingjia;
	}
				
	
	/**
	 * 设置：是否及格
	 */
	 
	public void setShifoujige(String shifoujige) {
		this.shifoujige = shifoujige;
	}
	
	/**
	 * 获取：是否及格
	 */
	public String getShifoujige() {
		return shifoujige;
	}
			
}
