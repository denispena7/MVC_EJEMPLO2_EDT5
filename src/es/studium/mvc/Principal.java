package es.studium.mvc;

public class Principal {

	public static void main(String[] args) 
	{
		Modelo m = new Modelo();
		Vista v = new Vista();
		
		new Controlador(m, v);
	}
}