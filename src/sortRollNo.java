import java.util.Comparator;

public class sortRollNo implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// compares in ascending order of rollNo
		return o1.rollno - o2.rollno;
	}

}

