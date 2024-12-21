import java.util.Scanner;
public class StrongNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int originalNum = n;
        int sumOfFactorials = 0;

        while (n > 0) 
        {
            int digit = n % 10; 
            int fact = 1;
            for (int i = 1; i <= digit; i++) 
            {
                fact *= i;
            }
            sumOfFactorials += fact;
            n /= 10;
        } 
        if (sumOfFactorials == originalNum) 
        {
            System.out.println(originalNum + " is a Strong Number.");
        } 
        else 
        {
            System.out.println(originalNum + " is not a Strong Number.");
        }
    }
}
