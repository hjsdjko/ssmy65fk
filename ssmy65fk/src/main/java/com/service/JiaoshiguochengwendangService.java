package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshiguochengwendangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshiguochengwendangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshiguochengwendangView;


/**
 * 教师过程文档
 *
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface JiaoshiguochengwendangService extends IService<JiaoshiguochengwendangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshiguochengwendangVO> selectListVO(Wrapper<JiaoshiguochengwendangEntity> wrapper);
   	
   	JiaoshiguochengwendangVO selectVO(@Param("ew") Wrapper<JiaoshiguochengwendangEntity> wrapper);
   	
   	List<JiaoshiguochengwendangView> selectListView(Wrapper<JiaoshiguochengwendangEntity> wrapper);
   	
   	JiaoshiguochengwendangView selectView(@Param("ew") Wrapper<JiaoshiguochengwendangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshiguochengwendangEntity> wrapper);
   	

}

