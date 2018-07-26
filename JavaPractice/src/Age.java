public class Age 
{
	public static void main (String[] args)
	{
		int age = 16;
		
		if(age < 13)
		{
			System.out.println("You are a kid");
		}
		else if(age >= 13 && age <= 19)
		{
			System.out.println("You are a teen");
		}
		else if(age >= 20 && age <= 60)
		{
			System.out.println("You are an adult");
		}
		else
		{
			System.out.println("Senior citizen");
		}
	}
}
