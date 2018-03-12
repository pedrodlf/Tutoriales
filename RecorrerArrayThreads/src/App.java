
public class App {

	public static void main(String[] args) {
		
		String a = "asdflkjasdlkfjasdlkjfasdñljfasdñlfjasdlkfjasdlfjka4654465456487547864889421687948642486484654987786548679454A";
		System.out.println("Tamaño del array = "+a.toCharArray().length);
		char[] ar = a.toCharArray();
		
		
		HilosVarios hilo1 = new HilosVarios(ar, 1);
		HilosVarios hilo2 = new HilosVarios(ar, 2);
		
		hilo1.start();
		hilo2.start();
		
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Proceso terminado");
		
		
	}

}
