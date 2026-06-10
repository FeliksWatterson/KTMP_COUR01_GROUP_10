package com.KTMP_COUR01_GROUP_6.web_ban_hang.repository;

import com.KTMP_COUR01_GROUP_6.web_ban_hang.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}