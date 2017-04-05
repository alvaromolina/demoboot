package com.ucbcba.taller.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by amolina on 05/04/17.
 */
@Entity
@Table(name = "product_category")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy="productCategory", cascade = CascadeType.ALL)
    private Set<Product> products;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private Set<Product> getProducts() {
        return products;
    }


}
