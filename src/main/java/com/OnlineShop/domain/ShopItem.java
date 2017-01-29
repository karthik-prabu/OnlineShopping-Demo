package com.OnlineShop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class ShopItem {

		@GeneratedValue(strategy=GenerationType.AUTO)
		@Id
		private long id;
		private String name;
		private int quantity;
		
		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public ShopItem() {}
		
		public ShopItem(String name, int quantity){
			this.name = name;
			this.quantity = quantity;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public ShopItem(String name) {
			this.name = name;
		}

		public String toString()
		{
			return this.name + " Quantity "  + this.quantity;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}		
	}
