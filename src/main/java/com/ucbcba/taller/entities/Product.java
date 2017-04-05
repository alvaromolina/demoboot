package com.ucbcba.taller.entities;

import javax.persistence.*;
import java.math.BigDecimal;

import static sun.rmi.transport.TransportConstants.Version;

/**
 * Product entity.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;


    @ManyToOne
    @JoinColumn(name="product_category_id")
    private ProductCategory productCategory;

    private String productId;
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public String getProductCategoryName() {
        return productCategory == null ? "" : productCategory.getName();
    }
}