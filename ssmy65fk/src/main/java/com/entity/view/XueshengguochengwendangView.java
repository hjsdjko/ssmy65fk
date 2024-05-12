package com.entity.view;

import com.entity.XueshengguochengwendangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生过程文档
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
@TableName("xueshengguochengwendang")
public class XueshengguochengwendangView  extends XueshengguochengwendangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengguochengwendangView(){
	}
 
 	public XueshengguochengwendangView(XueshengguochengwendangEntity xueshengguochengwendangEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengguochengwendangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
