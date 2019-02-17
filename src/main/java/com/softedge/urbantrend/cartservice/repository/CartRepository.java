package com.softedge.urbantrend.cartservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.softedge.urbantrend.cartservice.model.Cart;

@Repository
public interface CartRepository extends MongoRepository<Cart, String> {
	
	public Cart findCartByCustomerId(long customerId);
}
