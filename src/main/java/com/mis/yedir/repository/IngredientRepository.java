package com.mis.yedir.repository;

import com.mis.yedir.model.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IngredientRepository extends MongoRepository<Ingredient, String> {

    List<Ingredient> findAllByCategory_Id(String categoryId);
}
