package main.java.com.lld.foodsearch.Model;

import lombok.Data;
import main.java.com.lld.foodsearch.Enums.RestaurantSortKey;
import main.java.com.lld.foodsearch.Enums.SortType;

@Data
public class RestaurantSort {
    private final RestaurantSortKey key;
    private final SortType type;
}
