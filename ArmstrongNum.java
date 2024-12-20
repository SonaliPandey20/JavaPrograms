import java.util.Scanner;
public class ArmstrongNum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum = 0;
        int num = n;
        int temp = n;
        int count = 0;
        while (temp != 0) 
        {
            temp /= 10;
            count++;
        }
        temp = n;
        while (temp != 0)
        {
            int r = temp % 10;
            sum = sum + (int) Math.pow(r, count);
            temp /= 10;
        }
        if (sum == n)
        {
            System.out.println(n + " is an Armstrong Number");
        }
        else
        {
            System.out.println(n + " is not an Armstrong Number");
        }
    }
}
