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


import com.dao.DabianpingshenDao;
import com.entity.DabianpingshenEntity;
import com.service.DabianpingshenService;
import com.entity.vo.DabianpingshenVO;
import com.entity.view.DabianpingshenView;

@Service("dabianpingshenService")
public class DabianpingshenServiceImpl extends ServiceImpl<DabianpingshenDao, DabianpingshenEntity> implements DabianpingshenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DabianpingshenEntity> page = this.selectPage(
                new Query<DabianpingshenEntity>(params).getPage(),
                new EntityWrapper<DabianpingshenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DabianpingshenEntity> wrapper) {
		  Page<DabianpingshenView> page =new Query<DabianpingshenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DabianpingshenVO> selectListVO(Wrapper<DabianpingshenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DabianpingshenVO selectVO(Wrapper<DabianpingshenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DabianpingshenView> selectListView(Wrapper<DabianpingshenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DabianpingshenView selectView(Wrapper<DabianpingshenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
