package com.joneikholm.productapi.model;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private List<String> products = new ArrayList<>();
    public Result() {
    }

    public List<String> getProducts() {
        return products;
    }

}
