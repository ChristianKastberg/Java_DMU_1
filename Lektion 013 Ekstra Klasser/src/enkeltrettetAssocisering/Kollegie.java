package enkeltrettetAssocisering;

import java.util.ArrayList;

public class Kollegie {

	private String navn;
	private String adresse;
	private ArrayList<Bolig> bolig = new ArrayList<>();

	public Kollegie(String navn, String adresse) {
		this.navn = navn;
		this.adresse = adresse;
	}

	public ArrayList<Bolig> getBolig() {
		return this.bolig;
	}

//	public Bolig createBolig(int kvm, String adresse, int prisPrMaaned) {
//		Bolig bolig = new Bolig(kvm, adresse, prisPrMaaned);
//		this.bolig.addBolig(bolig);
//		return bolig;
//	}

	// sådan her skal det også stå i dobbeltrettet!
	public void addBolig(Bolig bolig) {
		if (!this.bolig.contains(bolig)) {
			this.bolig.add(bolig);
		}
	}

	public void removeBolig(Bolig bolig) {
		if (this.bolig.contains(bolig)) {
			this.bolig.remove(bolig);
		}
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
