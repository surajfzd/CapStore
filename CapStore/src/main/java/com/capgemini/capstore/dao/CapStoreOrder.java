package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Order;
@Repository
public interface CapStoreOrder extends JpaRepository<Order, Integer>{

}
