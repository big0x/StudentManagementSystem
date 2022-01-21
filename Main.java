
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Mehmet", "Yurdakul", "12345678901");
		Student student2 = new Student(2, "Engin", "Demiroğ", "12345678901");
		Student student3 = new Student(3, "Ali", "Veli", "12345678902");
		Student student4 = new Student(4, "Ali", "Yurdakul", "12345678903");
		Student student5 = new Student(4, "Veli", "Yurdakul", "12345678903");
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		studentManager.add(student4);
		studentManager.delete(3);
		studentManager.update(student5);
	}

}
