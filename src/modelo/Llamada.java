package modelo;

import java.time.LocalTime;

public class Llamada {
	private String numeroTelefonico;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	
	public Llamada() {}
	
	public Llamada(String numeroTelefonico, LocalTime horaInicio, LocalTime horaFin) {
		super();
		this.numeroTelefonico = numeroTelefonico;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}
	
	public LocalTime duracionLlamada() {
		LocalTime duracion = LocalTime.of(getHoraFin().getHour() - getHoraInicio().getHour(), getHoraFin().getMinute() - getHoraInicio().getMinute(), 
				getHoraFin().getSecond() - getHoraInicio().getSecond(), getHoraFin().getNano() - getHoraInicio().getNano());
		return duracion;
	}
}
