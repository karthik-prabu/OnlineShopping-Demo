package com.OnlineShop.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineShop.domain.ShopItem;
import com.OnlineShop.service.JPAInterface;

@RestController
public class RestService {
	@Autowired
	private JPAInterface data;
	
	@RequestMapping("/items")
	public ShopItems getAllProductList(){
		List<ShopItem> allitems = data.findAll();
		System.out.println("Hi Api" +""+allitems.size());
		return new ShopItems( allitems);
	}
	
	@RequestMapping(value="/items", method=RequestMethod.POST )
	public ResponseEntity<ShopItem> newItem(@RequestBody ShopItem item){
		System.out.println("Hi Api add");
		data.save(item);
		return new ResponseEntity<ShopItem>(item,HttpStatus.CREATED);
	}

}
