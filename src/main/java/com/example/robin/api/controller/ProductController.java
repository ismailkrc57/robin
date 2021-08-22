package com.example.robin.api.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController("api//products")
public class ProductController {
    @GetMapping("/getall")
    public String getAll() {
        return "Kanka burda kaldım merak etme gümbür gümbür gelecem";
    }

    @GetMapping("getone")
    public String getOnes(){
        return "Karaca";
    }

    @PostMapping("/checkToken")
    public boolean checkToken(@RequestParam String token) {
        return true;
    }
}
