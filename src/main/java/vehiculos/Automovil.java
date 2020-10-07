package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Automovil extends Vehiculo {
	
	private int puestos;
	private static List<Automovil> listado = new ArrayList<>();
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		listado.add(this);
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public static int cantidadAutomoviles(){
		if (listado.isEmpty()) {
			return 0;
		}
		else {
			return listado.size(); 
		}
	}
}