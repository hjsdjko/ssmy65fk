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


import com.dao.KaitidabianDao;
import com.entity.KaitidabianEntity;
import com.service.KaitidabianService;
import com.entity.vo.KaitidabianVO;
import com.entity.view.KaitidabianView;

@Service("kaitidabianService")
public class KaitidabianServiceImpl extends ServiceImpl<KaitidabianDao, KaitidabianEntity> implements KaitidabianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaitidabianEntity> page = this.selectPage(
                new Query<KaitidabianEntity>(params).getPage(),
                new EntityWrapper<KaitidabianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaitidabianEntity> wrapper) {
		  Page<KaitidabianView> page =new Query<KaitidabianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaitidabianVO> selectListVO(Wrapper<KaitidabianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaitidabianVO selectVO(Wrapper<KaitidabianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaitidabianView> selectListView(Wrapper<KaitidabianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaitidabianView selectView(Wrapper<KaitidabianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
