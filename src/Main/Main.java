package Main;

import model.SistemaTransferencias;
import model.Club;
import model.Jugador;
import model.Nacionalidad;
import model.Posicion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SistemaTransferencias sistema = new SistemaTransferencias();
		
		Club clubVelez = new Club("Velez Sarsfield", "Argentina", 7000000);
		Club clubBoca = new Club("Boca Juniors", "Argentina", 21000000);
		Club clubIndependiente = new Club("Independiente", "Argentina", 14000000);
	
		Jugador j1 = new Jugador(
				"Gonzalo", "Calvet", 22, Posicion.DELANTERO, Nacionalidad.ARGENTINA, 4500000, clubVelez
				);
		Jugador j2 = new Jugador(
				"Ignacio", "Calvet", 24, Posicion.MEDIOCAMPISTA, Nacionalidad.ARGENTINA, 4150000, clubVelez
				);
		Jugador j3 = new Jugador(
				"Lautaro", "Gonzalez", 22, Posicion.DEFENSOR, Nacionalidad.ARGENTINA, 1800000, clubIndependiente
				);
		Jugador j4 = new Jugador(
				"Gianni", "Introcaso", 23, Posicion.DELANTERO, Nacionalidad.ARGENTINA, 1000000, clubBoca
				);
		Jugador j5 = new Jugador(
				"Bruno", "Borello", 22, Posicion.DEFENSOR, Nacionalidad.ARGENTINA, 1200000, clubBoca
				);
		Jugador j6 = new Jugador(
				"Ricardo", "Gutierrez", 27, Posicion.ARQUERO, Nacionalidad.ARGENTINA, 770000, clubIndependiente
				);
	
	}

}
