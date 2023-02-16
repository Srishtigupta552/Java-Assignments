import java.util.*;
public class Exercise1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
        System.out.print("Integer=");
        int n = sc.nextInt();
        int mod = n%2;
        if (n<0)
        {
        	System.out.println("Number too small");
        }
        else if(n>32767)
        {
        	System.out.println("Number too large");
        }
        else
        {
           if (mod==0)
            {
        	   
        	   System.out.println("Yes");
            }
           else {
        	System.out.println("No");
             }
        }
	}

}
