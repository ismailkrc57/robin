package com.example.robin.api.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api//products")
public class ProductController {
    @RequestMapping("/getall")
    public String getAll()
    {
        return "Kanka burda kaldım merak etme gümbür gümbür gelecem";
    }
}
