package dobbeltrettetAssociering;

public class Gruppe {

	private int nr;
	private PersonChip personChip;

	// add arraylist and add & remove method

	public Gruppe(int nr) {
		this.nr = nr;
	}

	public PersonChip getPersonChip() {
		return personChip;
	}

	public void setPersonChip(PersonChip personChip) {
		this.personChip = personChip;

	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

}
