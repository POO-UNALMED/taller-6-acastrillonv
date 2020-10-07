package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nombre;
	private static List<Pais> paises = new ArrayList<>();
	private  List<Fabricante> fabricantes = new ArrayList<>();

	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	public Pais() {
		paises.add(this);
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public  List<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public static List<Pais> getPaises() {
		return paises;
	}
	public static void setPaises(List<Pais> paises) {
		Pais.paises = paises;
	}
	public void setFabricantes(Fabricante f) {
		fabricantes.add(f);
	}


	public static Pais paisMasVendedor() {
		int contador=0;

		Pais pais=null;

		for (Pais p:paises) {
			if(p.getFabricantes().size()>contador) {
				contador=p.getFabricantes().size();
				pais=p;
			}	
		}
		return pais;
	}



}


