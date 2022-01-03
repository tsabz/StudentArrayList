import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StoringArrayList {

	public static void main(String[] args) {
		System.out.println("***************");
		System.out.println("Program Started");
		System.out.println("***************");

	// Student object ArrayList, This will store  
	// that will store 10 student objects in an ArrayList, ArrayList<Student>
        ArrayList<Student>studentArrayList = new ArrayList<Student>();
        
        studentArrayList.add(new Student(44, "Brene Brown", "260 over dr"));
        studentArrayList.add(new Student(23, "Max Jennings", "6500 bennings rd"));
        studentArrayList.add(new Student(65, "Jamal Johnson", "333 bird st"));
        studentArrayList.add(new Student(74, "Emily Wong", "10001 rocker ave"));
        studentArrayList.add(new Student(12, "Geene Stu", "120 bleeker"));
        studentArrayList.add(new Student(39, "Ronny Marco", "444 angurland rd"));
        studentArrayList.add(new Student(36, "Baba Ahmed", "220 over dr"));
        studentArrayList.add(new Student(87, "Rav Patel", "1750 sprint st"));
        studentArrayList.add(new Student(99, "Anita Perez", "50 lafayette rd"));
        studentArrayList.add(new Student(10, "Benny Braun", "183 meadows dr"));
        
        // Unsorted Array
        System.out.println("Unsorted Student List");
        
        
        for (int i = 0; i < studentArrayList.size(); i++)
            System.out.println(studentArrayList.get(i));
        
        // Sorted by Roll Number
        System.out.println("***************");
        System.out.println("Sorted Student List By Roll Number");
        
        Collections.sort(studentArrayList, new sortRollNo());
        for (int i = 0; i < studentArrayList.size(); i++)
        	System.out.println(studentArrayList.get(i));
        
     // Sorted by Name
        System.out.println("***************");
        System.out.println("Sorted Student List By Name");
        
        Collections.sort(studentArrayList, new sortName());
        for (int i = 0; i < studentArrayList.size(); i++)
        	System.out.println(studentArrayList.get(i));
        
	}

}


//References
//https://www.geeksforgeeks.org/comparator-interface-java/
//https://www.geeksforgeeks.org/collections-sort-java-examples/
//https://www.geeksforgeeks.org/java-program-to-sort-an-arraylist/
