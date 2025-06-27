package main.java.com.lld.foodsearch.Strategy.impl;

import main.java.com.lld.foodsearch.Model.*;
import main.java.com.lld.foodsearch.Strategy.FoodSearchStrategy;
import main.java.com.lld.foodsearch.collection.FoodCollection;
import main.java.com.lld.foodsearch.collection.RestaurantCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FoodSearchNameStrategy implements FoodSearchStrategy {
    @Override
    public List<Restaurant> searchFood(User user, FoodSort sort, FoodSearch search) {
        Map<Integer, Map<Integer, Dish>> restaurantFoodMap = FoodCollection.getRestaurantFoodMap();
        String userGeoHash = user.getGeoHash();
        String bigGeoHash = userGeoHash.substring(0, userGeoHash.length() - 2);
        List<Restaurant> res = findByName(bigGeoHash, restaurantFoodMap, search.getName());

        //sorting

        return res;
    }

    public static List<Restaurant> findByName(String hash, Map<Integer, Map<Integer, Dish>> restaurantFoodMap, String name) {
        List<Restaurant> res = new ArrayList<>();
        restaurantFoodMap.forEach((k, foodMap) -> {
            Restaurant restaurant = RestaurantCollection.getById(k);
            String restaurantHash = restaurant.getGeoHash();
            restaurantHash = restaurantHash.substring(0, restaurantHash.length() - 2);
            if (restaurantHash.equals(hash)) {
                foodMap.forEach((l, food) -> {
                    if (food.getName().equals(name)) {
                        res.add(restaurant);
                    }
                });
            }
        });

        return res;
    }
}
