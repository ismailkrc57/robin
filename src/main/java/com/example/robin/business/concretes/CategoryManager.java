package com.example.robin.business.concretes;

import com.example.robin.business.abstracts.ICategoryService;
import com.example.robin.core.utilities.results.DataResult;
import com.example.robin.core.utilities.results.Result;
import com.example.robin.core.utilities.results.SuccessDataResult;
import com.example.robin.core.utilities.results.SuccessResult;
import com.example.robin.dataAccess.abstracts.ICategoryDao;
import com.example.robin.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements ICategoryService {
    private ICategoryDao iCategoryDao;

    @Autowired
    public CategoryManager(ICategoryDao iCategoryDao) {
        this.iCategoryDao = iCategoryDao;
    }

    @Override
    public DataResult<List<Category>> getAll() {
        return new SuccessDataResult<>(iCategoryDao.findAll());
    }

    @Override
    public Result add(Category category) {
        iCategoryDao.save(category);
        return new SuccessResult("category added");
    }
}
