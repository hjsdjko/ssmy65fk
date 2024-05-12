package com.entity.view;

import com.entity.DabianpingshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 答辩评审
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
@TableName("dabianpingshen")
public class DabianpingshenView  extends DabianpingshenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DabianpingshenView(){
	}
 
 	public DabianpingshenView(DabianpingshenEntity dabianpingshenEntity){
 	try {
			BeanUtils.copyProperties(this, dabianpingshenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
