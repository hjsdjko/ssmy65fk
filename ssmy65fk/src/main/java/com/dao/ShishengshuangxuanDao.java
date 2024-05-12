package com.dao;

import com.entity.ShishengshuangxuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShishengshuangxuanVO;
import com.entity.view.ShishengshuangxuanView;


/**
 * 师生双选
 * 
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface ShishengshuangxuanDao extends BaseMapper<ShishengshuangxuanEntity> {
	
	List<ShishengshuangxuanVO> selectListVO(@Param("ew") Wrapper<ShishengshuangxuanEntity> wrapper);
	
	ShishengshuangxuanVO selectVO(@Param("ew") Wrapper<ShishengshuangxuanEntity> wrapper);
	
	List<ShishengshuangxuanView> selectListView(@Param("ew") Wrapper<ShishengshuangxuanEntity> wrapper);

	List<ShishengshuangxuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShishengshuangxuanEntity> wrapper);
	
	ShishengshuangxuanView selectView(@Param("ew") Wrapper<ShishengshuangxuanEntity> wrapper);
	

}
