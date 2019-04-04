package com.capgemini.capstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capstore.beans.Product;
import com.capgemini.capstore.beans.Wishlist;
import com.capgemini.capstore.service.WishlistServiceInterface;

@RestController
public class CapStoreController {

	@Autowired
	WishlistServiceInterface wishlistService;

	@PostMapping("/addProduct/{custId}/{merchId}")
	public ResponseEntity<Wishlist> addProductToWishlist(@PathVariable("custId") Integer custId,
			@PathVariable("merchId") Integer merchId, @RequestBody Product product) {
		Wishlist wishlist= wishlistService.addProducts(custId, merchId, product);
		if (wishlist==null || wishlist.equals(' '))
			 return new ResponseEntity<Wishlist>(HttpStatus.NOT_FOUND);
		 return new ResponseEntity<Wishlist>(wishlist,HttpStatus.OK); 

	}
	@GetMapping("/showWishlist/{wishId}")
	public ResponseEntity<Wishlist> showWishlist(@PathVariable("wishId") Integer wishId) {
		Wishlist wishlist= wishlistService.displayProducts(wishId);
				if (wishlist==null || wishlist.equals(' '))
			 return new ResponseEntity<Wishlist>(HttpStatus.NOT_FOUND);
		 return new ResponseEntity<Wishlist>(wishlist,HttpStatus.OK); 

	}
	

}
