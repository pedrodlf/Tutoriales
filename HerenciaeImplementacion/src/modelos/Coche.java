package modelos;

public class Coche extends Vehiculo {

	private int numeroDePuertas;



	public Coche(String marca, int numeroDePuertas) {
		super(marca);
		this.numeroDePuertas = numeroDePuertas;
	}

	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}

	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}

	@Override
	public void pintatDatos() {
		System.out.println(" El vehiculo es de la marca "+this.getMarca()+" y tiene "+this.getNumeroDePuertas()+" puertas");
	}
	
	
	
	
	
}
