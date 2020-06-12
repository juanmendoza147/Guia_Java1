import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese lado :");
		 float num1 = sc.nextFloat();
		
		 System.out.println("Ingrese lado :");
		 float num2 = sc.nextFloat();
		 
		 System.out.println("Ingrese lado :");
		 float num3 = sc.nextFloat();
		 
		 float perimetro = num1 + num2 + num3;
		 
		 System.out.println("Resultado...");
		 System.out.println("Perimetro....:"+perimetro);

	}

}
