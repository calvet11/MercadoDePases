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
	
	public void comprarJugadorPorPosicion(Club club, Posicion posicion) {
		Jugador jugador = club.venderJugador(posicion);
		jugadores.add(jugador);
	}

	private Jugador venderJugador(Posicion posicion) {
		int i = 0;
		Jugador jugadorAVender = null;
		boolean removido = false;
		
		while(i<jugadores.size() && !removido) {
			
			if(jugadores.get(i).getPosicion().equals(posicion)) {
				jugadorAVender = jugadores.remove(i);
				removido = true;
			}
			
			i++;
		}
		
		return jugadorAVender;
	}

	public void mostrarPlantel() {
		System.out.println("Plantel de " + this.nombre);
		for (Jugador jugador : jugadores) {
			System.out.println(jugador.toString());
		}
	}

	@Override
	public String toString() {
		return "Club [nombre=" + nombre + "]";
	}
	
	
	
}
