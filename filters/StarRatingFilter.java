package filters;

import models.FoodItem;
import models.StarRating;

public class StarRatingFilter implements FoodItemFilter{
    private final StarRating starRating;

    public StarRatingFilter(StarRating starRating) {
        this.starRating = starRating;
    }


    @Override
    public boolean filter(FoodItem foodItem) {
        return this.starRating.getVal() >= foodItem.getStarRating().getVal();
    }
}
