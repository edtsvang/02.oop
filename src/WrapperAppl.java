
public class WrapperAppl {

	public static void main(String[] args) {
		
		//Integer x = new Integer(10);
		Integer x = 10; //autoboxing
		//Boolean bo = true;
		
		System.out.println(x*2); //autounboxing
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);

		int res = Integer.parseInt("11111");
		System.out.println(res * 2);
		//res = Integer.parseInt("11saA111");
		//System.out.println(res);
		boolean flag = Boolean.parseBoolean("tRuE");
		System.out.println(flag);
		flag = Boolean.parseBoolean("tRuEeeee");
		System.out.println(flag);
		double y = Double.parseDouble("3.14");
		System.out.println(y);
		
		res = Integer.parseInt("111111", 2);
		System.out.println(res);
		res = Integer.parseInt("111111", 8);
		System.out.println(res);
		res = Integer.parseInt("111111", 16);
		System.out.println(res);
		
		System.out.println(Integer.toString(res));
		System.out.println(Integer.toString(res, 2));
		System.out.println(Integer.toString(res, 8));
		System.out.println(Integer.toBinaryString(res));

		System.out.println(Double.toHexString(y));
		Byte b = 10;
		Integer i = 10;
		System.out.println(b.equals(i));
		
		printNumber(i);
		printNumber1(res);
		
		//Integer[] array = {1,2,3,4};
		//printArray(array);
		
		System.out.println(Integer.sum(res, res));
		System.out.println(Integer.min(res, 10));
		System.out.println(Integer.max(res, i));

		System.out.println(Double.NaN);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);

		double temp = 0.0 / 0;
		//if(Double.isNaN(temp) || Double.isInfinite(temp));
		//System.out.println("Wrong result");
		//else
		//System.out.println("Res = " + temp);
		
		System.out.println(Boolean.logicalAnd(false, true));
		System.out.println(Boolean.logicalOr(false, true));
		System.out.println(Boolean.logicalXor(false, true));

		
	if(Boolean.logicalOr(Double.isNaN(temp), Double.isInfinite(temp)))
	System.out.println("Wrong result");
	else
	System.out.println("Res = " + temp);
	
	System.out.println(Character.isAlphabetic('c'));
	System.out.println(Character.isLetter('c'));
	System.out.println(Character.isDigit('c'));
	System.out.println(Character.isLetterOrDigit('c'));
	System.out.println(Character.isLowerCase('c'));
	System.out.println(Character.isUpperCase('c'));
	System.out.println(Character.isWhitespace('c'));




	}
	
	public static void printNumber(int x) {
		System.out.println("Your number is " + x);	
	}
	public static void printNumber1(Integer x) {
		System.out.println("Your number is " + x);	
	}
	public static void printArray(int[] array) {
		System.out.println("print array");
	}
	
}
