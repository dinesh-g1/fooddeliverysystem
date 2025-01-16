package apis;

import dao.SearchFoodItem;
import filters.FoodItemFilter;
import filters.MealTypeFilter;
import models.CuisineType;
import models.FoodItem;
import models.MealType;
import models.StarRating;

import java.util.List;

public class FoodItemSearcher {
    public List<FoodItem> searchFoodItems(String itemName,
                                          MealType mealType, List<CuisineType> cuisines,
                                          StarRating rating) {
        return  null;
    }
}
