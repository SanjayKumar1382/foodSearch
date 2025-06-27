package main.java.com.lld.foodsearch.collection;

import lombok.Data;
import lombok.Getter;
import main.java.com.lld.foodsearch.Model.Restaurant;

import java.util.HashMap;
import java.util.Map;

@Data
@Getter
public class RestaurantCollection {

    static Map<Integer, Restaurant> restaurants = new HashMap<>();

    public static boolean addRestaurant(Restaurant restaurant) {
        restaurants.put(restaurant.getId(), restaurant);
        return true;
    }

    public static Restaurant getById(Integer id) {
//        restaurants.put(restaurant.getId(), restaurant);
        return restaurants.get(id);
    }

    public static Map<Integer, Restaurant> getRestaurants() {
        return restaurants;
    }

}
