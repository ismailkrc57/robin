package com.example.robin.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController("api//products")
public class ProductController {
    @GetMapping("/getall")
    public String getAll()
    {
        return "Kanka burda kaldım merak etme gümbür gümbür gelecem";
    }
    @GetMapping("getone")
    public String getOnes()
    {
        return   "KARACA";
    }
}
