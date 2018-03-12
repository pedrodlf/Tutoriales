
public class Mayusculas {

	public static void main(String[] args) {
		char a = 'a';
		char b = 'A';
		char[] caracteres = {a,b};
		
		for (char c : caracteres) {
			if(Character.isUpperCase(c))System.out.println("La letra "+c+" es masyuscula");
			else System.out.println("La letra "+c+" es minuscula");
		}
		
		
		

	}

}
