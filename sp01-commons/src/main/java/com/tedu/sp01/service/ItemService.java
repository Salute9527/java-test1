package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//根基订单id 获取商品列表
	List<Item> getItems(String orderId);
	//提交订单之后 减少商品数量
	void decreaseNumbers(List<Item> list);
}
