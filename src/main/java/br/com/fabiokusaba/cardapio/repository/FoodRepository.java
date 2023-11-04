package br.com.fabiokusaba.cardapio.repository;

import br.com.fabiokusaba.cardapio.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
