import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un entero");
	int num = sc.nextInt();
	sc.close();
	
	if(num%2==0)System.out.println("el numero "+num+" es par");
	else System.out.println("el numero "+num+" es impar");

	}

}
