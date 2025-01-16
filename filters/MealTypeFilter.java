package filters;

import models.FoodItem;
import models.MealType;

public class MealTypeFilter implements FoodItemFilter{
    private final MealType mealType;

    public MealTypeFilter(MealType mealType) {
        this.mealType = mealType;
    }


    @Override
    public boolean filter(FoodItem foodItem) {
        return this.mealType.equals(foodItem.getMealType());
    }
}
