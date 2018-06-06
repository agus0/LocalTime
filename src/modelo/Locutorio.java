package modelo;

import java.util.List;

public class Locutorio {
	private List<Venta> lstVentas;
	
	public Locutorio() {}
	
	public Locutorio(List<Venta> lstVentas) {
		super();
		this.lstVentas = lstVentas;
	}

	public List<Venta> getLstVentas() {
		return lstVentas;
	}

	public void setLstVentas(List<Venta> lstVentas) {
		this.lstVentas = lstVentas;
	}
	
	
}
