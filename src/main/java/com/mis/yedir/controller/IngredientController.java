package com.mis.yedir.controller;

import com.mis.yedir.model.Ingredient;
import com.mis.yedir.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class IngredientController {

    private final IngredientService ingredientService;

    @GetMapping(path = "/ingredient")
    public List<Ingredient> getAllIngredients() {
        return ingredientService.getAll();
    }

    @PostMapping(path = "/ingredient")
    public void getAllIngredients(@RequestBody Ingredient ingredient) {
        ingredientService.create(ingredient);
    }

    @GetMapping(path = "/ingredient/{categoryId}")
    public List<Ingredient> getAllIngredientsByCategoryId(@PathVariable String categoryId) {
        return ingredientService.getAllByCategoryId(categoryId);
    }
}
