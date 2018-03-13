import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidarMes {

	// Programa que lea una variable entera mes y compruebe si el valor corresponde
	// a un mes de 30, 31 o 28 días.
	// Se mostrará además el nombre del mes. Se debe comprobar que el valor
	// introducido esté comprendido entre 1 y 12.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("intorduce un mes del 1 al 12");
		String a = sc.next();
		try {
			if(isMesValido(Integer.parseInt(a))) {
			Map<String, Integer> map = calculaNumeroDias(Integer.parseInt(a));
			map.forEach((k,v)-> {
				System.out.println(k+" tiene un total de "+v+" dias");
			});
			}else System.out.println(" el numero itroducido no esta comprendido entre el 1 y el 12");
		} catch (NumberFormatException e) {
			System.out.println(" el  dato introducido es incorrecto");
		}
		

	}

	private static boolean isMesValido(int a) {

		if (a >= 1 && a <= 12)
			return true;
		else
			return false;
	}
	
	

	private static Map<String, Integer> calculaNumeroDias(int a) {
		int result = 0;
		String mes = "";
		switch (a) {
		case 1:
			mes ="ENERO";
			result = 31;
			break;
		case 2:
			mes ="FEBRERO";
			result = 28;
			break;

		case 3:
			mes = "MARZO";
			result = 31;
			break;

		case 4:
			mes = "ABRIL";
			result = 30;
			break;

		case 5:
			mes = "MAYO";
			result = 31;
			break;

		case 6:
			mes = "JUNIO";
			result = 30;
			break;

		case 7:
			mes = "JULIO";
			result = 31;
			break;
		case 8:
			mes = "AGOSTO";
			result = 31;
			break;
		case 9:
			mes = "SEPTIEMBRE";
			result = 30;
			break;
		case 10:
			mes = "OCTUBRE";
			result = 31;
			break;
		case 11:
			mes = "NOVIEMBRE";
			result = 30;
			break;
		case 12:
			mes ="DICIEMBRE";
			result = 31;
			break;
			
		}
		Map<String, Integer> resultado = new HashMap<>();
		resultado.put(mes, result);
		return resultado;
	}

}
