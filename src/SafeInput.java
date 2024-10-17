import java.util.Scanner;

public class SafeInput
{
    /**
     * gets a String value from the user which must be at least one character
     *
     * @param pipe scanner to use to read the input
     * @param prompt prompt to tell the user what to input
     * @return String that is at least one character
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.isEmpty())
            {
                System.out.println("You must enter at least one character!");
            }
        }while(retVal.isEmpty());

        return retVal;
    }

    /**
     * gets an unconstrained int value from the user
     *
     * @param pipe scanner to use for input
     * @param prompt prompt to tell the user what to input
     * @return am unconstrained int value
     */

    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash + ".");
            }
        }while(!done);

        return retVal;
    }

    /**
     * gets an unconstrained double value from the user
     *
     * @param pipe scanner to use for input
     * @param prompt prompt to tell the user what to input
     * @return am unconstrained double value
     */

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not " + trash + ".");
            }
        }while(!done);

        return retVal;
    }

    /**
     * gets an int value from the user within the specified inclusive range
     *
     * @param pipe scanner to use for input
     * @param prompt prompt to tell the user what to input
     * @return an int value within the specified range
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a valid int in range [" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash + ".");
            }
        }while(!done);

        return retVal;
    }

    /**
     * gets a double value from the user within the specified inclusive range
     *
     * @param pipe scanner to use for input
     * @param prompt prompt to tell the user what to input
     * @return a double value within the specified range
     */

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a valid double in range [" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not " + trash + ".");
            }
        }while(!done);

        return retVal;
    }

    /**
     * get a string value from the user of [Yy/Nn]
     *
     * @param pipe Scanner to use to read the input
     * @param prompt prompt to tell the user what to input
     * @return true for Yy (yes) and false for Nn (no)
     */

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String input = "";
        boolean retVal = false;
        boolean done = false;

        do
        {
            System.out.print(prompt + "[Yy/Nn]: ");
            input = pipe.nextLine();
            if (input.isEmpty())
            {
                System.out.println("You must enter Yy or Nn!");
            }
            else if (input.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if (input.equalsIgnoreCase("N"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.println("You must enter Yy or Nn! Not: " + input + ".");
            }
        }while(!done);

        return retVal;
    }
}
