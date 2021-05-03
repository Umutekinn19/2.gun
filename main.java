package odevler2;

public class main {

	public static void main(String[] args) {
		
		Course course1= new Course();
		course1.courseId=1;
		course1.courseName="Yazilim Gelistici Yetistirme(C#) :";
		course1.courseTeacher="Engin Demirog";
		course1.progressRate=0;
		
		Course course2= new Course();
		course2.courseId=2;
		course2.courseName="Yazilim Gelistici Yetistirme(JAVA) :";
		course2.courseTeacher="Engin Demirog";
		course2.progressRate=30;
		
		Course course3= new Course();
		course3.courseId=3;
		course3.courseName="Programlamaya Giriş için Temel Kurs :";
		course3.courseTeacher="Engin Demirog";
		course3.progressRate=100;
		
		courseStudentManager courseStudent = new courseStudentManager();
		courseStudent.studentManager(course1);
		courseStudent.studentManager(course2);
		courseStudent.studentManager(course3);

		Course[] courses= {course1,course2,course3};
		System.out.println("Kurs Sayisi: "+courses.length);
		for (Course course : courses) {
			
			
		}

	}

}
