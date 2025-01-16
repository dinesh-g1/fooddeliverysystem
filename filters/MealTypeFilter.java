package filters;

import models.FoodItem;

public class MealTypeFilter implements FoodItemFilter{
    private final FoodItem foodItem;

    public MealTypeFilter(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return this.foodItem.getMealType().equals(foodItem.getMealType());
    }
}
