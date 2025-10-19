package utilities;

import java.util.Scanner;

public class IO 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt) 
    {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) 
        {
            System.out.print("Invalid input. Try again: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
    
    

    public static void print(String message) 
    {
        System.out.println(message);
    }
}
