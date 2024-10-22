import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
        }
        else
        {
            day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
        }
        hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);
        System.out.println("\nYour birth year is " + year + " on the month of " + month + " on the day of " + day + " on the hour of " + hour + " on the minute of " + minute + ".");
    }
}
