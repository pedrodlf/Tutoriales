import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class HilosVarios extends Thread {

	private char[] arrayC;
	private boolean respuesta;
	private int pos;

	
	
	public HilosVarios(char[] arrayC, int pos) {
		super();
		this.arrayC = arrayC;
		this.pos = pos;
	}


	
	public void run() {
		
		isRepetida(this.arrayC, this.pos);
	}
	
	
    private  Optional<Set<Character>> isRepetida(char[] arrayChar, int pos){
    	Set<Character> set = new HashSet<>();
    	int c = 0; 
    	switch (pos) {
		case 1:
			
			
			   for(int i = 0; i<arrayChar.length/2;++i) {
				   System.out.println("caso 1: "+ arrayChar[i]);
				   set.add(arrayChar[i]);
				   try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				   c++; 
			   }
			   System.out.println("Tamaño del array caso1 = "+ c);
			break;

		case 2:
			
			for(int i = arrayChar.length/2; i<arrayChar.length;++i) {
				   System.out.println("caso 2: "+ arrayChar[i]);
				   set.add(arrayChar[i]);
				   try {
						Thread.sleep(225);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}c++;
			   } 
			System.out.println("Tamaño del array caso2 = "+ c);
			break;
		}
    	
    	
    	return Optional.of(set);
    } 
	
	public char[] getArrayC() {
		return arrayC;
	}

	public void setArrayC(char[] arrayC) {
		this.arrayC = arrayC;
	}


	public boolean isRespuesta() {
		return respuesta;
	}


	public void setRespuesta(boolean respuesta) {
		this.respuesta = respuesta;
	}


	public int getPos() {
		return pos;
	}


	public void setPos(int pos) {
		this.pos = pos;
	}

	




	

	
	
	
	
}
