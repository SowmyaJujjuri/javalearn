public class Person 
{
	String name;
	int age;

	public Person(String inputName, int inputAge)
	{
		name = inputName;
		age = inputAge;
	}
	public void printDetails()
	{
		System.out.println("name is: " + name);
		System.out.println("age is: " + age);
	}
	public void doHomeWork()
	{
		System.out.println("reading homework");
	}
	public int readBook(String bookName)
	{
		System.out.println("Reading book here");
		return 10;
	}
	boolean canDrive()
	{
		 if(age >= 15)
		 {
             return true;        
         }
		 else
		 {
             return false;      
         }
	}
}
