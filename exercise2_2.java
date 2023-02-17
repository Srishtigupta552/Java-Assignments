import java.util.*;
public class exercise2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("Enter size of array=");
         n = sc.nextInt();
        int[] b = new int[n];
        if(n>0) {
        for (int i=0; i<n;i++)
        {
         	b[i]=sc.nextInt();
        	if(b[i]<0)
        	{
        		System.out.println("Invalid input");
        	
        	}
        	else
        	{
        		continue;
        	}
         }
        System.out.println("Enter given score");
        int a= sc.nextInt();
        if(a>0) {
        for(int i=1;i<n;i=i+2)
        {
        	
        	if(b[i]>a)
        	{
        		System.out.print((b[i-1])+" ");
        	}
        	else
        	{
        		continue;
        	}
        }
        }
        else
        {
        	System.out.println("Invalid score");
        }
        }
        else
        {
        	System.out.println("Invalid array size");
        }
              
	}

}
