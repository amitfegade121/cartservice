package com.softedge.urbantrend.cartservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softedge.urbantrend.cartservice.model.Cart;
import com.softedge.urbantrend.cartservice.service.CartService;

@RestController
@RequestMapping("/api")
public class CartResource {

	@Autowired
	private CartService cartService;

	@GetMapping("/carts/{customerId}")
	public ResponseEntity<Cart> findCartByCustomerId(@PathVariable long customerId) {
		return new ResponseEntity<Cart>(cartService.findCartByCustomerId(customerId), HttpStatus.OK);
	}

	@PostMapping("/carts")
	public ResponseEntity<Cart> addNewCart(@RequestBody Cart cart) {
		return new ResponseEntity<Cart>(cartService.addOrUpdateCart(cart), HttpStatus.OK);
	}

	@PutMapping("/carts")
	public ResponseEntity<Cart> updateCart(@RequestBody Cart cart) {
		return new ResponseEntity<Cart>(cartService.addOrUpdateCart(cart), HttpStatus.OK);
	}

	@DeleteMapping("/carts/{cartId}")
	public ResponseEntity<Void> deleteCartById(@PathVariable String cartId) {
		cartService.deleteCartById(cartId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
