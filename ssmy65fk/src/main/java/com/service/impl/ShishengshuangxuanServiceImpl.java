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


import com.dao.ShishengshuangxuanDao;
import com.entity.ShishengshuangxuanEntity;
import com.service.ShishengshuangxuanService;
import com.entity.vo.ShishengshuangxuanVO;
import com.entity.view.ShishengshuangxuanView;

@Service("shishengshuangxuanService")
public class ShishengshuangxuanServiceImpl extends ServiceImpl<ShishengshuangxuanDao, ShishengshuangxuanEntity> implements ShishengshuangxuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShishengshuangxuanEntity> page = this.selectPage(
                new Query<ShishengshuangxuanEntity>(params).getPage(),
                new EntityWrapper<ShishengshuangxuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShishengshuangxuanEntity> wrapper) {
		  Page<ShishengshuangxuanView> page =new Query<ShishengshuangxuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShishengshuangxuanVO> selectListVO(Wrapper<ShishengshuangxuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShishengshuangxuanVO selectVO(Wrapper<ShishengshuangxuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShishengshuangxuanView> selectListView(Wrapper<ShishengshuangxuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShishengshuangxuanView selectView(Wrapper<ShishengshuangxuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
