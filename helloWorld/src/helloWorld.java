import java.util.Scanner;  
public class helloWorld
{	

	public static void main(String[] args)	
	{ 
		Scanner sc = new Scanner(System.in);  
		System.out.println("What would you like string a to be? ");
		String a = sc.nextLine();  
		System.out.println("what would you like string b to be? ");
		String b = sc.nextLine();
	//	System.out.println(" my");
		sc.close();
		
		if(b.equals(""))
		{
			System.out.println(a);
		}
		else if(a.length() == 0)
		{
			System.out.println(b);
		}
		else
		{
			String str = mergeString(a,b);
			System.out.println(str);
		}	
	}

	public static String mergeString(String a, String b)
	{
		String c = "";
		String result = "";
		String end = "";
		System.out.println("a length: " + a.length());
		System.out.println("b length: " + b.length());
		if(a.length() < b.length())
		{
			c = b.substring(a.length());
			b = b.substring(0, a.length());
		}
		else if(b.length() < a.length())
		{
			c = a.substring(b.length());
			a = a.substring(0, b.length());
		}
		else
		{
			c = "";
		}
		
		for(int i = 0; i < a.length(); i++)
		{
			result += "" + a.charAt(i) + b.charAt(i);
		}
		end = (String)result + c;
		return end;
	}
}
