package enkeltrettetAssocisering;

import java.util.ArrayList;

public class Bolig {

	private int kvm;
	private String adresse;
	private int prisPrMaaned;

	private ArrayList<Lejeaftale> lejeaftale = new ArrayList<>();

	public Bolig(int kvm, String adresse, int prisPrMaaned) {
		this.kvm = kvm;
		this.adresse = adresse;
		this.prisPrMaaned = prisPrMaaned;
	}

	// create lejeaftale mangler da dette er en komposition

	public ArrayList<Lejeaftale> getLejeAftale() {
		return new ArrayList<Lejeaftale>(lejeaftale);
	}

	public void addLejeAftale(Lejeaftale lejeaftale) {
		this.lejeaftale.add(lejeaftale);
	}

	public void removeLejeAftalae(Lejeaftale lejeaftale) {
		this.lejeaftale.remove(lejeaftale);
	}

	public int getKvm() {
		return kvm;
	}

	public void setKvm(int kvm) {
		this.kvm = kvm;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getPrisPrMaaned() {
		return prisPrMaaned;
	}

	public void setPrisPrMaaned(int prisPrMaaned) {
		this.prisPrMaaned = prisPrMaaned;
	}

}
