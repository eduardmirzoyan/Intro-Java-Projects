public class DiplomaWithHonors extends Diploma {	
	public DiplomaWithHonors(String name1, String profession1) {
		super(name1, profession1);
		toString();
	}
	
	public String toString() {
		return super.toString() + "\n*** with Honors ***";
	}
}
