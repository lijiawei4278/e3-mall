package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.pojo.TbItemExample.Criteria;
import cn.e3mall.service.TbItemService;
@Service
public class TbItemServiceImpl implements TbItemService {

	@Autowired
	private TbItemMapper tm;
	@Override
	public TbItem findItem(Long itemid) {
//		TbItem item = tm.selectByPrimaryKey(itemid);
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemid);
		List<TbItem> list = tm.selectByExample(example);
		return list.get(0);
	}

}
