public class RationalTester{

	public static void main(String[] args) {
		RationalNumber r1 = new RationalNumber(6, 8);
		RationalNumber r2 = new RationalNumber(1, 3);
		
		System.out.println("First rational number: " + r1);
		System.out.println("Second rational number: " + r2);
		
		int comparable = r1.compareTo(r2);
		if (comparable == 0)
			
			System.out.println("r1 and r2 are equal.");
		else if (comparable < 0)
			System.out.println("r1 is less than r2");
		else
			System.out.println("r1 is greater than r2");
		RationalNumber r3 = new RationalNumber(6, 7);
		
		RationalNumber r4 = new RationalNumber(4, 8);
		System.out.println("Third rational number: " + r3);

		System.out.println("Fourth rational number: " + r4);
		comparable = r3.compareTo(r4);
		if (comparable == 0)
			System.out.println("r3 and r4 are equal.");
		else if (comparable < 0)
			System.out.println("r3 is less than r4");
		else
			System.out.println("r3 is greater than r4");
		
		RationalNumber r5 = new RationalNumber(2, 3);
		
		RationalNumber r6 = new RationalNumber(4, 5);
		
		RationalNumber r7 = new RationalNumber(2, 3);
		System.out.println("Third rational number: " + r5);

		System.out.println("Fourth rational number: " + r6);
		comparable = r5.compareTo(r6);
		if (comparable == 0)
			System.out.println("r5 and r6 are equal.");
		else if (comparable < 0)
			System.out.println("r5 is less than r6");
		else
			System.out.println("r5 is greater than r6");
		
		comparable = r6.compareTo(r7);
		if (comparable == 0)
			System.out.println("r6 and r7 are equal.");
		else if (comparable < 0)
			System.out.println("r6 is less than r7");
		else
			System.out.println("r6 is greater than r7");
	
	}

}//end class
