package com.wuyuting.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wuyuting.pojo.Car;
import com.wuyuting.vo.CarVO;

public interface CarService {

		//查询
		PageInfo<Car> selects(CarVO carVO, Integer page, Integer pageSize);
		
		//新增
		int add(Car car);
		
		//修改
		int update(Car car);
		
		//根据id查
		Car selectById(Integer id);

		
	
}
