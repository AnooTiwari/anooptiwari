
import java.util.HashMap;

import com.javatutorialhq.java.examples.utilities.Student;

/*
 * Example of Advance use of hashmap
 *
 */

public class User_manager {

	public static void main(String[] args) {

		HashMap<String, Student> map = new HashMap<String, Student>();
		map = init();
		// iterate to all the keys stored on our hashmap
		for (String s : map.keySet()) {
			// print the student id and age
			System.out.println("Student with id number:" + s + " is "
					+ map.get(s).getAge() + " years old");
		}
	}

	private static HashMap<String, Student> init() {
		// initialize our student objects
		Student s1 = new Student(
				"100212554|Gary Valenciano|January 10, 1993|21|BS Math");
		Student s2 = new Student(
				"101292574|Vic Castro|May 10, 1995|18|Mechaninal Engineering");
		Student s3 = new Student(
				"201212444|Joel Uy|February 17, 1994|20|BS Education");
		Student s4 = new Student(
				"172324448|Louise Valenciano|December 10, 1985|29|Medicine");

		// initialize of hashmap
		HashMap<String, Student> map = new HashMap<String, Student>();

		// assign each student id as key and the student objects as values on
		// our hashmap
		map.put(s1.getStudentid(), s1);
		map.put(s2.getStudentid(), s2);
		map.put(s3.getStudentid(), s3);
		map.put(s4.getStudentid(), s4);

		return map;
	}

}
