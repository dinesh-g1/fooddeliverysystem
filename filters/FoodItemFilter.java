package filters;

import models.FoodItem;

public interface FoodItemFilter {
    boolean filter(FoodItem foodItem);
}
