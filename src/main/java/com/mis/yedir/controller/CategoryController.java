package com.mis.yedir.controller;

import com.mis.yedir.model.Category;
import com.mis.yedir.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping(path = "/category")
    public List<Category> getAllCategories() {

        return categoryService.getAll();
    }

    @PostMapping(path = "/category")
    public void createCategory(@RequestBody Category category) {
        categoryService.create(category);
    }
}
