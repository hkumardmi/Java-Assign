package java_assign;
import java.util.Scanner;


public class Mycalculater
{
	public void Pow()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int p = sc.nextInt();
		if (n < 0 || p < 0)
		{
			throw new  ArithmeticException("n and p should be non-negative");
		}
		else
		{
			int temp= 1;
			temp = (int) Math.pow(n, p);
			System.out.println("Result is "+temp);
		}
	}
	public static void main (String[] args)
	{
		Mycalculater mycal = new Mycalculater();
		mycal.Pow();
	}
}
