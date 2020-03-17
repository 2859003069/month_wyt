package com.wuyuting.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuyuting.dao.CarDao;
import com.wuyuting.pojo.Car;
import com.wuyuting.service.CarService;
import com.wuyuting.vo.CarVO;
@Service
public class CarServiceImpl implements CarService {

	@Resource
	CarDao carDao;
	//查询
	@Override
	public PageInfo<Car> selects(CarVO carVO, Integer page, Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);
		
		List<Car> list = carDao.selects(carVO);
		
		return new PageInfo<Car>(list);
	}
	//添加
	@Override
	public int add(Car car) {
		
		return carDao.add(car);
	}
	//修改
	@Override
	public int update(Car car) {
		
		return carDao.update(car);
	}
	//详情
	@Override
	public Car selectById(Integer id) {
		
		return carDao.selectById(id);
	}

	

}
