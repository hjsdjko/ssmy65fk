package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShishengshuangxuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShishengshuangxuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShishengshuangxuanView;


/**
 * 师生双选
 *
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface ShishengshuangxuanService extends IService<ShishengshuangxuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShishengshuangxuanVO> selectListVO(Wrapper<ShishengshuangxuanEntity> wrapper);
   	
   	ShishengshuangxuanVO selectVO(@Param("ew") Wrapper<ShishengshuangxuanEntity> wrapper);
   	
   	List<ShishengshuangxuanView> selectListView(Wrapper<ShishengshuangxuanEntity> wrapper);
   	
   	ShishengshuangxuanView selectView(@Param("ew") Wrapper<ShishengshuangxuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShishengshuangxuanEntity> wrapper);
   	

}

