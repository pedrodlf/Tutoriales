package recorrerArrayEasy;

public class HelloWordl {

	public static void main(String[] args) {

		String entrada = "ssalkdfjsadlfj4q032810r1djf01e djfweiorj490321ruwedjweoqjrweioqrjwncs,mxvnjxklbveqrpar094175u8325yuoweijfasdñlfj40312ru43hj3q`p9fhrasdñlkjnc`W30RU4`0JRFSDQNCASÑKJDHFN934WQ58R432108932DUSAHDJKDHPOVDAÑ";
		char[] arrayLetras = entrada.toCharArray();

		if (isRepetido(arrayLetras))
			System.out.println("el array tiene coincidencias!!!!!!!!!!!!!!!");
		System.out.println("el numero de caracteres diferentes repetidos es de " + geNumDeCaracteresRepetidos(arrayLetras));
		pintarArraydeRepetidos(arrayLetras);
	
	
	}

	
	
	
	public static boolean isRepetido(char[] entrada) {

		for (int i = 0; i < entrada.length; i++) {
			for (int b = i; b < entrada.length; b++) {

				if (b != i && entrada[i] == entrada[b]) {
					System.out.println("Coincide!!  " + entrada[i] + " tiene una coincidencia en la posicion " + b);
					return true;
				}
			}

		}
		System.out.println("no existen repeticiones");
		return false;
	}

	private static int geNumDeCaracteresRepetidos(char[] entrada) {
		int contador = 0;
		char[] array2 = new char[entrada.length];
		for (int i = 0; i < entrada.length; i++) {
			for (int b = i; b < entrada.length; b++) {

				if (b != i && entrada[i] == entrada[b]&& !IsCaracter(array2, entrada[i])) {
					array2[i] = entrada[i];

				}
			}

		}

		for (char c : array2) {

			if (c != '\u0000') {
			
				contador++;
			}

		}
		return contador;
	}

	private static boolean IsCaracter(char[] array, char l) {

		for (char c : array) {
			if (c == l && c != '\u0000') {
				return true;
			}
		}

		return false;
	}
	
	private static char[] pintarArraydeRepetidos(char[] entrada) {
		char[] array2 = new char[entrada.length];
		
		for (int i = 0; i < entrada.length; i++) {
			for (int b = i; b < entrada.length; b++) {

				if (b != i && entrada[i] == entrada[b]&& !IsCaracter(array2, entrada[i])) {
					array2[i] = entrada[i];
					
				}
			}

		}
		int cont = 0;
		for (char c : array2) {
			if(c!='\u0000')System.out.println(" arraydeChar["+cont+"] = "+c);
			cont++;
		}
		return array2;
	}

}
