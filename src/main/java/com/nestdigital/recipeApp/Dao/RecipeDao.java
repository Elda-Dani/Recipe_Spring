package com.nestdigital.recipeApp.Dao;

import com.nestdigital.recipeApp.Model.RecipeModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipeDao extends CrudRepository<RecipeModel,Integer> {
}
