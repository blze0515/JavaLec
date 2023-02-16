package chap05_class;

import chap05_class.example.Course;

public class _06_parameterConstructor {
	static int c = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course(1, "java", 3);
		
		System.out.println(course1.getcNo());
		System.out.println(course1.getcName());
		System.out.println(course1.getcScore());
		System.out.println();
		
		Course course2 = new Course(2, "C++", 4);
		System.out.println(course2.getcNo());
		System.out.println(course2.getcName());
		System.out.println(course2.getcScore());
		
		/*
		 * int a = 1;
		 * 
		 * for(int i = 0; i < 10; i++) { a++; int b = 0; }
		 * 
		 * System.out.println(b);
		 */
		
		
		
		
	}

}
