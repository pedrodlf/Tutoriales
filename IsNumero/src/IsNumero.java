import java.text.ParseException;
import java.util.Scanner;

import javax.xml.bind.helpers.ParseConversionEventImpl;

public class IsNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un valor");
		String a  =  sc.next();
		sc.close();
		if(isNum(a))analizar(a);
		
		
		
		
		
	} 
	
	
	private static void analizar(String entrada) {
		
		int num = Integer.parseInt(entrada);
		if(num >=0 && num<10 ) System.out.println("El numero tiene rango 0 - 9");
		else System.out.println("El numero esta fuera de rango");
		
	}
	
	private static boolean isNum(String entrada) {
		int result;
		try {
			result = Integer.parseInt(entrada);
		} catch (NumberFormatException e) {
			System.out.println("la entrada no es un numero");
			return false;
		}
			
		return true;
		
		
	}
	
	
	
}
