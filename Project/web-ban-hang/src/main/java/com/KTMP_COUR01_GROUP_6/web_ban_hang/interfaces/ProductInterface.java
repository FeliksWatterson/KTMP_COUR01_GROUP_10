package com.KTMP_COUR01_GROUP_6.web_ban_hang.interfaces;

import com.KTMP_COUR01_GROUP_6.web_ban_hang.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductInterface {
    Optional<Product> findProductById(Long id);
    List<Product> findAllProducts();
    List<Product> findNewProducts(int limit); 
    List<Product> findBestSellingProducts(int limit); 
    List<Product> findHighlyRatedProducts(int limit); 
    List<Product> findProductsOnSale(int limit); 
}