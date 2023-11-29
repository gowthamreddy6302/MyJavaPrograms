package Enumerations;

enum WeekDays {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class DEFEUsingIf_Else {
    public static void main(String args[]) {
        WeekDays1 weekDays = WeekDays1.WEDNESDAY;
        if (weekDays == WeekDays1.SUNDAY || weekDays == WeekDays1.SATURDAY)
            System.out.println("It is Weekend");
        else
            System.out.println("It is weekday: " + weekDays);
    }
}