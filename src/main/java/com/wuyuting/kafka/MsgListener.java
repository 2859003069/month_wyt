package com.wuyuting.kafka;

import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.kafka.listener.MessageListener;

import com.wuyuting.pojo.Car;
import com.wuyuting.service.impl.CarServiceImpl;

public class MsgListener implements MessageListener<String, String>{

	//注入redis
	RedisTemplate redisTemplate;
	//注入serviceimpl
	CarServiceImpl carServiceImpl;
	
	@Override
	public void onMessage(ConsumerRecord<String, String> data) {
		//得到redis的key
		String redisKey = data.value();
		List<Car> list = redisTemplate.opsForList().range(redisKey, 0, -1);
		for (Car car : list) {
			//添加
			carServiceImpl.add(car);
		}
		//删除redis
		redisTemplate.delete(redisKey);
		
	}

}
