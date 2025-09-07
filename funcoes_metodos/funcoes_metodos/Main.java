package funcoes_metodos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int x = sc.nextInt();
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		
		int higher = max(x,x1,x2);
		
		showResult(higher);
		sc.close();
	}
	
	public static int max(int a , int b , int c) {
		int aux;
		if(a > b && a > c) {
			aux = a;
		}
		else if (b > a && b > c) {
			aux = b;
		}
		else {
			aux = c;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
