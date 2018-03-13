import interfaces.Acciones;
import interfaces.Informacion;
import interfaces.Movimientos;
import modelos.Coche;
import modelos.Moto;
import modelos.Vehiculo;

public class HerenciaeImplementacion {

	
	public static void main(String[] args) {
		
		Vehiculo vehiculo = new Vehiculo("Seat");
		
		Coche coche = new Coche("Seat", 5);
		
		Moto moto = new Moto("Suzuki", 600);
		
		Vehiculo moto2 = new Moto("kawasaki", 1100);
		
		Acciones moto3 = new Moto("Kawasaki", 250);
		
		Informacion coche2 = new Coche("Ferrary", 4);
		
		Movimientos vehiculo2 = new Vehiculo("Renault");
		
		
		System.out.println("----VEHICULO-------");
		
		vehiculo.arrancar();
		vehiculo.acelerar();
		vehiculo.frenar();
		vehiculo.parar();
		vehiculo.pintatDatos();
		
		System.out.println("--------COCHE-------");
		
		coche.arrancar();
		coche.acelerar();
		coche.frenar();
		coche.parar();
		coche.pintatDatos();
		System.out.println("--------MOTO-------");
		
		moto.arrancar();
		moto.acelerar();
		moto.frenar();
		moto.parar();
		moto.pintatDatos();
		System.out.println("-----VEHICULO/MOTO----------");
		
		moto2.arrancar();
		moto2.acelerar();
		moto2.frenar();
		moto2.parar();
		moto2.pintatDatos();
		
		System.out.println("------ACCIONES/MOTO-----------");
		
		moto3.arrancar();
		moto3.parar();
		
		System.out.println("--------INFORMACION/COCHE----------");
		coche2.pintatDatos();
		
		System.out.println("------MOVIMIENTOS/VEHICULO-------");
		vehiculo2.acelerar();
		vehiculo2.frenar();
		
		
	}
}
