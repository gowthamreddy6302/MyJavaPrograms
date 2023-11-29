package Collections;

import java.util.ArrayList;
import java.util.List;

public class Restaurent {
    protected List<String> menuItems;
    protected List<Integer> iteamCount;
    protected List<Double> price;
    protected List<Integer> rating;
    
    public Restaurent() {
        this.menuItems = new ArrayList<>();
        this.iteamCount = new ArrayList<>();
        this.price = new ArrayList<>();
        this.rating = new ArrayList<>();
    }
}
