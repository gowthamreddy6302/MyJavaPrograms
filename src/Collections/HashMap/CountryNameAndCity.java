package Collections.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountryNameAndCity {
    static Map<String,List<City>> countryDetails = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("HI USER, HOW MANY COUNTRY'S U WANT TO WANT TO HAVE :");
        int countryCount = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < countryCount; i++){
            System.out.println("ENTER YOUR COUNTRY " + (i + 1) + " DETAILS");
            System.out.print("ENTER COUNTRY NAME : ");
            String countryName = sc.nextLine();
            System.out.print("ENTER HOW MANY CITY YOU WANT TO ADD IN COUNTRY : ");
            int cityCount = sc.nextInt();
            sc.nextLine();
            List<City> cities = new ArrayList<>();
            for(int j = 0; j < cityCount; j++){
                System.out.println("ENTER YOUR CITY " + (j + 1) + " NAME");
                System.out.print("ENTER CITY NAME :");
                String cityName = sc.nextLine();
                System.out.println("ENTER POPULATION OF YOUR COUNTRY : ");
                long pCount = sc.nextLong();
                sc.nextLine();
                System.out.println("ENTER FAMOUS FOOD IN YOUR CITY : ");
                String famousFood = sc.nextLine();
                System.out.println("ENTER YOUR FAMOUS PALCE IN YOUR COUNTRY : ");
                String famousPlace = sc.nextLine();
                System.out.println("ENTER THE FAMOUS PLACE ADDRESS IN YOUR CITY : ");
                String famousPlaceAddress = sc.nextLine(); 
                FamousPlace famousplaceObj = new FamousPlace(famousPlace, famousPlaceAddress);
                City city = new City(cityName, pCount, famousFood, famousplaceObj);
                cities.add(city);
            }
            countryDetails.put(countryName, cities);
        }
        System.out.println("HERE ARE THE COUNTRIES DETAILS : ");
        printCountriesDetails(countryDetails);
    }
    private static void printCountriesDetails(Map<String, List<City>> countryDetails) {
        for(Map.Entry<String, List<City>> entry : countryDetails.entrySet()){
            System.out.println("COUNTRY NAME : " + entry.getKey());
            //VALUE IN THE MAP IS NOTHING BUT LIST OF CITIES
            //SO WE ARE ITERATING THROUGH EACH CITY AND PRINTING THEIR DETAILS
            System.out.println("-----------CITY DETAILS----------");
            for(City city : entry.getValue()){
                System.out.println(city.toString());
            }
        }
    }
}
