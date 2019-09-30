package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//根据用户id 获取用户名
User getUser(Integer id);
//增加积分
void addScore(Integer id,Integer score);
}
