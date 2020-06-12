import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Ingrese radio :");
		 float num1 = sc.nextInt();
		 
		 
		 float area = (float) (3.14 * Math.pow(num1, 2));
		 float perimetro = (float) ((float) 2 * 3.14 *num1);
		 
		 System.out.println("Reultado:");
		 System.out.println("Area del circulo.....:" + area);
		 System.out.println("Perimetro....:"+ perimetro);
	}

}
