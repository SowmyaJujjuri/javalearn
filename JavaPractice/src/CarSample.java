public class CarSample 
{
	String name;
	int horsePower;
	boolean start = false;
	
	public void start()
	{
		if(start)
		{
			System.out.println(name + " has already started, please stop it first.");
		}
		else
		{
			System.out.println("starting: " + name + " which has " + horsePower + " horse power");	
			start = true;
		}
	}
	public void stop()
	{
		if(start)
		{
			System.out.println("stopping " + name);
			start = false;
		}
		else
		{
			System.out.println("Sorry, " + name + " has already stopped");
		}
		
	}
}
