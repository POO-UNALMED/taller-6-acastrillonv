package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {

	private String nombre;
	private Pais pais;
	private static List<Fabricante> listadof = new ArrayList<>();

	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		pais.setFabricantes(this);
		listadof.add(this);
	}
	public Fabricante() {
		listadof.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Fabricante> getListadof() {
		return listadof;
	}

	public static void setListadof(List<Fabricante> listadof) {
		Fabricante.listadof = listadof;
	}

	public static Fabricante fabricaMayorVentas() {
		int contador=0;
		Fabricante fabricante=null;
		for (Fabricante f:listadof) {
			if(f.getListadof().size()>contador) {
				contador=f.getListadof().size();
				fabricante=f;
		}
		
	}
		return fabricante;
	
}
	
}
