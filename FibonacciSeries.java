import java.util.Scanner;
public class FibonacciSeries 
{    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i,j,z;
        i=0;
        j=1;
        System.out.println("Fibonacci Series");
        System.out.println(i);
        System.out.println(j);
        for(int l=2;l<num;l++)
        {
            z=i+j;
            System.out.println(z);
            i=j;
            j=z;
        }
    }
}


