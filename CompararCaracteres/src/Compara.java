import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un caracter");
		char a = sc.next().charAt(0);
		System.out.println("Introduce otro caracter");
		char b = sc.next().charAt(0);
		sc.close();
		if(a==b)System.out.println("Los caracteres son iguales");
		else System.out.println("los caracteres son diferentes");
		
	}

}
