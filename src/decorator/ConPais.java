package decorator;

import java.util.Locale;

public class ConPais implements Saludo {
	
    private Saludo saludo;
    
    public ConPais(Saludo saludo) {
     this.saludo = saludo;
    }
 
	@Override
	public void saludar() {
		this.saludo.saludar();
		System.out.println(Locale.getDefault().getDisplayCountry());
	}
}
