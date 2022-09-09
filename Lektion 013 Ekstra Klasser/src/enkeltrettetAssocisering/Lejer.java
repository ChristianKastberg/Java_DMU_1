package enkeltrettetAssocisering;

public class Lejer {

	private String navn;
	private String udannelse;

	public Lejer(String navn, String udannelse) {
		this.navn = navn;
		this.udannelse = udannelse;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getUdannelse() {
		return udannelse;
	}

	public void setUdannelse(String udannelse) {
		this.udannelse = udannelse;
	}

}
