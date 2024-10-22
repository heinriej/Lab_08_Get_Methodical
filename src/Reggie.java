import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN: " + SSN);

        String MNum = SafeInput.getRegExString(in, "Enter your M Number", "^(M|m)\\d{5}$");
        System.out.println("Your M Number: " + MNum);

        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", "^[OoSsVvQq]$");
        System.out.println("Your menu choice: " + menuChoice);
    }
}
