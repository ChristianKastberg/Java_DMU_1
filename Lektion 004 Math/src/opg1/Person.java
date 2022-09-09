package opg1;

public class Person {

	// first name
	private String firstname;
	// middle name
	private String middlename;
	//
	private String lastname;

	// person with middle and last name
	public Person(String firstname, String middlename, String lastname) {
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;

	}

	// bruges ikke
//	public void personL(String firstname, String lastname) {
//		this.firstname = firstname;
//		this.lastname = lastname;

	public String getFullName() {
		return firstname + " " + middlename + " " + lastname;

	}

	// sørger for at jeg kan ændre det fulde navn
	public void setFullname(String firstname, String middlename, String lastname) {

		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;

	}

	// Laver et brugernavn til useren først tager vi de 2 første bogstaver i
	// fornavnet og gør dem store
	// derefter finder vi længden af mellem navnet
	// til sidst indsætter vi de sidste to bogstaver i efternavnet og smækker hele
	// molevitten sammen
	public String getUsername() {

		String fcode = firstname.substring(0, 2);
		fcode = fcode.toUpperCase();
		int mcode = middlename.length();
		String lcode = lastname.substring(lastname.length() - 2);
		String fmlcode = fcode + mcode + lcode;
		return fmlcode;

	}

	// laver initialer af fornavn og efternavn
	public String getIntis() {

		String fletter = firstname.substring(0, 1);
		String lletter = lastname.substring(0, 1);
		String bothletter = fletter + lletter;
		return bothletter;

	}

	// Add a method getCryptoInits(int count) that returns an encrypted version of
	// the initials.
	// The encryption is done by moving each letter count places in the alphabet,
	// e.g
	// ‘a’encrypted with count = 1 is ‘b’, ‘n’ encrypted with count = 2 is ‘p’ and
	// so on.

	public String getCryptointis(int count) {

		char f0 = firstname.charAt(0);
		char l0 = lastname.charAt(0);
		f0 = (char) (f0 + count);
		l0 = (char) (l0 + count);
		String Crypto = String.valueOf(f0 + "" + l0);

		return Crypto;

	}

	public void printPerson() {

		System.out.println("");
		System.out.println("First name: " + firstname);
		System.out.println("Middle name: " + middlename);
		System.out.println("Last name: " + lastname);
		System.out.println("");
	}
}
