package Examen;
import java.util.Scanner;
public class Primo {

	public static void main(String[] arg) {
		int numero=0;
		Scanner ent = new Scanner(System.in);
		System.out.println("Buenos dias, soy Ricardo");
		System.out.println("Introduce un numero para ver si es primo o no");
		numero=ent.nextInt();
		int primo=0;
		for(int x=0;x>10; x++) {
		primo = numero/x;	
		if(primo==0) {
			System.out.println("Se puede dividir entre " + x);
		}else if(primo!=0) {
			System.out.println("No se puede dividir entre" + x);
		}
		}
		
		
	}
	
	
}
