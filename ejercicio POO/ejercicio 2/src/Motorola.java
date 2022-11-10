
public class Motorola extends Celular {

	private String versionAndroid;

	public Motorola(String modelo, int email, String versionAndroid) {
		super(modelo, email);
		this.versionAndroid = versionAndroid;
	}

	public String getVersionAndroid() {
		return versionAndroid;
	}

	public void setVersionAndroid(String versionAndroid) {
		this.versionAndroid = versionAndroid;
	}

	@Override
	public String toString() {
		return "Motorola [versionAndroid=" + versionAndroid + ", getBateria()=" + getBateria() + ", getModelo()="
				+ getModelo() + ", getEmail()=" + getEmail() + "]";
	}
	@Override
	public void perderBateria() {
		this.setBateria(this.getBateria() - 0.25);

		System.out.println("modelo: " + this.getModelo() + " ha perdido bateria y tiene ahora: " + this.getBateria());
	}

}
