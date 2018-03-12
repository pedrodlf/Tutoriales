import java.io.SequenceInputStream;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero para calcular su factorial");
		int n = sc.nextInt();
		sc.close();
		long factorial = 1;
		for(int i = 1; i<=n ; i++) {
			factorial *=i;
		}
		
		System.out.println("el factorial es = "+factorial);
	}
	
}
