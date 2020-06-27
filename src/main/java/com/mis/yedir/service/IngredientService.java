package com.mis.yedir.service;

import com.mis.yedir.model.Ingredient;
import com.mis.yedir.repository.IngredientRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public List<Ingredient> getAll() {
        return ingredientRepository.findAll();
    }

    public void create(Ingredient ingredient) {
        ingredientRepository.save(ingredient);
    }
}
