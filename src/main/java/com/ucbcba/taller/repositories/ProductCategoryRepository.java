package com.ucbcba.taller.repositories;

import com.ucbcba.taller.entities.ProductCategory;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by amolina on 05/04/17.
 */
@Transactional
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {

}