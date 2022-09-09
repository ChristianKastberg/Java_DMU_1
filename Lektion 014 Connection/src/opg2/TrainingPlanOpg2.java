package opg2;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class TrainingPlanOpg2 {
	private char level;
	private int weeklyWaterHours;
	private int weeklyStrengthHours;
	private ArrayList<SwimmerOpg2> swimmers = new ArrayList<>(); // nullable

	public TrainingPlanOpg2(char level, int weeklyWaterHours, int weeklyStrengthHours) {
		this.level = level;
		this.weeklyWaterHours = weeklyWaterHours;
		this.weeklyStrengthHours = weeklyStrengthHours;
	}

	public char getLevel() {
		return level;
	}

	public void setLevel(char niveau) {
		this.level = niveau;
	}

	public int getWeeklyStrengthHours() {
		return weeklyStrengthHours;
	}

	public void setWeeklyStrengthHours(int weeklyStrengthHours) {
		this.weeklyStrengthHours = weeklyStrengthHours;
	}

	public int getWeeklyWaterHours() {
		return weeklyWaterHours;
	}

	public void setWeeklyWaterHours(int weeklyWaterHours) {
		this.weeklyWaterHours = weeklyWaterHours;
	}

	public int allTrainingHours() {
		return weeklyWaterHours + weeklyStrengthHours;
	}

	public void addSwimmer(SwimmerOpg2 s) {
		swimmers.add(s);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Niveau: " + level + "\n");
		sb.append("Timer i vand: " + weeklyWaterHours + "\n");
		sb.append("Timer i fitness: " + weeklyStrengthHours + "\n");

		if (swimmers.size() != 0) {
			sb.append("Svømmere: \n");
			for (SwimmerOpg2 s : swimmers) {
				sb.append("* " + s.getName() + "\n");
			}
		}
		return sb.toString();
	}
}
