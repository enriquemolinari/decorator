package main;

import decorator.ConFecha;
import decorator.ConPais;
import decorator.Hola;
import decorator.Saludo;

public class Main {

	public static void main(String[] args) {
//		Saludo h = new ConPaisYConFecha();
//		h.saludar();
		
		Saludo h = new ConFecha(new ConPais(new Hola()));
		h.saludar();
		
	}
}
