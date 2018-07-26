
public class MyHomeworkDataSample 
{
	public static void main(String[] args)
	{
		CarSample c1 = new CarSample();
		c1.name = "bmw";
		c1.horsePower = 200;
		c1.start();
		//Start one more time and see what happens
		c1.start();
		c1.stop();
		
		CarSample c2 = new CarSample();
		c2.name = "honda";
		c2.horsePower = 50;
		c2.start();
		c2.stop();
		
	}
	
}
