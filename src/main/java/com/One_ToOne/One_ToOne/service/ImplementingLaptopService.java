package com.One_ToOne.One_ToOne.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.One_ToOne.One_ToOne.DaoLayer.LaptopRepository;
import com.One_ToOne.One_ToOne.entities.Laptop;

@Service
public class ImplementingLaptopService implements LaptopService {
	
	@Autowired
	private LaptopRepository laptoprepository;
    @Override
	public List<Laptop> getAllLaptops(Integer pageNumber,Integer PageSize) {
		
		Pageable pageable= PageRequest.of(pageNumber, PageSize);
		Page<Laptop> pageLaptop=laptoprepository.findAll(pageable);
		return pageLaptop.toList();
		
	}
    @Override
	public Laptop GetLaptop(int laptopsId) {
		
		return laptoprepository.findById(laptopsId).get();
	}

	@Override
	public void deleteLaptop(int laptopsId) {
		
		
		Laptop laptop=laptoprepository.findById(laptopsId).get();
		laptoprepository.delete(laptop);
		}
    @Override
	public Laptop addLaptop(Laptop laptop) {
		
		return laptoprepository.save(laptop);
	}

}
