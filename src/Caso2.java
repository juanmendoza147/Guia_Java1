import java.util.Scanner;//utilizar la clase para lectura
public class Caso2 {

	public static void main(String[] args) {
		//instancia a la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		//declarar y asignar un valor
		int num =0;
		
		//lectura de datos
		System.out.print("ingrese un n�mero :");
		num =sc.nextInt();
		
		//salida de resultados
		System.out.println("N�mero ingresado : "+ num);		
	}

}
