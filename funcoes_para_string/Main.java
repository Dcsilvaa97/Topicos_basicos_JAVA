package funcoes_para_string;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String original = "abcde FGHIJ ABC DEFG ";
		String s01 = original.toLowerCase();// deixa letra maiuscula
		String s02 = original.toUpperCase();// deixa letra minuscula
		String s03 = original.trim();// corta os espacos em volta
		String s04 = original.substring(2);//corta e começa do caracter especificado
		String s05 = original.substring(2, 9);//corta e começa e termina até o caracter especificado
		String s06 = original.replace('a','x'); // Troca uma letra que vc especificou , por outra letra especificada
		String s07 = original.replace("abc", "xy"); // serve para trocar substring(palavras , trechos) por outra substring especifica
		int i = original.indexOf("bc"); // mostra qual posição esta a palavra especificada
		int j = original.lastIndexOf("BC");// mostra qual a é ultima posiçao da palavra especificada
		
		System.out.println("Original: - " + original + "-");
		System.out.println("toLowerCase -"  + s01 + "-");
		System.out.println("toUpperCase -" + s02 + "-");
		System.out.println("Trim -" + s03 + "-");
		System.out.println("Substring(2) -" + s04 + "-");
		System.out.println("Substring(2 a 9)-" + s05 + "-");
		System.out.println("Replace('a','x')-" + s06 + "-");
		System.out.println("Replace('abc', 'xy')-"+ s07 + "-");
		System.out.println("indexOf('bc')-" + i + "-");
		System.out.println("lastIndexOf('bc')-" + j + "-");
		sc.close();
		
	}
	

}
