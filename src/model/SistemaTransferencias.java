package model;

import java.util.List;
import java.util.ArrayList;

public class SistemaTransferencias {

	private List<Club> clubes;
	private List<Jugador> jugadores;
	
	public SistemaTransferencias() {
		this.clubes = new ArrayList<>();
		this.jugadores = new ArrayList<>();
		System.out.println("SISTEMA CREADO CON EXITO");
	}
	
	public void registrarClub(Club club) {
		clubes.add(club);
	}

	public void registrarJugador(Club club, Jugador jugador) {
		jugadores.add(jugador);
		club.agregarJugador(jugador);
	}
	
	
}
