package main.java.com.lld.foodsearch.Model;

import lombok.Builder;
import lombok.Data;
import main.java.com.lld.foodsearch.Enums.RestaurantStatus;

@Data
@Builder
public class Restaurant {
    private Integer id;
    private String Name;
    private double Rating;
    private double Latitude;
    private double Longitude;
    private String GeoHash;
    private RestaurantStatus status;
}
