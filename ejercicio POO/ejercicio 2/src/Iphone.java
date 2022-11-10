
public class Iphone extends Celular {

	private String IOS;

	public Iphone(String modelo, int email, String iOS) {
		super(modelo, email);
		IOS = iOS;
	}

	public String getIOS() {
		return IOS;
	}

	public void setIOS(String iOS) {
		IOS = iOS;
	}

	@Override
	public String toString() {
		return "Iphone [IOS=" + IOS + ", getBateria()=" + getBateria() + ", getModelo()=" + getModelo()
				+ ", getEmail()=" + getEmail() + "]";
	}
	@Override
	public void perderBateria() {
		this.setBateria(this.getBateria() - 0.1);

		System.out.println("modelo: " + this.getModelo() + " ha perdido bateria y tiene ahora: " + this.getBateria());
	}

}
