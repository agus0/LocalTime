package modelo;

import java.util.GregorianCalendar;
import java.util.List;

public class Venta {
	private GregorianCalendar fechaHora;
	private List<Llamada> lstLlamada;
	
	public Venta() {}
	
	public Venta(GregorianCalendar fechaHora, List<Llamada> lstLlamada) {
		super();
		this.fechaHora = fechaHora;
		this.lstLlamada = lstLlamada;
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	public List<Llamada> getLstLlamada() {
		return lstLlamada;
	}

	public void setLstLlamada(List<Llamada> lstLlamada) {
		this.lstLlamada = lstLlamada;
	}
	
	
	
}

