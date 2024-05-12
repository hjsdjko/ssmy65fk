package com.entity.view;

import com.entity.ShishengshuangxuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 师生双选
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
@TableName("shishengshuangxuan")
public class ShishengshuangxuanView  extends ShishengshuangxuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShishengshuangxuanView(){
	}
 
 	public ShishengshuangxuanView(ShishengshuangxuanEntity shishengshuangxuanEntity){
 	try {
			BeanUtils.copyProperties(this, shishengshuangxuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
