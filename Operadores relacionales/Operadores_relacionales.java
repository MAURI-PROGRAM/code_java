import java.util.Scanner;

public class Operadores_relacionales{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		String nombre = "";
		int clave = 0, antiguedad = 0;
		System.out.println("*************************************");
		System.out.println("*Bien venido al sistema de vacaiones*");
		System.out.println("*************************************");
		System.out.println("");
		System.out.println("");

		System.out.println("¿Cual es el nombre del trabajador?");
		nombre = entrada.nextLine();
		System.out.println("");

		System.out.println("¿Cual es el tiempo de servicio que tiene el trabajador?");
		antiguedad = entrada.nextInt();
		System.out.println("");

		System.out.println("¿Cual es la clave del trabajador?");
		clave = entrada.nextInt();
		System.out.println("");

		int dias_vacaiones = 0;
		String mensaje_error = "";

		if(clave == 1){
			if(antiguedad == 1){
				dias_vacaiones = 6;
			}else if(antiguedad >= 2){
				dias_vacaiones = 14;
			}else if(antiguedad >= 7){
				dias_vacaiones = 20;
			}else{
				mensaje_error="debe de tener mas de un año de trabajo";
			}
		}else if(clave == 2){
			if(antiguedad == 1 ){
				dias_vacaiones = 7;
			}else if(antiguedad >= 2){
				dias_vacaiones = 15;
			}else if(antiguedad >= 7){
				dias_vacaiones = 22;
			}else{
				mensaje_error="debe de tener mas de un año de trabajo";
			}
			
		}else if(clave == 3){
			if(antiguedad == 1 ){
				dias_vacaiones = 10;
			}else if(antiguedad >= 2){
				dias_vacaiones = 20;
			}else if(antiguedad >= 7){
				dias_vacaiones = 30;
			}else{
				mensaje_error="debe de tener mas de un año de trabajo";
			}
		}else{
			mensaje_error = "La clave esta incorrecta" + mensaje_error;
		}

		if (dias_vacaiones > 0){
			System.out.println("El trabajador: "+nombre+" tiene derecho a: "+dias_vacaiones+" dias de vacaiones");
		}else{
			System.out.println(mensaje_error);
		}

	}
}