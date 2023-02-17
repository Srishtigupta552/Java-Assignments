import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc =new Scanner (System.in);
	        Innings e = new Innings();
	        System.out.println("Enter the team name=");
	        e.setTeamname(sc.nextLine());
	        System.out.println("Enter Sessions=");
	        e.setInningsname(sc.nextLine());
	        System.out.println("Enter runs=");
	        e.setRuns(sc.nextInt());
	        
	        e.displayInningsDetails();
	}

}
