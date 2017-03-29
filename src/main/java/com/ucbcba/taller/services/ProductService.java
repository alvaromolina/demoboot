package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.Product;

public interface ProductService {

    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

}