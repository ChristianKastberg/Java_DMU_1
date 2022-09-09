package opg2;

public class Customer implements Comparable {

	private String fornavn;
	private String efternavn;
	private int alder;

	Customer(String fornavn, String efternavn, int alder) {
		this.fornavn = fornavn;
		this.efternavn = efternavn;
		this.alder = alder;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEfternavn() {
		return efternavn;
	}

	public void setEfternavn(String efternavn) {
		this.efternavn = efternavn;
	}

	public int getAlder() {
		return alder;
	}

	public void setAlder(int alder) {
		this.alder = alder;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
