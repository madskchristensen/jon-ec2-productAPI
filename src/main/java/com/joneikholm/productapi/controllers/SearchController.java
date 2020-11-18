package com.joneikholm.productapi.controllers;

import com.joneikholm.productapi.model.AJAXrequest;
import com.joneikholm.productapi.model.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    @PostMapping("api/search")
    public ResponseEntity<Result> getSearchResult(@RequestBody AJAXrequest req){
        System.out.println("api/search kaldet med " + req.getProduct());
        Result result = new Result();
        result.getProducts().add("Bicycle");
        result.getProducts().add("Boat");
        result.getProducts().add("Car");
        return ResponseEntity.ok(result);
    }
}
