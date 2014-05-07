package ejemplos;
import java.util.Scanner;
public class e1 {

	public static void main(String[] args) {
	Scanner r=new Scanner (System.in);
	System.out.print("Ingrese un Numero 1:");
	int num1= r.nextInt();
	System.out.print("Ingrese un Operador:");
	char operador= r.next().charAt(0);
	System.out.print("Ingrese un Numero 2:");
	int num2= r.nextInt();
	
	switch (operador)
	{
	case '+':
		System.out.print("Resultado:" +(num1+num2));
	}
		
		
			
			
			
			
	
	
	}
	
			
	
	

	}

}
