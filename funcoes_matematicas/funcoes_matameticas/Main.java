package funcoes_matameticas;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a , b , c;
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		System.out.println("A raiz quadrade de " + x + " é igual a " + a);
		System.out.println("A raiz quadrade de " + y + " é igual a " + b);
		System.out.println("A raiz quadrade de " + z + " é igual a " + c);
		
		System.out.println();
		
		a = Math.pow(x, y);
		b = Math.pow(x,2.0);
		c = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " é igual a " + a);
		System.out.println(x + " elevado ao quadrado " + " é igual a " + b);
		System.out.println("5 elevado ao quadrado é igual a " + c);
		
		System.out.println();
		a = Math.abs(y);
		b = Math.abs(z);
		System.out.println("O valor absoluto de " + y + " é igual a " + a);
		System.out.println("O valor absoluto de " + z + " e igual a " + b);

	}

}
