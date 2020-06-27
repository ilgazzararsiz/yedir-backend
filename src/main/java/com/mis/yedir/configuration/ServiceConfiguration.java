package com.mis.yedir.configuration;

import com.mis.yedir.repository.CategoryRepository;
import com.mis.yedir.repository.IngredientRepository;
import com.mis.yedir.repository.RecipeRepository;
import com.mis.yedir.service.CategoryService;
import com.mis.yedir.service.IngredientService;
import com.mis.yedir.service.RecipeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public CategoryService categoryService(CategoryRepository categoryRepository) {
        return new CategoryService(categoryRepository);
    }

    @Bean
    public IngredientService ingredientService(IngredientRepository ingredientRepository) {
        return new IngredientService(ingredientRepository);
    }

    @Bean
    public RecipeService recipeService(RecipeRepository recipeRepository) {
        return new RecipeService(recipeRepository);
    }
}
