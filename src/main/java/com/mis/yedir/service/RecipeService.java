package com.mis.yedir.service;

import com.mis.yedir.model.Ingredient;
import com.mis.yedir.model.Recipe;
import com.mis.yedir.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public void create(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    public List<Recipe> searchRecipe(List<Ingredient> ingredients) {

        List<Recipe> recipes = recipeRepository.findAllByIngredientsContains(ingredients);
        return recipes;
    }
}
