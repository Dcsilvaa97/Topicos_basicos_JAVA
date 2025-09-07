package exercicio_SPLIT;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String s = "potato apple lemon";
		String[ ] vect = s.split(" ");
		String w = vect [0];
		String w1 = vect[1];
		String w2 = vect[2];
		System.out.println(w);
		System.out.println(w1);
		System.out.println(w2);
		sc.close();

	}

}
