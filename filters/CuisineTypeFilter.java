package filters;

import models.FoodItem;

public class CuisineTypeFilter implements FoodItemFilter{
    private final FoodItem foodItem;

    public CuisineTypeFilter(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return this.foodItem.getCuisineType().equals(foodItem.getCuisineType());
    }
}
