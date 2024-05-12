package com.dao;

import com.entity.XueshengtuiyouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengtuiyouVO;
import com.entity.view.XueshengtuiyouView;


/**
 * 学生推优
 * 
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface XueshengtuiyouDao extends BaseMapper<XueshengtuiyouEntity> {
	
	List<XueshengtuiyouVO> selectListVO(@Param("ew") Wrapper<XueshengtuiyouEntity> wrapper);
	
	XueshengtuiyouVO selectVO(@Param("ew") Wrapper<XueshengtuiyouEntity> wrapper);
	
	List<XueshengtuiyouView> selectListView(@Param("ew") Wrapper<XueshengtuiyouEntity> wrapper);

	List<XueshengtuiyouView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengtuiyouEntity> wrapper);
	
	XueshengtuiyouView selectView(@Param("ew") Wrapper<XueshengtuiyouEntity> wrapper);
	

}
