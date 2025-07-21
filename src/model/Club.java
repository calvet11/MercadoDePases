package model;

import java.util.ArrayList;
import java.util.List;

public class Club {

	private String nombre;
	private String pais;
	private double presupuesto;
	private List<Jugador> jugadores;
	
	public Club(String nombre, String pais, double presupuesto) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.presupuesto = presupuesto;
		this.jugadores = new ArrayList<>();
		System.out.println("CLUB " + this.nombre + " CREADO CON EXITO");
	}
	
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	
}
