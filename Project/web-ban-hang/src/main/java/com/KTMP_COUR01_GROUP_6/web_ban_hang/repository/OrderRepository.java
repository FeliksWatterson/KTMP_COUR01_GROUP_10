package com.KTMP_COUR01_GROUP_6.web_ban_hang.repository;

import com.KTMP_COUR01_GROUP_6.web_ban_hang.model.Customer;
import com.KTMP_COUR01_GROUP_6.web_ban_hang.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerOrderByOrderDateDesc(Customer customer);
}