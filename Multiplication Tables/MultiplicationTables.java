import java.util.Scanner;

public class MultiplicationSanjay
{
	public static void main (String[] args)
	{
		char retry = 'Y';
		while (retry == 'Y')
		{
			int i = 1;
			Scanner input = new Scanner(System.in);
			System.out.printf("Enter number for its Multiplication Table: ");
			int number = input.nextInt(); 
			System.out.print("Enter the length of the table; ");
			int length = input.nextInt();
			for (i = 1; i <= length; i++)
			{
				System.out.printf("%d x %d = %d\n", number, i, number*i);
			}
			System.out.print("Do you wish to check another table?[Y/N]: ");
			retry = input.next().charAt(0);
		}
		System.out.println("Program exit!");
	}
}
