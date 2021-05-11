package herencia;

import java.util.Locale;

public class ConPaisYConFecha extends ConFecha {
	
	@Override
	public void saludar() {
		super.saludar();
		System.out.println(Locale.getDefault().getDisplayCountry());
	}

}
