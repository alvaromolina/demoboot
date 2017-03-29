package com.ucbcba.taller.repositories;

import com.ucbcba.taller.entities.Product;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface ProductRepository extends CrudRepository<Product, Integer> {

}