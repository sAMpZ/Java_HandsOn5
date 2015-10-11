import java.util.Scanner;

public class Jonah {

	public static void main(String[] args) {

		//object which performs multiplication
		Jonah1 jonah = new Jonah1();
		Jonah2 jonah2 = new Jonah2();

		Scanner scanner = new Scanner(System.in);

		// get user input
		System.out.println("Enter the first number");
		String input_1 = scanner.next();

		System.out.println("Enter the second number");
		String input_2 = scanner.next();

		
		String result1 = jonah.performOperration(input_1, input_2);
		System.out.println(result1);
		
		String result2 = jonah2.performOperration(input_1, input_2);
		System.out.println(result2);
		

		scanner.close();

	}
}

//base class defining operation method and input result
abstract class BaseJonah {

	public abstract Integer operation(int a, int b);

	public abstract Float operation(float a, float b);

	public String performOperration(String input_1, String input_2) {

		String result;
		// tries to parse the sting input first as integer then float & calls
		try {
			int number = Integer.parseInt(input_1);
			int number_2 = Integer.parseInt(input_2);
			result = operation(number, number_2).toString();

		} catch (NumberFormatException e) {

			try {
				float number = Float.parseFloat(input_1);
				float number_2 = Float.parseFloat(input_1);
				result = operation(number, number_2).toString();

			} catch (NumberFormatException x) {

				result = "An integer or float was not passed";
			}

		}

		return result;

	}

}
//class implementing multiplication
class Jonah1 extends BaseJonah {

	@Override
	public Integer operation(int a, int b) {

		return a * b;
	}
	@Override
	public Float operation(float a, float b) {

		return a * b;
	}
}

//class implementing addition
class Jonah2 extends BaseJonah {

	@Override
	public Integer operation(int a, int b) {

		return a + b;
	}

	@Override
	public Float operation(float a, float b) {

		return a + b;
	}
}
