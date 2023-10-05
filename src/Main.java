
public class Main {

	public static void main(String[] args) {
		String newString = "";
		for (int i = 1; i < 100; i++) {
			newString = "";
			if (i % 3 == 0) {
				newString += "Fizz";
			}
			if (i % 5 == 0) {
				newString += "Buzz";
			}
			if (newString == "") {
				newString = "" + i;
			}
			System.out.println(newString);
		}
	}
}
