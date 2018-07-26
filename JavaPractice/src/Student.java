public class Student 
{
	int grade;
	
	public Student(int grade)
	{
		this.grade = grade;
	}
	
	public void term(String className)
	{
		checkOutTextbook(className);
		bringToClass(className);
	}
	private void checkOutTextbook(String className)
	{
		System.out.println("Get the " + className + " textbook");
	}
	private void bringToClass(String className)
	{
		System.out.println("Bring your textbook to " + className);
	}
	
}
