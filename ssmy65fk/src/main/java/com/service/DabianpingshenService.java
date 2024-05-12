package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DabianpingshenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DabianpingshenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DabianpingshenView;


/**
 * 答辩评审
 *
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface DabianpingshenService extends IService<DabianpingshenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DabianpingshenVO> selectListVO(Wrapper<DabianpingshenEntity> wrapper);
   	
   	DabianpingshenVO selectVO(@Param("ew") Wrapper<DabianpingshenEntity> wrapper);
   	
   	List<DabianpingshenView> selectListView(Wrapper<DabianpingshenEntity> wrapper);
   	
   	DabianpingshenView selectView(@Param("ew") Wrapper<DabianpingshenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DabianpingshenEntity> wrapper);
   	

}

