import java.util.Scanner;
public class NeonNum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int square=n*n;
        int sum = 0;
        int temp = n;
        while(square!=0)
        {
            int rem = square%10;
            sum = sum + rem;
            square = square/10;
        }
        if(sum==temp)
        {
            System.out.println(n+" is a Neon Number");
        }
        else
        {
            System.out.println(n+" is not a Neon Number");
        }
    }
    
}
