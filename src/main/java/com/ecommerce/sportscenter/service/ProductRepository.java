package com.ecommerce.sportscenter.service;

import com.ecommerce.sportscenter.model.ProductResponse;

import java.util.List;

public interface ProductRepository {
    ProductResponse getProductById(Integer productId);
    List<ProductResponse> getProducts();
}
