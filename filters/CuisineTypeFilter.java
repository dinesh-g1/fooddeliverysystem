package filters;

import models.CuisineType;
import models.FoodItem;

public class CuisineTypeFilter implements FoodItemFilter{
    private final CuisineType cuisineType;

    public CuisineTypeFilter(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }


    @Override
    public boolean filter(FoodItem foodItem) {
        return this.cuisineType.equals(foodItem.getCuisineType());
    }
}
