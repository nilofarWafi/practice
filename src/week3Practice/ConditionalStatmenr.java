package week3Practice;

public class ConditionalStatmenr {

	public static void main(String[] args) {
		double grade = 98;
		String r = "";
		if (grade >= 90) {
			r = grade >= 95 ? "A+" : "A-";
		} else if (grade >= 80) {
			r = grade >= 85 ? "B+" : "B-";

		} else if (grade >= 70) {
			r = grade >= 75 ? "C+" : "C-";

		} else if (grade >= 60) {
			r = grade >= 65 ? "D+" : "D-";
		} else {
			r = "F";
		}
		System.out.println(r);
	}
}