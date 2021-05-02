package kodlamaio2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,1,"T�lin","Akta�","tulinaktas@","Java");
		Student student2 = new Student(2,1,"Tu��e","Akta�","tugceaktas@","C#");
		
		Instructor instructor = new Instructor(1,2,"Engin","Demiro�","engindemirog@","Java");

		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.add(student);
		studentManager.add(student2);
		instructorManager.add(instructor);
		
		studentManager.getTrainingCourse(student2);
		instructorManager.getCourse(instructor);
		
	}

}
