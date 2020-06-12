import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese cantidad :");
		int cantidad = sc.nextInt();
		
		System.out.println("Ingrese precio :");
		float precio = sc.nextFloat();
		
		float importe1 , importe2 , importe3;
		importe1 = cantidad * precio;
		importe2 = (float)(importe1 /3.24);
		importe3 = (float)(importe1 / 3.75);
		
		System.out.println("Importe en soles :"+ importe1);
		System.out.println("Importe en dolares :"+ importe2);
		System.out.println("Importe en euro : "+ importe3);
		
		
		


	}

}
