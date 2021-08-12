package com.example.robin.api.controller;

import com.example.robin.business.abstracts.ICategoryService;
import com.example.robin.core.utilities.results.DataResult;
import com.example.robin.core.utilities.results.Result;
import com.example.robin.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/categories")
public class CategoryController {
    private final ICategoryService iCategoryService;

    @Autowired
    public CategoryController(ICategoryService iCategoryService) {
        this.iCategoryService = iCategoryService;
    }

    @GetMapping("/getall")
    public DataResult<List<Category>> getAll() {
        return iCategoryService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Category category){
        return iCategoryService.add(category);
    }
}
