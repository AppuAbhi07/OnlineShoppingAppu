package assertion;

public class Home {

	public static void main(String[] args) {

		int x = 10;

		/*
		 * assert(x>100); System.out.println(x);
		 */
		assert (x > 100) : "here x value should be <10";
		System.out.println(x);
	}

}
