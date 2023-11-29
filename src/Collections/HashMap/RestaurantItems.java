package Collections.HashMap;

public class RestaurantItems {
    private double prices;
    private int rating;
    private int itemCount;

    public RestaurantItems(double prices, int rating, int itemCount) {
        this.prices = prices;
        this.rating = rating;
        this.itemCount = itemCount;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public RestaurantItems() {
    }

    @Override
    public String toString() {
        return "prices : " + prices + "  Rs. -" +
                " rating : " + rating + " - Star -" +
                " itemCount : " + itemCount;
            }
}
