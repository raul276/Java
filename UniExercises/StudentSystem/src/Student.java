
public class Student {
	private String name;
	private String egn;
	private String facultyNumber;
	private double grade;
	
	public Student() {}
	
	public Student(String name, String facultyNumber, String egn, double grade) {
		this.name = name;
		this.egn = egn;
		this.facultyNumber = facultyNumber;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEgn() {
		return egn;
	}

	public void setEgn(String egn) {
		this.egn = egn;
	}

	public String getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public String getFileString() {
		return this.name + "|" + this.facultyNumber
				+ "|" + this.egn + "|" + this.grade; 
	}
}
