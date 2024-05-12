package com.dao;

import com.entity.YuanxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxiaoVO;
import com.entity.view.YuanxiaoView;


/**
 * 院校
 * 
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface YuanxiaoDao extends BaseMapper<YuanxiaoEntity> {
	
	List<YuanxiaoVO> selectListVO(@Param("ew") Wrapper<YuanxiaoEntity> wrapper);
	
	YuanxiaoVO selectVO(@Param("ew") Wrapper<YuanxiaoEntity> wrapper);
	
	List<YuanxiaoView> selectListView(@Param("ew") Wrapper<YuanxiaoEntity> wrapper);

	List<YuanxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxiaoEntity> wrapper);
	
	YuanxiaoView selectView(@Param("ew") Wrapper<YuanxiaoEntity> wrapper);
	

}
