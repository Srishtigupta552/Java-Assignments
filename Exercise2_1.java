import java.util.*;
public class Exercise2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer=");
        int n = sc.nextInt();
        int[] a = new int[n];
        if(n>0)
         {
           for (int i=0; i<n;i++)
          {
        	a[i]=sc.nextInt();
        	if(a[i]<0)
        	{
        		System.out.println("Invalid input");
        	}
        	else
        	{
        		continue;
        	}
          }
        
          int sum1=0;
 	      int sum2=0;
          for( int i=0;i<n;i++)
        	  
           {
         	if(a[i]%2==0)
         	{
     
         		 sum1= sum1+a[i];
         	}
         	else
         	{
         		sum2=sum2+a[i];
         	}
         	
         	
           }
    
          if(sum1>sum2)
          {
        	  System.out.println(+sum1);
          }
          else
          {
        	  System.out.println(+sum2);
          }
       
        } 
        else
        {
        	System.out.println("Invalid array size");
        }
        
	   
	}


}
