package source;

public class Yoda {

	public static void main(String[] args) {
		
		final String str = null;
		
		try {
			if(str.equals("...")) {
			}
			System.out.println("1. Success");

		} catch(Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			if("...".equals(str)) {
			}
			System.out.println("2. Success");

		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
