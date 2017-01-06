import java.io.*;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentSystem implements SystemOperable {

	private static final File FILE = new File("system.txt");
	
	@Override
	public void addStudent(Student student) throws IllegalFormatStudentException {
		// TODO Auto-generated method stub
		if(!this.isStudentValid(student)) {
			throw new IllegalFormatStudentException();
		}
		try(BufferedWriter br = new BufferedWriter(new FileWriter(FILE, true))) {
			br.write(student.getFileString());
			br.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public double getGrade(String facultyNumber, String egn) throws NoStudentException {
		try(BufferedReader br = new BufferedReader(new FileReader(FILE))) {
			String currentLine = null;
			while((currentLine = br.readLine()) != null) {
				String[] studentProperties = currentLine.split("\\|");
				if(studentProperties[1].equals(facultyNumber)
						&& studentProperties[2].equals(egn)) {
					return Double.parseDouble(studentProperties[3]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		throw new NoStudentException();
	}
	
	public void printStudentsWithGradeHigherThan(double grade) {
		try(BufferedReader br = new BufferedReader(new FileReader(FILE))) {
			String currentLine = null;
			while((currentLine = br.readLine()) != null) {
				String[] properties = currentLine.split("\\|");
				double currentGrade = Double.parseDouble(properties[3]);
				if(currentGrade >= grade) {
					System.out.println(properties[0]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private boolean isStudentValid(Student student) {
		Pattern pattern = Pattern.compile("[A-Z][a-z]+");
		Matcher matcher = pattern.matcher(student.getName());
		boolean isNameValid = matcher.matches();
		System.out.println(isNameValid);
		if(student.getEgn().length() != 10
				|| student.getFacultyNumber().length() != 9
				|| (student.getGrade() < 2 || student.getGrade() > 6)
				|| !isNameValid) {
			return false;
		}
		
		return true;
	}
}
