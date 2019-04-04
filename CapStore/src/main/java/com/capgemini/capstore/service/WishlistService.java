package com.capgemini.capstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.capstore.beans.Customer;
import com.capgemini.capstore.beans.Merchant;
import com.capgemini.capstore.beans.Product;
import com.capgemini.capstore.beans.Wishlist;
import com.capgemini.capstore.dao.CapStoreCustomer;
import com.capgemini.capstore.dao.CapStoreMerchant;
import com.capgemini.capstore.dao.CapStoreProduct;
import com.capgemini.capstore.dao.CapStoreWishlist;


@Service
public class WishlistService implements WishlistServiceInterface
{
	@Autowired
	CapStoreWishlist wishlistDao;
	
	@Autowired
	CapStoreCustomer customerDao;
	
	@Autowired
	CapStoreProduct productDao;
	
	@Autowired
	CapStoreMerchant merchantDao;
	
	
	 Wishlist wishlist= new Wishlist();
	 Merchant merchant= new Merchant();
	

	@Override
	public Wishlist addProducts( int customerId, int merchantId,  Product product) 
	{	
		Customer customer = customerDao.findById(customerId).get();	
		/*System.out.println("**"+customer.getCustomerName()+"**");
		System.out.println("#################"+wishlist.getCustomer());*/
		wishlist.setCustomer(customer);
		wishlist.setProduct(product);
		merchant= merchantDao.findById(merchantId).get();
		wishlist.setMerchant(merchant);
		wishlist.setId(101);
		wishlistDao.save(wishlist);
		return wishlist;
	}

	@Override
	public Wishlist deleteProducts(int customerId, int productId) 
	{
		return null;
	}

	@Override
	public Wishlist displayProducts(int wishlistId) 
	{
		Wishlist wishlist = wishlistDao.findById(wishlistId).get();	
		return wishlist;
	}

}
