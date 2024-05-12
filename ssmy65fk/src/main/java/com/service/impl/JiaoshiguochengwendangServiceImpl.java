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


import com.dao.JiaoshiguochengwendangDao;
import com.entity.JiaoshiguochengwendangEntity;
import com.service.JiaoshiguochengwendangService;
import com.entity.vo.JiaoshiguochengwendangVO;
import com.entity.view.JiaoshiguochengwendangView;

@Service("jiaoshiguochengwendangService")
public class JiaoshiguochengwendangServiceImpl extends ServiceImpl<JiaoshiguochengwendangDao, JiaoshiguochengwendangEntity> implements JiaoshiguochengwendangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshiguochengwendangEntity> page = this.selectPage(
                new Query<JiaoshiguochengwendangEntity>(params).getPage(),
                new EntityWrapper<JiaoshiguochengwendangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshiguochengwendangEntity> wrapper) {
		  Page<JiaoshiguochengwendangView> page =new Query<JiaoshiguochengwendangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshiguochengwendangVO> selectListVO(Wrapper<JiaoshiguochengwendangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshiguochengwendangVO selectVO(Wrapper<JiaoshiguochengwendangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshiguochengwendangView> selectListView(Wrapper<JiaoshiguochengwendangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshiguochengwendangView selectView(Wrapper<JiaoshiguochengwendangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
