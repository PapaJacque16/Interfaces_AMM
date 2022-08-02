public class RationalNumber implements Comparable <RationalNumber> {

	private int numerator, denominator;

	public RationalNumber(int numer, int denom) 
	{
		if (denom == 0)
			denom = 1;

		// Make the numerator "store" the sign
		if (denom < 0) 
		{
			numer = numer * -1;
			denom = denom * -1;
		}
		numerator = numer;
		denominator = denom;
		
		reduce();
	}

	//return numerator
	public int getNumerator() 
	{
		return numerator;
	}//end numerator
	
	//return denominator
	public int getDenominator() 
	{
		return denominator;
	}//end denominator

	public RationalNumber reciprocal() {
		return new RationalNumber(denominator, numerator);
	} //end reciprocal

	//add rational numbers
	public RationalNumber add(RationalNumber op2) {
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int sum = numerator1 + numerator2;

		return new RationalNumber(sum, commonDenominator);
	} //end add

	//subtract rational numbers
	public RationalNumber subtract(RationalNumber op2) {
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int diff = numerator1 - numerator2;

		return new RationalNumber(diff, commonDenominator);
	} //end subtract

	public RationalNumber multiply(RationalNumber op2)
	{
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();

		return new RationalNumber(numer, denom);
	} //end multiply

	//divide rational numbers
	public RationalNumber divide(RationalNumber op2) 
	{
		return multiply(op2.reciprocal());
	} //end divide

	 public boolean isLike(RationalNumber op2)
	    {
	        return (numerator == op2.getNumerator() &&
	                denominator == op2.getDenominator());
	    }

	public String toString() 
	{
		String result;

		if (numerator == 0)
			result = "0";
		else if (denominator == 1)
			result = numerator + "";
		else
			result = numerator + "/" + denominator;

		return result;
	} //end toString

	// Reduced form
	private void reduce() 
	{
		if (numerator != 0) 
		{
			int common = gcd(Math.abs(numerator), denominator);
			numerator = numerator / common;
			denominator = denominator / common;
		}
	} // End Reduce

	private int gcd(int numerator1, int numerator2) 
	{
		while (numerator1 != numerator2)
			if (numerator1 > numerator2)
				numerator1 = numerator1 - numerator2;
			else
				numerator2 = numerator2 - numerator1;
		return numerator1;
	} //end gcd

	@Override
	public int compareTo(RationalNumber o) {
		double divide1 = (double) this.numerator / (double) this.denominator;
		double divide2 = (double) o.numerator / (double) o.denominator;
		if ((this.numerator == o.getNumerator() && this.denominator == o.getDenominator())
				|| (Math.abs(divide1 - divide2) < 0.0001)) 
		{
			return 0;
		} else if ((divide1 - divide2) < 0) {
			return -1;
		} else {
			return 1;
		}

	}
} // end class