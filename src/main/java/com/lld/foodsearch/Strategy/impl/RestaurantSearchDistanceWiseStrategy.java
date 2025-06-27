package main.java.com.lld.foodsearch.Strategy.impl;

import lombok.Builder;
import lombok.Data;
import main.java.com.lld.foodsearch.Model.Restaurant;
import main.java.com.lld.foodsearch.Model.RestaurantSort;
import main.java.com.lld.foodsearch.Model.User;
import main.java.com.lld.foodsearch.Strategy.RestaurantSearchStrategy;
import main.java.com.lld.foodsearch.collection.RestaurantCollection;

import java.util.ArrayList;
import java.util.List;

//@Builder
@Data
public class RestaurantSearchDistanceWiseStrategy implements RestaurantSearchStrategy {

    private final User user;
    private final RestaurantSort sort;

    @Override
    public List<Restaurant> searchRestaurant() {
        String userGeoHash = user.getGeoHash();
        String bigGeoHash = userGeoHash.substring(0, userGeoHash.length() - 2);

        List<Restaurant> restaurants = findByHash(bigGeoHash);
        if (sort != null) {
            //get elment form factory
            //sorting stratgegy
        }

        return restaurants;
    }

    public List<Restaurant> findByHash(String hash) {
        List<Restaurant> res = new ArrayList<>();
        RestaurantCollection.getRestaurants().forEach((k, v) -> {
            String restaurantHash = v.getGeoHash();
            restaurantHash = restaurantHash.substring(0, restaurantHash.length() - 2);
            if (restaurantHash.equals(hash)) {
                res.add(v);
            }
        });

        return res;
    }
}
