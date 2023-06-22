package staticex;

public class StudentTest1 {
	public static void main(String[ ] args) {
		Student studentLee = new Student( );
		studentLee.setStudentName("jiwon");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student( );
		studentSon.setStudentName("sookyeong");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
