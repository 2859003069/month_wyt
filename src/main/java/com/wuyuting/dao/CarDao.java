package com.wuyuting.dao;

import java.util.List;

import com.wuyuting.pojo.Car;
import com.wuyuting.vo.CarVO;

public interface CarDao {

	//查询
	List<Car> selects(CarVO carVO);
	
	//新增
	int add(Car car);
	
	//修改
	int update(Car car);
	
	//根据id查
	Car selectById(Integer id);
	
}
