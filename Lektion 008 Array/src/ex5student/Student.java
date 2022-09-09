package ex5student;

public class Student {
	private String name;
	private int[] grades;// containing the student's grades
	private int gradeCount;// the current number of grades

	private static final int MAX_GRADE_COUNT = 10;// maximum number of grades

	public Student(String name) {
		this.name = name;
		this.grades = new int[Student.MAX_GRADE_COUNT];
		this.gradeCount = 0;
	}

	public String getName() {
		return this.name;
	}

	public int[] getGrades() {
		return this.grades;
	}

	public int getGradeCount() {
		return this.gradeCount;
	}

	// a
	public void addGrade(int grade) {

		if (gradeCount < MAX_GRADE_COUNT) {
			grades[gradeCount] = grade;
			gradeCount++;

		}
	}

	// b
	public double gradeAverage() {
		int Sum = 0;
		for (int i = 0; i < gradeCount; i++) {
			Sum += grades[i];
		}
		return Sum * 1.0 / gradeCount;
	}

	// c for loop der finder den største grade
	public int maxGrade() {
		int maximum = 0;
		for (int i = 0; i < gradeCount; i++) {
			if (grades[i] > maximum) {
				maximum = grades[i];
			}

		}
		return maximum;
	}

	// d som maxGrade men med omvendt <
	public int minGrade() {

		int minimum = 0;
		for (int i = 0; i < gradeCount; i++) {
			if (grades[i] < minimum) {
				minimum = grades[i];
			}

		}
		return minimum;
	}

	// e for loop løber alle grades igennem og putter dem ind i actualGrades arrayet
	int[] getActualGrades() {

		int[] actualGrades = new int[gradeCount];
		for (int i = 0; i < gradeCount; i++) {
			actualGrades[i] = grades[i];
		}
		return actualGrades;
	}
}
