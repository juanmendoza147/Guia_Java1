import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer producto :");
		float n1 = sc.nextFloat();
		
		System.out.print("Segundo producto :");
		float n2 = sc.nextFloat();
		
		float rpta1 = (n1 + n2)/2;
		float rpta2 = (float)(n1 + n1 * 0.20);
		float rpta3 = (float)(n2 - n2 * 0.30);
		
		System.out.println("Resultado");
		System.out.println("=========");
		System.out.println("resutado 1:..."+rpta1);
		System.out.println("resutado 2:..."+rpta2);
		System.out.println("resutado 3:..."+rpta2);
		

	}

}
