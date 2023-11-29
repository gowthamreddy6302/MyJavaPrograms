package Enumerations;
enum WeekDays1 {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class DEEUsingTransversingEE {
        public static void main(String[] args)
        {
            WeekDays1[] weekDays = WeekDays1.values();
            for(WeekDays1 weekday : weekDays ){
                System.out.println(weekday);
            }
        }
    }