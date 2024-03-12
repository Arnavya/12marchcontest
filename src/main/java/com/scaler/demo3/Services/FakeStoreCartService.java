package com.scaler.demo3.Services;

import com.scaler.demo3.Models.Cart;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreCartService implements CartService {

    private RestTemplate restTemplate = new RestTemplate();
    private String url = "https://fakestoreapi.com/";
    @Override
    public List<Cart> getAllProducts() {
        List<Cart> allProducts = restTemplate.exchange(
                url + "products",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Cart>>() {
                }
        ).getBody();
        return allProducts;
    }
}
