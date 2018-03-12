import java.util.ArrayList;
import java.util.List;

public class NumeroPerfecto {

	public static void main(String[] args) {
		
		int a = 1000;
		
		sacarNumerosPerfectos(numToArray(a));
		//sacarNumeroPerfecto(numToArray(a));
	}
	
	private static List<Integer> sacarNumerosPerfectos(List<Integer> lista){
		List<Integer> resultado = new ArrayList<>();
		int count = 0;
		
		
		lista.forEach(item -> {
			List< Integer> divisores = new ArrayList<>();	
			for(int i = 1; i<item;i++) {
				if(item%i==0) divisores.add(i);
			}
			int r = 0;
			for (Integer integer : divisores) {
				//System.out.println(integer);
				 r+= integer;
			}
			
//			if(r == item)resultado.add(item);
			if(r == item)System.out.println("el numero "+item +" es perfecto" );;
			
		});
		
		
		return resultado;
	}
	
	
	private static ArrayList<Integer> numToArray(int num) {
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=1;i <= num;i++) {
			array.add(i);
			
		}
		
		for (Integer integer : array) {
		
		}
		return array;
	}
	
	private static ArrayList<Integer> sacarNumeroPerfecto (ArrayList<Integer> lista){
		  
		  for (Integer integer : lista) {
		   ArrayList<Integer> divisores = new ArrayList();
		   
		   for (int i=1; i<integer; i++) {
		    if(integer%i==0) {
		     divisores.add(i);
		    }
		   }
		   
		   int resultado = 0;
		     
		   for (Integer integer2 : divisores) {
		    resultado = resultado + integer2;
		   }
		   
		   if(resultado == integer) {
		    
		    System.out.println("El número " + integer + " es perfecto");
		    
		   }
		   
		  }
		  
		  return null;
		 }
	
}
