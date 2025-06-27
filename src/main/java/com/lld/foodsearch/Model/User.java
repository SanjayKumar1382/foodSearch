package main.java.com.lld.foodsearch.Model;

import lombok.Builder;
import lombok.Data;
import main.java.com.lld.foodsearch.Enums.RestaurantStatus;
import main.java.com.lld.foodsearch.Enums.UserStatus;
import main.java.com.lld.foodsearch.Enums.UserType;

@Data
@Builder
@Table("user")
@Entity
public class User {

    @Id
    private Integer id;

    private String name;

    private String email;

    private int mobile;
    private double latitude;
    private double longitude;
    private String geoHash;
    private UserStatus status;
    private UserType userType;
}
