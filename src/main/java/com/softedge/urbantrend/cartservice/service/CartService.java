package com.softedge.urbantrend.cartservice.service;

import com.softedge.urbantrend.cartservice.model.Cart;

public interface CartService {
	
	public Cart findCartByCustomerId(long customerId);
	public Cart addOrUpdateCart(Cart cart);
	public void deleteCartById(String cartId);
}