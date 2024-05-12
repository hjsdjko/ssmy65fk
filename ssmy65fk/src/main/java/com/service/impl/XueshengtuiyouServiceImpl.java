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


import com.dao.XueshengtuiyouDao;
import com.entity.XueshengtuiyouEntity;
import com.service.XueshengtuiyouService;
import com.entity.vo.XueshengtuiyouVO;
import com.entity.view.XueshengtuiyouView;

@Service("xueshengtuiyouService")
public class XueshengtuiyouServiceImpl extends ServiceImpl<XueshengtuiyouDao, XueshengtuiyouEntity> implements XueshengtuiyouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengtuiyouEntity> page = this.selectPage(
                new Query<XueshengtuiyouEntity>(params).getPage(),
                new EntityWrapper<XueshengtuiyouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengtuiyouEntity> wrapper) {
		  Page<XueshengtuiyouView> page =new Query<XueshengtuiyouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengtuiyouVO> selectListVO(Wrapper<XueshengtuiyouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengtuiyouVO selectVO(Wrapper<XueshengtuiyouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengtuiyouView> selectListView(Wrapper<XueshengtuiyouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengtuiyouView selectView(Wrapper<XueshengtuiyouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
