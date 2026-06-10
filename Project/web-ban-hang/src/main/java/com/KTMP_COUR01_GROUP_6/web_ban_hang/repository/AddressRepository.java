package com.KTMP_COUR01_GROUP_6.web_ban_hang.repository;

import com.KTMP_COUR01_GROUP_6.web_ban_hang.model.Address;
import com.KTMP_COUR01_GROUP_6.web_ban_hang.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByCustomer(Customer customer);
    Optional<Address> findByCustomerAndIsDefaultTrue(Customer customer);
    long countByCustomer(Customer customer);
}