package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Wishlist;
@Repository
public interface CapStoreWishlist extends JpaRepository<Wishlist, Integer>{

}
