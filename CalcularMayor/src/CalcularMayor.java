
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcularMayor {

	
//	Calcular el mayor de tres números enteros en Java.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("intorduce un numero");
		int a = sc.nextInt();
		System.out.println("intorduce otro numero");
		int b = sc.nextInt();
		System.out.println("intorduce otro numero");
		int c = sc.nextInt();
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		
		calcularMayor(lista);
	}
	
	private static void calcularMayor(List<Integer> entrada) {
		int resultado = 0 ;
		for (Integer integer : entrada) {
			if(integer>resultado)resultado = integer;
		}
		
		System.out.println("El numero mayor es "+resultado);
	}
	
}
