package com.mis.yedir.controller;

import com.mis.yedir.model.Ingredient;
import com.mis.yedir.model.Recipe;
import com.mis.yedir.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping(path = "/recipe")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAll();
    }

    @PostMapping(path = "/recipe")
    public void getAllIngredients(@RequestBody Recipe recipe) {
        recipeService.create(recipe);
    }

    @PostMapping(path = "/search-recipe")
    public List<Recipe> search(@RequestBody List<Ingredient> ingredients) {
        return recipeService.searchRecipe(ingredients);
    }
}
