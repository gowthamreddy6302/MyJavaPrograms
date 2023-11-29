package Collections.HashMap;

public class FamousPlace {

    private String placeName;
    private String placeAddress;
    public String getPlaceName() {
        return placeName;
    }
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
    public String getPlaceAddress() {
        return placeAddress;
    }
    public void setPlaceAddress(String placeAddress) {
        this.placeAddress = placeAddress;
    }
    public FamousPlace(String placeName, String placeAddress) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
    }
    public FamousPlace() {
    }
    @Override
    public String toString() {
        return "FamousPlace='" + placeName + '\'' + 
        " : placeAddress='" + placeAddress + '\'';
    }

    
    
}
