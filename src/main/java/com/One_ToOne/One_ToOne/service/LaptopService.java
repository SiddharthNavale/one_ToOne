package com.One_ToOne.One_ToOne.service;

import java.util.List; 

import com.One_ToOne.One_ToOne.entities.Laptop;

public interface LaptopService {

	public List<Laptop> getAllLaptops(Integer pageNumber,Integer PageSize);

	public Laptop GetLaptop(int laptopsId);

	public void deleteLaptop(int laptopsId);

	public Laptop addLaptop(Laptop laptop);



}
