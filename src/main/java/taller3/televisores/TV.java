package taller3.televisores;

public class TV {
	private int canal = 1;
	private int precio = 500;
	private int volumen = 1;
	private Marca marca;
	private boolean estado;
	private Control control;
	private static int numTV = = 0;
	
	public TV(Marca marca,boolean estado) {
		this.marca = marca;
		this.estado = estado;
		TV.numTV++;
	}
}
