
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Motorola CelularJuliana = new Motorola("motorola U9" , 5194137, "15.0.7"  );
		
		Iphone CelularCatalina = new Iphone ("iphone X", 43773189, "12.4.1");
		
		Persona Juliana = new Persona("Juliana", "1357131" , "helicoptero apache"); {
			//Juliana.usarCelular(CelularJuliana);
		}
		Persona Catalina = new Persona("Catalina", "1837942" , "Hembra"); {
			//Catalina.usarCelular(CelularCatalina);
		}
		
		
		
		
		//CelularJuliana.perderBateria();
		//CelularCatalina.perderBateria();
		
		Catalina.hacerLlamada(CelularCatalina, CelularJuliana, Juliana);
		
		
	}

}
