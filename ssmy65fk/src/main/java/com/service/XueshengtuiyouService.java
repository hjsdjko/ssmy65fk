package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengtuiyouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengtuiyouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengtuiyouView;


/**
 * 学生推优
 *
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface XueshengtuiyouService extends IService<XueshengtuiyouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengtuiyouVO> selectListVO(Wrapper<XueshengtuiyouEntity> wrapper);
   	
   	XueshengtuiyouVO selectVO(@Param("ew") Wrapper<XueshengtuiyouEntity> wrapper);
   	
   	List<XueshengtuiyouView> selectListView(Wrapper<XueshengtuiyouEntity> wrapper);
   	
   	XueshengtuiyouView selectView(@Param("ew") Wrapper<XueshengtuiyouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengtuiyouEntity> wrapper);
   	

}

