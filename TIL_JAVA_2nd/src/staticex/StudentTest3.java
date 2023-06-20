package staticex;

public class StudentTest3 {
	public static void main(String[ ] args) {
		Student1 studentLee = new Student1( );
		studentLee.setStudentName("jiwon");
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName + "studentnumber is" + studentLee.studentID);
		
		Student1 studentSon = new Student1( );
		studentSon.setStudentName("sukyeong");
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName + "studentnumber is" + studentSon.studentID);
	}
}
