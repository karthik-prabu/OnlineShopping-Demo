package com.OnlineShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineShop.domain.ShopItem;
import com.OnlineShop.service.JPAInterface;

@Controller
public class ShoppingController {

	@Autowired
	private JPAInterface data;
	
	@RequestMapping("/website/allitem.html")
	public ModelAndView getAllProductList(){
		List<ShopItem> allitems = data.findAll();
		System.out.println("Hi");
		return new ModelAndView("allitems","ShopItems",allitems );
	}
	
	@RequestMapping(value="/website/newitem.html", method=RequestMethod.POST )
	public String newItem(ShopItem item){
		data.save(item);
		return "redirect:/website/allitem.html";
	}

	@RequestMapping(value="/website/newitem.html", method=RequestMethod.GET )
	public ModelAndView newItemrenderform(){
		ShopItem item = new ShopItem();
		return new ModelAndView("newItem","form",item);
	}

}
