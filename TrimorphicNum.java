import java.util.Scanner;
public class TrimorphicNum 
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int cube = n*n*n;
        boolean flag=true;
        if(n!=0)
        {
            if(n%10!=cube%10)
            {
                flag=false;
            }
        }
        if(flag)
        {
            System.out.println(n+" is a trimorphic number");
        }
        else
        {
            System.out.println(n+" is not a trimorphic number");
        }
    }
}
