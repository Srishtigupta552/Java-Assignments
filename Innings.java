import java.util.Scanner;

public class Innings {
	private String teamname;
	private String inningsname;
	private int runs;
	
	public void displayInningsDetails()
	{
		
		System.out.println("Employee details");
        System.out.println(getTeamname());
        System.out.println(getInningsname());
        System.out.println(getRuns());
		if(this.getInningsname().equals("First")) 
		{
			System.out.println("Need "+ (getRuns()+1) + " to win");
		}
		else
		{
			System.out.println("Match Ended");
		}
		
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getInningsname() {
		return inningsname;
	}

	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	

}
