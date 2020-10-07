package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo {
	private int ejes;
	private static List<Camion> listado = new ArrayList<>();

	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		listado.add(this);
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public static int cantidadCamiones(){
		if (listado.isEmpty()) {
			return 0;
		}
		else {
			return listado.size(); 
		}
	}
	
}