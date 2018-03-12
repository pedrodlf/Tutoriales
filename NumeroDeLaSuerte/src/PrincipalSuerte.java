import java.util.Scanner;

public class PrincipalSuerte {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("----------INICIO DEL PROGRAMA--------------");
		
		System.out.println("Introduce tu fevha de nacimiento en el siguiente formato dd/mm/yyyy");
		String entrada = sc.next();
		int resul = calculaNumeroSuerte(toIntegerArray(entrada));
		
		System.out.println("tu numero de la suerte es "+resul);
		
		

	}

	private static Integer[] toIntegerArray(String entrada) {
		
		String[] arrayR = entrada.split("/");
		Integer[] arrayN = new  Integer[arrayR.length];
		for(int i =0; i<arrayR.length;i++) {
			arrayN[i]= Integer.parseInt(arrayR[i]);
		}
		
		return arrayN;
	}
	
	
	private static int calculaNumeroSuerte(Integer[] arrayEntrada) {
		
		int dia = arrayEntrada[0];
		int mes = arrayEntrada[1];
		int anio = arrayEntrada[2];
		int resultado = dia+mes;
		resultado =  Math.round( anio/resultado);
		return resultado;
	}
	
}
