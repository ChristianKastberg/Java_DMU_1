package excersize3;

public class Copier {
	private int paperCount;

	public Copier(int paperCount) {
		this.paperCount = paperCount;

	}

//  sætter papercount til PRÆCIS det tal du skriver
	public void SetPaper(int paperCount) {
		this.paperCount = paperCount;
	}

//  sætter + antal papercount i hvad du har allerede max 500

	public void insertPaper(int amount) {
		if (paperCount + amount <= 500) {
			paperCount += amount;
		} else {
			System.out.print("Error maxium capacity reached");

		}
	}

	public int getPaperCount() {
		return this.paperCount;

	}

	public void makecopy() {

		if (paperCount > 0) {
			paperCount--;
		} else
			System.out.println("Error no more paper");

	}

}
