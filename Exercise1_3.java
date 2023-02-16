import java.util.*;
public class Exercise1_3 {
	
	public static void main(String[] as)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer=");
		int n = sc.nextInt();
		int sum=0;
		if(n<0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			for(int i=0; i<=n;i++)
			{
				int a = n%10;
				if(a%2!=0)
				{
					sum+=a;
				}
				n = n/10; 
			}
			System.out.println(sum);
		}
	}
              
	 
}
