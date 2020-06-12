import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del alumno..:");
		System.out.println("Notas:");
		
		System.out.println("Notas1:");
		float nota1  = sc.nextFloat();
		
		System.out.println("Notas2:");
		float nota2 = sc.nextFloat();
		
		System.out.println("Notas3:");
		float nota3 = sc.nextFloat();
		
		float promedio = (float) ((float)(nota1 * 0.20) + (nota2 * 0.30) + (nota3 * 0.50));
		
		System.out.println("Promedio...:"+promedio);
		

	}

}
