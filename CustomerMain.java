import java.util.*;
public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Customer c = new Customer();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the details:");
      String s = sc.nextLine();
      String[] arr = s.split(",");
      
          c.setName(arr[0]);
    	  c.setMobile(arr[2]);
    	  c.setAddress(arr[1]);
      
      System.out.println("Name: "+c.getName());
      System.out.println("Address: "+c.getAddress());
      System.out.println("Mobile: "+c.getMobile());
      
	}

}
