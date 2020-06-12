import java.util.Scanner;
public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del producto :");
		System.out.println("Precio :");
		float precio = sc.nextFloat();
		
		System.out.println("Cantidad :");
		float cantidad = sc.nextFloat();
		
		float calculo = precio * cantidad;
		float igv = (float)(calculo/0.18);
		float importe = (float)(calculo/0.3);
		float total = (float)(igv + importe);
		
		
		
		System.out.println("resultado...:");
		System.out.println("Precio :"+calculo);
		System.out.println("IGV :"+igv);
		System.out.println("Descuento :"+importe);
		System.out.println("Total :"+total);
				
		
		
	}

}
