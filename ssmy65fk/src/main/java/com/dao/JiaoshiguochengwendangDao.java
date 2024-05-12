package com.dao;

import com.entity.JiaoshiguochengwendangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshiguochengwendangVO;
import com.entity.view.JiaoshiguochengwendangView;


/**
 * 教师过程文档
 * 
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface JiaoshiguochengwendangDao extends BaseMapper<JiaoshiguochengwendangEntity> {
	
	List<JiaoshiguochengwendangVO> selectListVO(@Param("ew") Wrapper<JiaoshiguochengwendangEntity> wrapper);
	
	JiaoshiguochengwendangVO selectVO(@Param("ew") Wrapper<JiaoshiguochengwendangEntity> wrapper);
	
	List<JiaoshiguochengwendangView> selectListView(@Param("ew") Wrapper<JiaoshiguochengwendangEntity> wrapper);

	List<JiaoshiguochengwendangView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshiguochengwendangEntity> wrapper);
	
	JiaoshiguochengwendangView selectView(@Param("ew") Wrapper<JiaoshiguochengwendangEntity> wrapper);
	

}
