package com.learning.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.dto.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {
	Boolean existsByFoodName(String foodName);
	Optional<List<Food>> findByFoodType(String foodType);
	boolean existsById(int id);
}
