package modelos;

public class Moto extends Vehiculo{

	private int cilindrada;

	public Moto(String marca, int cilindrada) {
		super(marca);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void pintatDatos() {
		System.out.println(" El vehiculo es de la marca "+this.getMarca()+" y tiene "+this.getCilindrada()+" cc");
	}

}
