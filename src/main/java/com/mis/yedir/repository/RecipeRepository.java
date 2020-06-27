package com.mis.yedir.repository;

import com.mis.yedir.model.Ingredient;
import com.mis.yedir.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RecipeRepository extends MongoRepository<Recipe, String> {

    public List<Recipe> findAllByIngredientsContaining(List<Ingredient> ingredients);
}
