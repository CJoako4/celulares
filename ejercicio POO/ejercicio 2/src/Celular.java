
public class Celular {

	private double bateria;
	private String modelo;
	private int email;

	public Celular(String modelo, int email) {
		super();
		this.bateria = 5;
		this.modelo = modelo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Celular [bateria=" + bateria + ", modelo=" + modelo + ", email=" + email + "]";
	}

	public double getBateria() {
		return bateria;
	}

	public void setBateria(double bateria) {
		this.bateria = bateria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public void perderBateria() {
		// TODO Auto-generated method stub
		
	}

	
	
}
