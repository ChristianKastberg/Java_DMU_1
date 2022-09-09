package opg1;

public class ElBil extends Bil {
	private int opladningsTid;

	public ElBil() {
		this(10);
	}

	private ElBil(int tid) {
		super();
		opladningsTid = tid;
	}
}