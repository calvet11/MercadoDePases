package model;

import model.Club;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private int edad;
	private Posicion posicion;
	private Nacionalidad nacionalidad;
	private double valorMercado;
	private Club clubActual;
	
	public Jugador(String nombre, String apellido, int edad, Posicion posicion, Nacionalidad nacionalidad, double valorMercado,
			Club clubActual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.posicion = posicion;
		this.nacionalidad = nacionalidad;
		this.valorMercado = valorMercado;
		this.clubActual = clubActual;
		System.out.println("JUGADOR " + this.nombre + " CREADO CON EXITO");
	}
	
	

}
