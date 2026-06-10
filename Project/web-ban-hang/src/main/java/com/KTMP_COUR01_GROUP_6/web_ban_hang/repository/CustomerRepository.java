package com.KTMP_COUR01_GROUP_6.web_ban_hang.repository;

import com.KTMP_COUR01_GROUP_6.web_ban_hang.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email);
}
