package courseSystemDemo;

public class Main {

	public static void main(String[] args) {
		
		CourseManager courseManager = new CourseManager();
		
		Student student1 = new Student(1, "Sude", "Özkan", "sudeozkan", "sudeozkan@gmail.com", "9292");
		
		Student student2 = new Student(2, "Emir", "Kaya", "emirkaya", "emirkaya@gmail.com", "4545");
		
		Student student3 = new Student(3, "Ela", "Bilgi", "elabilgi", "elabilgi@gmail.com", "6161");
		
		Course course1 = new Course(1, "Java course", "Engin Demiroğ", "21 Hours");
		
		Course course2 = new Course(2, "C# course", "Engin Demiroğ", "18 Hours");
		
		Educator educator1 = new Educator(1, "Engin", "Demiroğ", "Java course");
		
			System.out.println("Educator Name : " + educator1.firstName + "\nEducator LastName : "+ educator1.lastName + "\nLectures : " + educator1.lectures);
			System.out.println("\n\nStudent Taking Courses : " + student1.firstName + " " + student1.lastName);
		
		courseManager.addCourse(course1, student1);
		courseManager.deletedCourse(course2, student3);
		
		
		
}
}
