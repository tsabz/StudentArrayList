import java.util.Comparator;

public class sortName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// Sort by Name
		return o1.name.compareTo(o2.name);
	}

}
