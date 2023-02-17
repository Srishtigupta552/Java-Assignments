import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner sc =new Scanner (System.in);
        Employee e = new Employee();
        System.out.println("Enter the Name=");
        e.setName(sc.nextLine());
        System.out.println("Enter Address=");
        e.setAddress(sc.nextLine());
        System.out.println("Enter Mobile=");
        e.setMobile(sc.nextLine());
        
        System.out.println("Employee details");
        System.out.println(e.getName());
        System.out.println(e.getAddress());
        System.out.println(e.getMobile());
        
	}

}
