package opg1;

public class Chilli implements Measurable {
	private String name;
	private double scoville;

	public Chilli(String name, double scoville) {
		this.name = name;
		this.scoville = scoville;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScoville() {
		return scoville;
	}

	public void setScoville(double scoville) {
		this.scoville = scoville;
	}

	@Override
	public double getMeasure() {
		return scoville;
	}

}
