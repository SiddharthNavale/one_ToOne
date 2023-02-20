package com.One_ToOne.One_ToOne.Controller;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.One_ToOne.One_ToOne.entities.Laptop;
import com.One_ToOne.One_ToOne.service.LaptopService;

@RestController
public class LaptopController {
	
	@Autowired
	private LaptopService laptopservice;
	
	@GetMapping("/laptops")
	public List<Laptop> getAllLaptops(@RequestParam(value="pageNumber",defaultValue="4",required=false)
	Integer pageNumber,@RequestParam(value="PageSize",defaultValue="1",required=false)
	Integer PageSize){
		
		return this.laptopservice.getAllLaptops( pageNumber, PageSize);
		}
		
   @GetMapping ("/laptops/{laptopsId}")
   public Laptop GetLaptop(@PathVariable int laptopsId) {
		return this.laptopservice.GetLaptop(laptopsId);
	}

   @DeleteMapping ("/laptops/{laptopsId}")
   public void deleteLaptop(@PathVariable int laptopsId ) {
	   
	    this.laptopservice.deleteLaptop(laptopsId);
   }
   
   @PostMapping ("/laptops")
   public Laptop addLaptop(@RequestBody Laptop laptop) {
	   
	   return (this.laptopservice.addLaptop(laptop));
   }
}
