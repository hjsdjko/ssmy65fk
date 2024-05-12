package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BiyelunwenDao;
import com.entity.BiyelunwenEntity;
import com.service.BiyelunwenService;
import com.entity.vo.BiyelunwenVO;
import com.entity.view.BiyelunwenView;

@Service("biyelunwenService")
public class BiyelunwenServiceImpl extends ServiceImpl<BiyelunwenDao, BiyelunwenEntity> implements BiyelunwenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiyelunwenEntity> page = this.selectPage(
                new Query<BiyelunwenEntity>(params).getPage(),
                new EntityWrapper<BiyelunwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiyelunwenEntity> wrapper) {
		  Page<BiyelunwenView> page =new Query<BiyelunwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiyelunwenVO> selectListVO(Wrapper<BiyelunwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiyelunwenVO selectVO(Wrapper<BiyelunwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiyelunwenView> selectListView(Wrapper<BiyelunwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiyelunwenView selectView(Wrapper<BiyelunwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
