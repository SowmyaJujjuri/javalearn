
public class Person 
{
	void eatFruit(int fruitType)
	{
		switch(fruitType)
		{
			case 1:
					System.out.println("Eating apple");
					break;
			case 2:
					System.out.println("Eating banana");
					break;
			case 3:
					System.out.println("Eating orange.");
					break;
			case 4:
					System.out.println("Eating grape.");
					break;
			case 5:
					System.out.println("Eating pineapple.");
					break;
			default:
					System.out.println("Dont' know which fruit.");
					break;
		}
	}
}

