package staticex;

public class Ex1 {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.studentName = "둘리";
		System.out.println(student1.studentName + "학번 : "+ student1.studentID);
		
		
		Student student2 = new Student();
		student2.studentName = "또치";
		System.out.println(student2.studentName + "학번 : "+ student2.studentID);
		
		System.out.println(Student.count);
		
		}
	}


class Student {
	static int count = 0;
	int studentID;
	String studentName;
	
	public Student() {
		count++;
		studentID = count;
	}
}
