import java.util.Scanner;
public class DisariumNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int count = 0;
        while (temp != 0)
        {
            temp = temp / 10;
            count++;
        }   
        temp=n;
        while (temp != 0)
        {
            int rem = temp % 10;
            sum = sum + (int) Math.pow(rem, count);
            temp = temp / 10;
            count--;
        }
        if (sum == n)
        {
            System.out.println(n + " is a Disarium number");
        }
        else
        {
            System.out.println(n + " is not a Disarium number");
        }
    }
}
