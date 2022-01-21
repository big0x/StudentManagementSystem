import java.util.ArrayList;

public class StudentManager {

	ArrayList<Student> students = new ArrayList<Student>();

	public void add(Student addedStudent) {
		for (Student student : students) {
			if (student.getIdentityNumber() == addedStudent.getIdentityNumber()) {
				System.out.println("Student is already exist");
				return;
			}
		}
		this.students.add(addedStudent);
		System.out.println("Student " + addedStudent.getFirstName() +" "+ addedStudent.getLastName() + " is added.");
	}

	public void delete(int id) {
		Student deletedStudent = new Student();
		for (Student student : students) {
			if (student.getId() == id) {
				deletedStudent = student;
			}
		}
		System.out.println("Student " + deletedStudent.getFirstName() +" "+ deletedStudent.getLastName() + " is deleted.");
		students.remove(deletedStudent);

	}

	public void update(Student updatedStudent) {
		for (Student student : students) {
			if (student.getId() == updatedStudent.getId()) {
				students.set(students.indexOf(student), updatedStudent);
				System.out.println("Student with " + student.getId() + " id number is updated.");
				return;

			} 
				
	}
		System.out.println("Student can not found.");
	}

	public ArrayList<Student> getAll() {
		return this.students;
	}
}
