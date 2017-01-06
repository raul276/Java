
public interface SystemOperable {
	void addStudent(Student student) throws IllegalFormatStudentException;
	double getGrade(String egn, String facultyNumber) throws NoStudentException;
	void printStudentsWithGradeHigherThan(double grade);
}
