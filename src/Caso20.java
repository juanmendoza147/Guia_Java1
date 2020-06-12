import java.util.Scanner;
public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de la venta:");
		 float num1 = sc.nextInt();
		 
		 
		 float venta = (float)(num1 + num1 * 0.42);
		 
		 System.out.println("resultado .......");
		 System.out.println("Valor de la venta aumentado ...:"+venta);

	}

}
