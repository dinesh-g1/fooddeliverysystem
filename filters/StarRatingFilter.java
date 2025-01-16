package filters;

import models.FoodItem;

public class StarRatingFilter implements FoodItemFilter{
    private final FoodItem foodItem;

    public StarRatingFilter(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return this.foodItem.getStarRating().getVal() >= foodItem.getStarRating().getVal();
    }
}
