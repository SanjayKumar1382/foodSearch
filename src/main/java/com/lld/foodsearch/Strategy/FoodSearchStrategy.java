package main.java.com.lld.foodsearch.Strategy;

import main.java.com.lld.foodsearch.Model.*;

import java.util.List;

public interface FoodSearchStrategy {
    List<Restaurant> searchFood(User user, FoodSort sort , FoodSearch search);
}
