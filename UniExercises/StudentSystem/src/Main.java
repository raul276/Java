import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student = new Student("Donika", "121215080", "9612311416", 6.00);
//
		SystemOperable so = new StudentSystem();
//		try {
//			so.addStudent(student);
//		} catch (IllegalFormatStudentException e) {
//			System.out.println(e.getMessage());
//		}
		
		so.printStudentsWithGradeHigherThan(4.0);
	}

}
