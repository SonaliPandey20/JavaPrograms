import java.util.Scanner;
public class PalindromeNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        int n = num;
        while (n != 0)
        {
        int rem = n % 10;
        rev = rev * 10 + rem;
        n = n / 10;
        }
        if (num == rev)
        {
            System.out.println(num + " is a palindrome number");
        }
        else
        {
            System.out.println(num + " is not a palindrome number");
        }
    }
}