package com.entity.view;

import com.entity.JiaoshiguochengwendangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师过程文档
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
@TableName("jiaoshiguochengwendang")
public class JiaoshiguochengwendangView  extends JiaoshiguochengwendangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshiguochengwendangView(){
	}
 
 	public JiaoshiguochengwendangView(JiaoshiguochengwendangEntity jiaoshiguochengwendangEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshiguochengwendangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
