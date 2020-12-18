package macjavastudy.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
	private String name;
	private int student_num;
	
	public Student(String name, int student_num ) {
		this.name = name;
		this.student_num = student_num;
	}
	
	String getName() {return name;}
	int getStudent_num() {return student_num;}
}

public class StreamTestWithClass {
	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
				new Student ("A", 101),
				new Student ("B", 102),
				new Student ("C", 103)
				);
		
		Stream<Student> student = list.stream();
		student.forEach(a -> System.out.println("student num :"+a.getStudent_num()));
	}
}
