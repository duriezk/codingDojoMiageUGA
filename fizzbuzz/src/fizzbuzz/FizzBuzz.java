package fizzbuzz;

public class FizzBuzz {
	
	private int number;
	
	public FizzBuzz(int i) {
		this.number = i;
	}

	@Override
	public String toString() {
		String result ="";
		
		
		
		
		if ((this.number % 5 == 0 && this.number % 3 == 0) || (Integer.toString(number).contains("3") && Integer.toString(number).contains("5")))
			return "FizzBuzz";
		if ((this.number % 5 == 0 && Integer.toString(number).contains("3")) || (this.number % 3 == 0 &&  Integer.toString(number).contains("5")))
			return "BuzzFizz";
		if (this.number % 3 == 0 || Integer.toString(number).contains("3"))
			return "Fizz";
		if (this.number % 5 == 0 || Integer.toString(number).contains("5"))
			return "Buzz";
		return Integer.toString(number);
	}

}
