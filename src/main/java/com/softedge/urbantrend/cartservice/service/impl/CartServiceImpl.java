package com.softedge.urbantrend.cartservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softedge.urbantrend.cartservice.model.Cart;
import com.softedge.urbantrend.cartservice.model.Order;
import com.softedge.urbantrend.cartservice.repository.CartRepository;
import com.softedge.urbantrend.cartservice.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart findCartByCustomerId(long customerId) {
		return cartRepository.findCartByCustomerId(customerId);
	}

	@Override
	public Cart addOrUpdateCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public void deleteCartById(String cartId) {
		cartRepository.deleteById(cartId);		
	}	
}