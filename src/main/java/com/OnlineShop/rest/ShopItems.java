package com.OnlineShop.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.OnlineShop.domain.ShopItem;

@XmlRootElement(name = "ShopItems")
public class ShopItems {

	private List<ShopItem> items;

	public ShopItems(){	
	}

	public ShopItems(List<ShopItem> allitems) {
		this.items = allitems;
	}
	
	@XmlElement(name="Shopitem")
	public List<ShopItem> getItems() {
		return items;
	}

	public void setItems(List<ShopItem> items) {
		this.items = items;
	}
	
	
	
	
}
