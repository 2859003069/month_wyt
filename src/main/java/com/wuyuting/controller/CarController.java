package com.wuyuting.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.wuyuting.pojo.Car;
import com.wuyuting.service.CarService;
import com.wuyuting.vo.CarVO;

@Controller
public class CarController {

	@Resource
	CarService carService;
	
	//查询 分页
	@RequestMapping("selects")
	public String selects(Model model,CarVO carVO,@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "5")Integer pageSize) {
		
		PageInfo<Car> info = carService.selects(carVO, page, pageSize);
		model.addAttribute("info", info);
	    model.addAttribute("carVO", carVO);
		
		return "car";
		
	}
	
	//去添加页面
	@GetMapping("add")
	public String add(Model model) {
		
		
		return "add";
		
		
		
	}
	
	//执行添加添加
	
	 @RequestMapping("add") 
	 @ResponseBody
	 public int add(Car car) {
	System.out.println(car);
	  return carService.add(car);
	  
	 }
	
	
	//去详情页面
	@RequestMapping("selectById")
	public String selectById(Model model,Integer id) {
		System.out.println(id);
		Car c = carService.selectById(id);
		model.addAttribute("c", c);
		return "selectById";
		
	}
	
	
	
}
