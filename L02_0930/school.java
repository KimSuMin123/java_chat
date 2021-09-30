package L02_0930;

public class school {
	
	String school_name;
	int grade;
	
	public school() {
		school_name = "dealim";
		grade = 6;
		System.out.println(grade + " grade in " + school_name + " school");
	}
	
	public school(String school_name, int grade) {
		this.school_name = school_name;
		this.grade = grade;
		System.out.println(grade + " grade in " + school_name + " school");
	}
}
