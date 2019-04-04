package com.capgemini.capstore.service;

import com.capgemini.capstore.beans.Product;
import com.capgemini.capstore.beans.Wishlist;

public interface WishlistServiceInterface {

	public Wishlist deleteProducts(int customerId, int productId);

	public Wishlist displayProducts(int customerId);

	public Wishlist addProducts(int customerId, int merchantId, Product product);

}
