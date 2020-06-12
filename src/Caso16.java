import java.util.Scanner;
public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese horas trabajadas...:");
		float horas = sc.nextFloat();
		
		System.out.println("Ingrese tarifa por hora....:");
		float tarifa = sc.nextFloat();
		
		float sueldo = horas * tarifa ;
		float bono = (float) ((float) horas + tarifa * 0.25);
		float total = sueldo + bono;
		float tdolares =(float) (total / 3.24);
		
		System.out.println("Resultados.....");
		System.out.println("---------------");
		System.out.println("Sueldo....:"+sueldo);
		System.out.println("Bono......:"+bono);
		System.out.println("Total......:"+total);
		System.out.println("Total en dolares....:"+tdolares);
		

	}

}
