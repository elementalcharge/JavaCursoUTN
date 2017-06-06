package com.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Habitacion {

	private String tematica;
	private int calificacion;
	private boolean jacuzzi;
	private int tiempo;
	private int turno;
	private boolean disponible;
	private float precio;
	private List<IPersona> listapersona;
	private int maxCapa;
	public Habitacion(String tematica, int calificacion, boolean jacuzzi, int tiempo, int turno, boolean disponible,
			float precio, int maxCapa ,IPersona ... listapersona) {
		super();
		this.tematica = tematica;
		this.calificacion = calificacion;
		this.jacuzzi = jacuzzi;
		this.tiempo = tiempo;
		this.turno = turno;
		this.disponible = disponible;
		this.precio = precio;
		for (int i = 0; i < listapersona.length; i++) {
			this.listapersona.add( listapersona[i]);
			
		}
		
		this.maxCapa = maxCapa;
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public boolean isJacuzzi() {
		return jacuzzi;
	}
	public void setJacuzzi(boolean jacuzzi) {
		this.jacuzzi = jacuzzi;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public List<IPersona> getListapersona() {
		return listapersona;
	}
	public void setListapersona(ArrayList<IPersona> listapersona) {
		this.listapersona = listapersona;
	}
	public int getMaxCapa() {
		return maxCapa;
	}
	public void setMaxCapa(int maxCapa) {
		this.maxCapa = maxCapa;
	}
}
