import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Ingrese lado 1:");
		 int num1 = sc.nextInt();
		 
		 System.out.println("Ingrese lado 2");
		 int num2 = sc.nextInt();
		 
		 int area = num1 * num2;
		 int perimetro = num1*2 + num2*2;
		 
		 System.out.println("Reultado:");
		 System.out.println("Area....:" + area);
		 System.out.println("Perimetro....:"+ perimetro);
	}

}
