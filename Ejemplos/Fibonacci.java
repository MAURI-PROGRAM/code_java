public class Fibonacci{
	public static void main(String args[]){
		int a = 0, b = 1, c = 0;
		while(a < 10){
			System.out.print(a+", ");
			c = a + b;
			a = b;
			b = c;

		}
	}	
}