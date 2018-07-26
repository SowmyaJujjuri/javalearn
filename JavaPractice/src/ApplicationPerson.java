
public class ApplicationPerson 
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Sowmya", 17);
		p1.printDetails();
		
		boolean drivable = p1.canDrive();
		
		Player one = new Player();
		one.play();
		one.getScore();
		one.getScore(10);
	}
}
