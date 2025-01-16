package models;

public class FoodItem {
    private final int id;
    private String name;
    private String description;
    private String imageUrl;
    private double price;
    private MealType mealType;
    private CuisineType cuisineType;
    private StarRating starRating;
    private final int restaurantId;
    private boolean isAvailable;

    public FoodItem(int id, int restaurantId) {
        this.id = id;
        this.restaurantId = restaurantId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getPrice() {
        return price;
    }

    public MealType getMealType() {
        return mealType;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public StarRating getStarRating() {
        return starRating;
    }
}
