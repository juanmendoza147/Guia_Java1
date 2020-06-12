import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		float rpt1 = 0 ,rpt2 = 0, rpt3 = 0, rpt4 = 0;
		
		rpt1 = (float) Math.pow(5, 3);
		rpt2 = (float) Math.pow(81,1 /2.0);
		rpt3 = (float) Math.pow(125, 1/3.0);
		rpt4 = (float) Math.pow(256, 1/4.0) + (float)Math.pow(25,1/2.0);
		
		System.out.println("resultado:..");
		System.out.println("respueta 1 :"+rpt1);
		System.out.println("respueta 2 :"+rpt2);
		System.out.println("respueta 3 :"+rpt3);
		System.out.println("respueta 4 :"+rpt4);
	}

}
