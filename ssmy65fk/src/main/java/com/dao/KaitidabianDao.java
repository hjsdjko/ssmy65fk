package com.dao;

import com.entity.KaitidabianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaitidabianVO;
import com.entity.view.KaitidabianView;


/**
 * 开题答辩
 * 
 * @author 
 * @email 
 * @date 2023-04-20 12:08:31
 */
public interface KaitidabianDao extends BaseMapper<KaitidabianEntity> {
	
	List<KaitidabianVO> selectListVO(@Param("ew") Wrapper<KaitidabianEntity> wrapper);
	
	KaitidabianVO selectVO(@Param("ew") Wrapper<KaitidabianEntity> wrapper);
	
	List<KaitidabianView> selectListView(@Param("ew") Wrapper<KaitidabianEntity> wrapper);

	List<KaitidabianView> selectListView(Pagination page,@Param("ew") Wrapper<KaitidabianEntity> wrapper);
	
	KaitidabianView selectView(@Param("ew") Wrapper<KaitidabianEntity> wrapper);
	

}
