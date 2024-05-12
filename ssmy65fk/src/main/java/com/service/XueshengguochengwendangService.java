package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengguochengwendangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengguochengwendangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengguochengwendangView;


/**
 * 学生过程文档
 *
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface XueshengguochengwendangService extends IService<XueshengguochengwendangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengguochengwendangVO> selectListVO(Wrapper<XueshengguochengwendangEntity> wrapper);
   	
   	XueshengguochengwendangVO selectVO(@Param("ew") Wrapper<XueshengguochengwendangEntity> wrapper);
   	
   	List<XueshengguochengwendangView> selectListView(Wrapper<XueshengguochengwendangEntity> wrapper);
   	
   	XueshengguochengwendangView selectView(@Param("ew") Wrapper<XueshengguochengwendangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengguochengwendangEntity> wrapper);
   	

}

