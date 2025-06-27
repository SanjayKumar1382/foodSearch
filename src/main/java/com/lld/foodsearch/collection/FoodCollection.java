package main.java.com.lld.foodsearch.collection;

import lombok.Data;
import lombok.Getter;
import main.java.com.lld.foodsearch.Model.Dish;

import java.util.HashMap;
import java.util.Map;

@Data
@Getter
public class FoodCollection {

    static Map<Integer, Map<Integer, Dish>> restaurantFoodMap = new HashMap<>();

    public static boolean addDish(Dish dish) {
        Map<Integer, Dish> dishMap = restaurantFoodMap.getOrDefault(dish.getRestaurantId(), new HashMap<>());
        dishMap.put(dish.getId(), dish);
        restaurantFoodMap.put(dish.getRestaurantId(), dishMap);

        return true;
    }

    public static Map<Integer, Map<Integer, Dish>> getRestaurantFoodMap() {
        return restaurantFoodMap;
    }

}
