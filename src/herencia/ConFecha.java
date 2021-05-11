package herencia;

import java.time.LocalDateTime;

public class ConFecha extends Hola {
	
	@Override
	public void saludar() {
		super.saludar();
		System.out.println(LocalDateTime.now());
	}

}
