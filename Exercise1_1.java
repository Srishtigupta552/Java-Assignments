import java.util.*;
public class Exercise1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      Scanner sc = new Scanner (System.in);
              System.out.print("Salary=");
              int salary = sc.nextInt();
              if(salary>8000)
              {
            	  System.out.println("Salary too large");
              }
              else if(salary<0)
              {
            	  System.out.println("Salary too small");
              }
              else
              {
            	  System.out.print("Shift=");
                  int shift = sc.nextInt();
                  if (shift<0)
                  {
                	  System.out.println("Shift too small");
                  }
                  else
                  {
                	  int half = salary/2;
                      int total = half + (salary/100)*(shift*2);
                      System.out.println(total);
                  }
              }
              
              
              
	}

}
