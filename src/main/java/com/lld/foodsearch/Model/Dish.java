package main.java.com.lld.foodsearch.Model;

import lombok.Data;
import main.java.com.lld.foodsearch.Enums.RestaurantStatus;
import main.java.com.lld.foodsearch.Enums.UserType;

@Data
public class Dish {
    private Integer id;
    private Integer restaurantId;
    private String name;
    private String rating;
    private String description;
    private RestaurantStatus status;
}
