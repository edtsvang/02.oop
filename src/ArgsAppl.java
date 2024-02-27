
public class ArgsAppl {

	public static void main(String[] args) {
		System.out.println(args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
	System.out.println("Res = " + calculator(args));
	}
	
	public static double calculator(String[] array) {
		if(array.length < 3) {
			System.out.println("Wrong arguments");
		return Double.NaN;
	}

		double x = Double.parseDouble(array[0]);
		double y = Double.parseDouble(array[1]);
		
		switch (array[2]) {
		case "add": 
			return x + y;
		case "sub": 
			return x - y;
		case "mul": 
			return x * y;
		case "div": 
			return x / y;
		default:
			System.out.println("Wrong Operator");
			return Double.NaN;
			}
}
}
