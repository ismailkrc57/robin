package com.example.robin.business.abstracts;

import com.example.robin.core.utilities.results.DataResult;
import com.example.robin.core.utilities.results.Result;
import com.example.robin.entities.concretes.Category;

import java.util.List;

public interface ICategoryService {
    DataResult<List<Category>> getAll();
    Result add(Category category);
}
