public class Q9 {
	public static void main(String[] args){
		int x = 5;
		int y = 0;
		try{
			int a = x / y; 
		}
		catch (ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
	}
}