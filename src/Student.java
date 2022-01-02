
public class Student {
	
  // student object consists of the following fields
	public int rollno;
    public String name;
    public String address;
    
    // Student Constructor

    Student(int rollno, String name, String address) {
    	
        this.rollno = rollno;
        this.name = name;
        this.address = address;

    }
    
    public String toString()
    {
 

        return this.rollno + " " + this.name + " "
            + this.address;
    }
	
    //Getters
    
    public int getRollNo() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
