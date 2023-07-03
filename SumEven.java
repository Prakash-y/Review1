package Review1;

public class SumEven {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		for(int i =2; i<=50; i++)
		{
			if(i%2 == 0)
			{
				count++;
				sum = sum + i;
			}
		}
		System.out.println("Count even number : "+ count);
		System.out.println("Sum of even number :"+ sum);
	}
}
