package org.cuatrovientos.spring.exam01.joseba;

import java.util.Vector;

public class Fleet {
	private String name;
	private Commander general;
	private Vector<Ship> starships;

	public Fleet() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Commander getGeneral() {
		return general;
	}

	public void setGeneral(Commander general) {
		this.general = general;
	}

	public Vector<Ship> getStarships() {
		return starships;
	}

	public void setStarships(Vector<Ship> starships) {
		this.starships = starships;
	}

	public void addShip(Ship s) {
		starships.add(s);
	}

	@Override
	public String toString() {
		return "Fleet [name=" + name + ", general=" + general + ", starships=" + starships + "]";
	}
}
