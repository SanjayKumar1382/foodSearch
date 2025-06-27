package main.java.com.lld.foodsearch.Model;

import lombok.Data;
import main.java.com.lld.foodsearch.Enums.FoodSortKey;
import main.java.com.lld.foodsearch.Enums.RestaurantSortKey;
import main.java.com.lld.foodsearch.Enums.SortType;

@Data
public class FoodSort {
    private FoodSortKey key;
    private SortType type;
}
