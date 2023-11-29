package Enumerations;

public class DemoExample {
    enum WeekDays{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
        public static void main(String[] args)
        {
            WeekDays wk,wkM; //wk is an enumeration variable of type WeekDays
            wk = WeekDays.SUNDAY;
            wkM = WeekDays.MONDAY; //wk can be assigned only the constants
            // defined under enum type Weekdays
            System.out.println("Today is "+wk);
            System.out.println(wkM);
        }
    }
