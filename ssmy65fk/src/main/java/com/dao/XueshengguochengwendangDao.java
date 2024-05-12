package com.dao;

import com.entity.XueshengguochengwendangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengguochengwendangVO;
import com.entity.view.XueshengguochengwendangView;


/**
 * 学生过程文档
 * 
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface XueshengguochengwendangDao extends BaseMapper<XueshengguochengwendangEntity> {
	
	List<XueshengguochengwendangVO> selectListVO(@Param("ew") Wrapper<XueshengguochengwendangEntity> wrapper);
	
	XueshengguochengwendangVO selectVO(@Param("ew") Wrapper<XueshengguochengwendangEntity> wrapper);
	
	List<XueshengguochengwendangView> selectListView(@Param("ew") Wrapper<XueshengguochengwendangEntity> wrapper);

	List<XueshengguochengwendangView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengguochengwendangEntity> wrapper);
	
	XueshengguochengwendangView selectView(@Param("ew") Wrapper<XueshengguochengwendangEntity> wrapper);
	

}
