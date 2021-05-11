package decorator;

import java.time.LocalDateTime;

public class ConFecha implements Saludo {

	private Saludo saludo;

	public ConFecha(Saludo saludo) {
		this.saludo = saludo;
	}

	@Override
	public void saludar() {
		this.saludo.saludar();
		System.out.println(LocalDateTime.now());
	}

}
