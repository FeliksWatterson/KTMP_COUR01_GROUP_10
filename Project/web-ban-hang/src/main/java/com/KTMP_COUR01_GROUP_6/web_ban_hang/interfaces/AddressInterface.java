package com.KTMP_COUR01_GROUP_6.web_ban_hang.interfaces;

import com.KTMP_COUR01_GROUP_6.web_ban_hang.model.Address;
import com.KTMP_COUR01_GROUP_6.web_ban_hang.model.Customer;

import java.util.List;
import java.util.Optional;

public interface AddressInterface {
    List<Address> findAddressesByCustomer(Customer customer);
    Optional<Address> findDefaultAddressByCustomer(Customer customer);
    Address saveAddress(Address address);
    Optional<Address> findByIdAndCustomer(Long id, Customer customer);
    void deleteAddress(Long id, Customer customer);
    void setDefaultAddress(Long id, Customer customer);
    long countAddressesByCustomer(Customer customer);
}