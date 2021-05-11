package herencia;

import java.util.Locale;

public class ConPais extends Hola {
	
	@Override
	public void saludar() {
		super.saludar();
		System.out.println(Locale.getDefault().getDisplayCountry());
	}

}
