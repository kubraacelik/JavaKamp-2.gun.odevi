package courseSystemDemo;

public class StudentManager {
	
	public void registerToCourse(Student student, Course course) {
		System.out.println("Tebrikler " + student.firstName + course.courseName + " kursuna kaydınız başarıyla yapılmıştır.");
	}
	
	public void showEnrolledCourses(Student student) {
		System.out.println(student.firstName + " öğrencisinin kayıtlı olduğu dersler başarıyla gösterilmiştir.");
	}
}
