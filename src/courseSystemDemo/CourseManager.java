package courseSystemDemo;

public class CourseManager {
	
	public void addCourse(Course course , Student student) {
		System.out.println("\nCourse Added : " + course.courseName + " | Student Added : " + student.nickName);
	}
	
	public void deletedCourse(Course course, Student student) {
		System.out.println("\nCourse Deleted : " + course.courseName + " | Student Deleted : " + student.nickName);
	}
}
