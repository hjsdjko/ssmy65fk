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


import com.dao.XueshengguochengwendangDao;
import com.entity.XueshengguochengwendangEntity;
import com.service.XueshengguochengwendangService;
import com.entity.vo.XueshengguochengwendangVO;
import com.entity.view.XueshengguochengwendangView;

@Service("xueshengguochengwendangService")
public class XueshengguochengwendangServiceImpl extends ServiceImpl<XueshengguochengwendangDao, XueshengguochengwendangEntity> implements XueshengguochengwendangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengguochengwendangEntity> page = this.selectPage(
                new Query<XueshengguochengwendangEntity>(params).getPage(),
                new EntityWrapper<XueshengguochengwendangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengguochengwendangEntity> wrapper) {
		  Page<XueshengguochengwendangView> page =new Query<XueshengguochengwendangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengguochengwendangVO> selectListVO(Wrapper<XueshengguochengwendangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengguochengwendangVO selectVO(Wrapper<XueshengguochengwendangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengguochengwendangView> selectListView(Wrapper<XueshengguochengwendangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengguochengwendangView selectView(Wrapper<XueshengguochengwendangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
