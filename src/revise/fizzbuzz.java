package revise;

public class fizzbuzz {

	public static void main(String[] args) {
		
		
		for(int a = 0; a <= 20; a++) {
			System.out.println(fizzbuz(a));
		}
		
		

	}
	
	public static String fizzbuz(int x) {
		
		if(x % 15 == 0) {
			return "fizzbuzz";
		}
		else if (x % 5 == 0) {
			return "buzz";
		}
		else if (x % 3 == 0) {
			return "fizz";
		}
		
		return String.valueOf(x);
	}

}
