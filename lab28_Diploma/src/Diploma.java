public class Diploma {
	private String name;
	private String profession;

	public Diploma(String name1, String profession1) {
		name = name1;
		profession = profession1;
		toString();
	}
	
	public String toString() {
		return "This certifies that\n" + name + "\nhas completed a course in " + profession;
	}
}
