import java.util.Scanner;
class Fibonaccy{
	
	static Scanner sc=new Scanner(System.in);
            public static void main(String args[])
           {
		int a=0,b=1,count;
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=n;i++)
		{	
			count=a+b;
			a=b;
			b=count;
			System.out.println(count);
		}
           }
}