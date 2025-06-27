package main.java.com.lld.foodsearch.Strategy;

import main.java.com.lld.foodsearch.Model.Restaurant;
import main.java.com.lld.foodsearch.Model.RestaurantSort;
import main.java.com.lld.foodsearch.Model.User;

import java.util.List;

public interface RestaurantSearchStrategy {
    List<Restaurant> searchRestaurant();
}
