package cn.e3mall.service;

import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.pojo.TbItem;

public interface TbItemService {
	
	TbItem findItem(Long itemid);
	
	DataGridResult getItemList(int page,int rows);
}
