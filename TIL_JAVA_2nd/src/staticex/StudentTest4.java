package staticex;

public class StudentTest4 {
	public static void main(String[ ] args) {
		Student2 studentLee = new Student2( );
		studentLee.setStudentName("jiwon");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.studentName + "studentNumber is" + studentLee.studentID);
		
		Student2 studentSon = new Student2( );
		studentSon.setStudentName("sukyeong");
		System.out.println(Student2.getSerialNum( ));
		System.out.println(studentSon.studentName + "studentNumber is" + studentSon.studentID);
		}
}
