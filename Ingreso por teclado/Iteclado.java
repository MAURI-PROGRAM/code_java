import java.util.Scanner;

public class Iteclado{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		String nombre = "";
		int num_uno = 0 , num_dos = 0 , resultado = 0;

		System.out.println("¡Cual es tu nombre?");
		nombre = in.nextLine();

		System.out.println("Primer numero");
		num_uno = in.nextInt();

		System.out.println("Segundo numero");
		num_dos = in.nextInt();

		resultado = num_uno + num_dos;

		System.out.println("Hola "+nombre+" El resultado de la suma es: "+resultado);


	}
}