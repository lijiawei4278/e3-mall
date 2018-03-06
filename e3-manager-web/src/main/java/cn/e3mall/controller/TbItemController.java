package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.TbItemService;

@Controller
public class TbItemController {
	
	@Autowired
	private TbItemService tbItemService;
	
	@RequestMapping("/item/{itemid}")
	@ResponseBody
	public TbItem findItem(@PathVariable Long itemid){
		TbItem item = tbItemService.findItem(itemid);
		return item;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public DataGridResult getItemList(int page,int rows){
		DataGridResult result = tbItemService.getItemList(page, rows);
		return result;
		
	}
}
