package vectors.test;

import vectors.Student;
import vectors.Vector;

public class VectorTest {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		s1.setName("John");
		s2.setName("Sarah");
		s3.setName("Tyrion");
		s4.setName("Grace");
		
		Vector vec = new Vector();
		
		//Add 
		vec.add(s1);
		vec.add(s2);
		vec.add(s3);
		
		System.out.println("\nAdd 3 students: "+ vec);
		
		//Add by position
		vec.add(0, s4);
		
		//method take
		Student student1 = vec.take(0);
		
		System.out.println("\nMethod take: " + student1);
		
		System.out.println("\nchecking contains method: " + vec.contains(s2));
		
		vec.remove(1);
		
		System.out.println("\nposition 1 removed: " + vec);
		
		System.out.println("\nsize of vector: " + vec.size());
		
		
		
		
	}

}
