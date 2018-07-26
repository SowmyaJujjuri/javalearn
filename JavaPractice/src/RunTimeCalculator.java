import java.util.*;
public class RunTimeCalculator 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many laps did you run? ");
		int laps = scanner.nextInt();
		System.out.println("How much time did each lap take? ");
		int time = scanner.nextInt();
		
		int total = laps * time;
		
		System.out.println("The total time taken: " + total);
	}
	
}
