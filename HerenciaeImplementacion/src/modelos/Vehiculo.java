package modelos;

import interfaces.Acciones;
import interfaces.Informacion;
import interfaces.Movimientos;

public class Vehiculo implements Movimientos, Acciones,Informacion{

	private String marca;
	
	
	


	public Vehiculo(String marca) {
		super();
		this.marca = marca;
	}

	@Override
	public void arrancar() {
		System.out.println(" el vehiculo Arranca");
		
	}

	@Override
	public void parar() {
		System.out.println(" el vehiculo para");
		
	}

	@Override
	public void acelerar() {
		System.out.println(" el vehiculo acelera");
		
	}

	@Override
	public void frenar() {
		System.out.println(" el vehiculo Frena");
		
	}
	@Override
	public void pintatDatos() {
		System.out.println(" El vehiculo es de la marca "+this.getMarca());
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	
	

}
