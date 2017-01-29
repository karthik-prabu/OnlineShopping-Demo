package com.OnlineShop.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineShop.domain.ShopItem;

public interface JPAInterface extends JpaRepository<ShopItem, Long>{

	
}
