import java.util.*;
public class SchoolTypeApp 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("What grade are you in? ");
		int grade = scanner.nextInt();
		
		if(grade <= 5)
		{
			System.out.println("Elementary School");
		}
		else if(grade >= 6 && grade <= 8 )
		{
			System.out.println("Middle School");
		}
		else if(grade >= 9 && grade <= 12)
		{
			System.out.println("High School");
		}
		else
		{
			System.out.println("College");
		}
	}
}
