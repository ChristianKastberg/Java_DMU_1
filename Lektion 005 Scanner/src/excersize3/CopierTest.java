package excersize3;

public class CopierTest {

	public static void main(String[] args) {

		Copier machine = new Copier(1);
		machine.insertPaper(-1);
//		machine.SetPaper(0);
//		machine.makecopy();

		machine.makecopy();
		System.out.println(machine.getPaperCount());

	}

}
