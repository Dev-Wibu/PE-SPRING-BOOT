package org.tan.hsfpe1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tan.hsfpe1.entity.Food;

public interface FoodRepo extends JpaRepository<Food, Long> {
}
