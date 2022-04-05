package source;

import es.upm.aedlib.graph.Vertex;

public class Estacion {
	private int num;
	private double lat;
	private double lon;
	private double g;
	private double h;
	private double f;
	private Vertex<Estacion> padre;
	private String nombre;
	private int x;
	private int y;
	private int distancia;

	public Estacion(int num, double lat, double lon, String nombre, int x, int y) {
		this.num = num;
		this.lat = lat;
		this.lon = lon;
		this.nombre = nombre;
		this.x = x;
		this.y = y;
		distancia = 0;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getNum() {
		return this.num;
	}

	public double getLat() {
		return this.lat;
	}

	public double getLon() {
		return this.lon;
	}

	public void setG(double g) {
		this.g = g;
	}

	public void setH(double h) {
		this.h = h;
	}

	public void setF(double f) {
		this.f = f;
	}

	public void setPadre(Vertex<Estacion> padre) {
		this.padre = padre;
	}

	public double getG() {
		return this.g;
	}

	public double getH() {
		return this.h;
	}

	public double getF() {
		return this.f;
	}

	public Vertex<Estacion> getPadre() {
		return this.padre;
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

}
