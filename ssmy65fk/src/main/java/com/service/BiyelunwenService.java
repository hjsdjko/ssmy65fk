package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiyelunwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiyelunwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiyelunwenView;


/**
 * 毕业论文
 *
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface BiyelunwenService extends IService<BiyelunwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiyelunwenVO> selectListVO(Wrapper<BiyelunwenEntity> wrapper);
   	
   	BiyelunwenVO selectVO(@Param("ew") Wrapper<BiyelunwenEntity> wrapper);
   	
   	List<BiyelunwenView> selectListView(Wrapper<BiyelunwenEntity> wrapper);
   	
   	BiyelunwenView selectView(@Param("ew") Wrapper<BiyelunwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiyelunwenEntity> wrapper);
   	

}

