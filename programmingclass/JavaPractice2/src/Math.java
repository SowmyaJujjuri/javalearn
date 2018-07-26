public class Math 
{
	int previousResult = 0;
	
	int addSpecial(int input)
	{
		int result = previousResult + input;
		previousResult += result;
		return result;
	}
	int getMax(int num1, int num2)
	{
		int result;
		if(num1 > num2)
		{
			result = num1;
		}
		else
		{
			result = num2;
		}
		return result;
	}
	static int add(int num1, int num2)
	{
		return num1+num2;
	}
}
