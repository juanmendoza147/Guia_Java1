import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer Numero");
		float n1 = sc.nextFloat();
		
		System.out.print("Segundo Numero");
		float n2 = sc.nextFloat();
		
		float suma = n1+n2;
		float resta = n1-n2;
		float producto =n1*n2;
		float division =n1/n2;
		float resto_entero =n1 % n2;
		System.out.println("Resultado");
		System.out.println("=========");
		System.out.println("Suma:..."+ suma);
		System.out.println("resta:..."+resta);
		System.out.println("producto:..."+producto);
		System.out.println("division..."+division);
		System.out.println("resto entero :...."+resto_entero);
		

	}

}
