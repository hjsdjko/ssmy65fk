package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaitidabianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaitidabianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaitidabianView;


/**
 * 开题答辩
 *
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface KaitidabianService extends IService<KaitidabianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaitidabianVO> selectListVO(Wrapper<KaitidabianEntity> wrapper);
   	
   	KaitidabianVO selectVO(@Param("ew") Wrapper<KaitidabianEntity> wrapper);
   	
   	List<KaitidabianView> selectListView(Wrapper<KaitidabianEntity> wrapper);
   	
   	KaitidabianView selectView(@Param("ew") Wrapper<KaitidabianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaitidabianEntity> wrapper);
   	

}

