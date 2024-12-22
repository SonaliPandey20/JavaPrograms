import java.util.Scanner;
public class SpyNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int sum = 0;
        int prod=1;
        int temp=n;
        while(temp!=0)
        {
            int rem = temp%10;
            sum = sum + rem;
            prod = prod * rem;
            temp = temp/10;
        }
        if(sum==prod)
        {
            System.out.println(n +" is a Spy Number");
        }
        else
        {
            System.out.println(n +" is not a Spy Number");
        }
    }
}
