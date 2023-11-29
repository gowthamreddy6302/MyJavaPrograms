package Collections.HashMap;

public class City {
    private String cityName;
    private long population;
    private String famousFood;
    private FamousPlace famousPlace;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getFamousFood() {
        return famousFood;
    }

    public void setFamousFood(String famousFood) {
        this.famousFood = famousFood;
    }

    public FamousPlace getFamousPlace() {
        return famousPlace;
    }

    public void setFamousPlace(FamousPlace famousPlace) {
        this.famousPlace = famousPlace;
    }

    public City(String cityName, long population, String famousFood, FamousPlace famousPlace) {
        this.cityName = cityName;
        this.population = population;
        this.famousFood = famousFood;
        this.famousPlace = famousPlace;
    }

    public City() {
    }

    @Override
    public String toString() {
        return "cityName='" + cityName + '\'' +
                " : population=" + population +
                " : famousFood=" + famousFood + '\'' + "\n" +
                "----------famous Place Details---------------" + "\n" + famousPlace.toString();
    }
}
