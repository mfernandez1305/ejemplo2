package practica;
import java.util.Scanner;
public class e2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	System.out.print("ingrese nota 1:");
	double nota1 = s.nextDouble();
	System.out.print("ingrese nota 2:");
	double nota2 = s.nextDouble();
	System.out.print("ingrese nota 3:");
	double nota3 = s.nextDouble();
	
	double promedio = (nota1+nota2+nota3)/3;
	System.out.print("promedio: " +promedio);
	
	

	

	}

}
