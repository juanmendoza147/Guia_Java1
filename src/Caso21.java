import java.util.Scanner;
public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de la venta:");
		 float num1 = sc.nextInt();
		 
		 
		 float venta = (float)(num1 + num1 * 0.12);
		 
		 System.out.println("resultado .......");
		 System.out.println("Valor de la venta disminuido ...:"+venta);

	}

}