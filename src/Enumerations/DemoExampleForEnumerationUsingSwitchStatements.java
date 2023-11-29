package Enumerations;

enum Restaurants {
    dominos, kfc, pizzahut, paninos, burgerking
}

public class DemoExampleForEnumerationUsingSwitchStatements {
    public static void main(String[] args) {
        Restaurants r;
        r = Restaurants.paninos;
        switch (r) { //The name of the enumertion constants are used without their enumeration
            //type name i.e only r, not Restaurants.r
            case dominos: //only constants defined under enum Restaurants can be used
                System.out.println("I AM " + r.dominos);
                break;
            case kfc:
                System.out.println("I AM " + r.kfc);
                break;
            case pizzahut:
                System.out.println("I AM " + r.pizzahut);
                break;
            case paninos:
                System.out.println("I AM " + r.paninos);
                break;
            case burgerking:
                System.out.println("I AM " + r.burgerking);
                break;
        }
    }
}
