package com.project.services;

import java.util.List;

import com.project.entities.Shop;
import com.project.module.dto.ShopDto;

public interface ShopService {
	
	ShopDto addItem(ShopDto item);
	void deleteItem(int id);
	ShopDto updateItem(ShopDto shopDto, int id);
	List<ShopDto> getAllItem();
	List<ShopDto> getItemByCategory(String category); 
	List<Shop> findByCategory(String category);
	//String saveImage(String fileName, String category, String description, String name, String price, String enrollment,
			//String title, String contact,MultipartFile multipartFile) throws IOException;
	String findEnrollmentByuid(Integer uid);
	
}
