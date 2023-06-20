package staticex;

public class StudentTest2 {
	public static void naub(String[ ] args) {
		Student1 studentLee = new Student1( );
		studentLee.setStudentName("jiwon");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + "StudentNumber is" + studentLee.studentID);
		
		Student1 studentSon = new Student1( );
		studentSon.setStudentName("sookyeong");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + "StudentNumber is" + studentSon.studentID);
	}
}
